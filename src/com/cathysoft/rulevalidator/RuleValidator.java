package com.cathysoft.rulevalidator;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cathysoft.ruleparser.jjt.ASTCheckExpression;
import com.cathysoft.ruleparser.jjt.ASTContextClassList;
import com.cathysoft.ruleparser.jjt.ASTExpressionRoot;
import com.cathysoft.ruleparser.jjt.ASTNotEmptyExpression;
import com.cathysoft.ruleparser.jjt.ASTPath;
import com.cathysoft.ruleparser.jjt.ASTSignature;
import com.cathysoft.ruleparser.jjt.Node;
import com.cathysoft.ruleparser.jjt.ParseException;
import com.cathysoft.ruleparser.jjt.Parser;
import com.cathysoft.rulevalidator.ValidationResult.Level;

/**
 * 规则检验器
 * 
 * @author caiyp
 *
 */
public class RuleValidator {
	
	private static Logger logger = LoggerFactory.getLogger(RuleValidator.class);
	
	private ASTExpressionRoot root = null;
	
	/**
	 * Constructor Here
	 */
	protected RuleValidator() {
		
	}
	
	/**
	 * 使用规则文件创建一个Validator实例，这一实例是可以被复用的，通过validate方法查询。
	 * 
	 * @param ruleFile
	 * @return
	 */
	public static RuleValidator buildValidator(InputStream ruleFile) {
		RuleValidator validator;
		
		Parser parser = new Parser(ruleFile);
		try {
			ASTExpressionRoot root = parser.parse();
			
			validator = new RuleValidator();
			validator.root = root;
			
		} catch (ParseException e) {
			logger.error("Error Occurred When Parsing Rule File.", e);
			throw new RuntimeException(e);
		}
		return validator;
	}
	
	public ValidationResult validate(final ExecutionContext context) {
		
		ValidationResult result = new ValidationResult();
		
		top:
		//检查ExectionContext中是否含有指定签名的类
		for(int i=0; i<root.jjtGetNumChildren(); i++) {
			Node node = root.jjtGetChild(i);
			
			if(node instanceof ASTContextClassList) {
				ASTContextClassList ccl = (ASTContextClassList) node;
				for(int j=0; j<ccl.jjtGetNumChildren(); j++) {
					Node cclChild = ccl.jjtGetChild(j);
					if(!(cclChild instanceof ASTSignature)) {
						throw new IllegalStateException("Context Class List Cannot Contains Un-Signature Tokens.");
					}
					ASTSignature signature = (ASTSignature) cclChild;
					String signatureLiteral = signature.getSignature();
					
					if(!context.containsClass(signatureLiteral)) {
						result.error(Level.SERIOUS, "*", "Context Not Contains All Class Need.");
						break top;
					}
					
				}
				
			} else {
				continue;
			}
		}
		
		//数据检验
		for(int i=0; i<root.jjtGetNumChildren(); i++) {
			Node node = root.jjtGetChild(i);
			
			if(node instanceof ASTNotEmptyExpression) {
				validateNotEmptyExpression(context, (ASTNotEmptyExpression)node, result);
			} else if(node instanceof ASTCheckExpression) {
				
				
			}
		}
		
		return result;
	}

	private void validateNotEmptyExpression(ExecutionContext context, ASTNotEmptyExpression exp, ValidationResult result) {
		boolean allbut = exp.isAllbut();
		ASTPath[] paths = new ASTPath[exp.jjtGetNumChildren()];
		for(int i=0; i<exp.jjtGetNumChildren(); i++) paths[i] = (ASTPath) exp.jjtGetChild(i);
		
		if(allbut) {
			Map<String, Set<String>> pathMap = exp.getPathMap();
			Set<String> domains = pathMap.keySet();
			//build check map
			Map<String, Set<String>> checkMap = new HashMap<String, Set<String>>();
			for(String domain : domains) {
				String signature = context.getSignature(domain);
				@SuppressWarnings("rawtypes")
				Class clazz = null;
				try {
					clazz = Class.forName(signature);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				checkMap.put(domain, Utils.getFieldsExcept(clazz, pathMap.get(domain)));
			}
			//check
			for(Entry<String, Set<String>> entry : checkMap.entrySet()) {
				for(String fieldName : entry.getValue()) {
					Object value = Utils.getValue(context.get(entry.getKey()), fieldName);
					if(value == null)
						result.error(Level.NORMAL, fieldName, "Field '"+fieldName+"' Is Empty.");
					if(value instanceof String && ((String)value).trim().length()==0)
						result.error(Level.NORMAL, fieldName, "Field '"+fieldName+"' Is Empty.");
				}
			}
		} else {
			
		}
		
	}
}
