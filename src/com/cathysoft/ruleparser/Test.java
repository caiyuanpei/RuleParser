package com.cathysoft.ruleparser;

import java.io.InputStream;

import com.cathysoft.ruleparser.jjt.ASTExpressionRoot;
import com.cathysoft.ruleparser.jjt.Parser;
import com.cathysoft.ruleparser.jjt.ParserVisitor;

public class Test {

	public static void main(String[] args) throws Exception {

		InputStream is = ClassLoader.getSystemResourceAsStream("example1.txt");
		
		Parser parser = new Parser(is);
		ASTExpressionRoot root = parser.parse();
		
		ParserVisitor visitor = new RuleScriptExecutor();
		root.jjtAccept(visitor, null);
		
		is.close();
	}

}
