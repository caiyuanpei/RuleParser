package com.cathysoft.ruleparser;

import com.cathysoft.ruleparser.jjt.ASTCheckExpression;
import com.cathysoft.ruleparser.jjt.ASTClassList;
import com.cathysoft.ruleparser.jjt.ASTDerivationBodyExpression;
import com.cathysoft.ruleparser.jjt.ASTDerivationExpression;
import com.cathysoft.ruleparser.jjt.ASTDomainExpression;
import com.cathysoft.ruleparser.jjt.ASTEmptyFunction;
import com.cathysoft.ruleparser.jjt.ASTExpressionRoot;
import com.cathysoft.ruleparser.jjt.ASTFunctionExpression;
import com.cathysoft.ruleparser.jjt.ASTLeftFunction;
import com.cathysoft.ruleparser.jjt.ASTLogicalBodyExpression;
import com.cathysoft.ruleparser.jjt.ASTLogicalExpression;
import com.cathysoft.ruleparser.jjt.ASTMidFunction;
import com.cathysoft.ruleparser.jjt.ASTNotEmptyExpression;
import com.cathysoft.ruleparser.jjt.ASTOperatorExpression;
import com.cathysoft.ruleparser.jjt.ASTRightFunction;
import com.cathysoft.ruleparser.jjt.ASTSizeFunction;
import com.cathysoft.ruleparser.jjt.ParserVisitor;
import com.cathysoft.ruleparser.jjt.SimpleNode;

public class RuleScriptExecutor implements ParserVisitor {

	@Override
	public Object visit(SimpleNode node, Object data) {
		data = node.childrenAccept(this, data);
		return data;
	}

	@Override
	public Object visit(ASTExpressionRoot node, Object data) {
		data = node.childrenAccept(this, data);
		return data;
	}

	@Override
	public Object visit(ASTClassList node, Object data) {
		data = node.childrenAccept(this, data);
		return data;
	}

	@Override
	public Object visit(ASTNotEmptyExpression node, Object data) {
		data = node.childrenAccept(this, data);
		return data;
	}

	@Override
	public Object visit(ASTCheckExpression node, Object data) {
		data = node.childrenAccept(this, data);
		return data;
	}

	@Override
	public Object visit(ASTLogicalExpression node, Object data) {
		data = node.childrenAccept(this, data);
		return data;
	}

	@Override
	public Object visit(ASTDerivationExpression node, Object data) {
		data = node.childrenAccept(this, data);
		return data;
	}

	@Override
	public Object visit(ASTLogicalBodyExpression node, Object data) {
		data = node.childrenAccept(this, data);
		return data;
	}

	@Override
	public Object visit(ASTDerivationBodyExpression node, Object data) {
		data = node.childrenAccept(this, data);
		return data;
	}

	@Override
	public Object visit(ASTOperatorExpression node, Object data) {
		data = node.childrenAccept(this, data);
		return data;
	}

	@Override
	public Object visit(ASTDomainExpression node, Object data) {
		data = node.childrenAccept(this, data);
		return data;
	}

	@Override
	public Object visit(ASTFunctionExpression node, Object data) {
		data = node.childrenAccept(this, data);
		return data;
	}

	@Override
	public Object visit(ASTEmptyFunction node, Object data) {
		data = node.childrenAccept(this, data);
		return data;
	}

	@Override
	public Object visit(ASTSizeFunction node, Object data) {
		data = node.childrenAccept(this, data);
		return data;
	}

	@Override
	public Object visit(ASTMidFunction node, Object data) {
		System.out.println("VISITING MID FUNCTON NODE");
		System.out.println(data);
		System.out.println("DOMAIN: "+node.getDomain());
		System.out.println("FIELD:  "+node.getField());
		System.out.println("START:  "+node.getStart());
		System.out.println("LENGTH: "+node.getLength());
		
		
		data = node.childrenAccept(this, data);
		return data;
	}

	@Override
	public Object visit(ASTRightFunction node, Object data) {
		data = node.childrenAccept(this, data);
		return data;
	}

	@Override
	public Object visit(ASTLeftFunction node, Object data) {
		System.out.println("VISITING LEFT FUNCTON NODE");
		System.out.println(data);
		System.out.println("DOMAIN: "+node.getDomain());
		System.out.println("FIELD:  "+node.getField());
		System.out.println("LENGTH: "+node.getLength());
		
		
		data = node.childrenAccept(this, data);
		return data;
	}

}
