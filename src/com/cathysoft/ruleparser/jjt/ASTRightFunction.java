/* Generated By:JJTree: Do not edit this line. ASTRightFunction.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.cathysoft.ruleparser.jjt;

public class ASTRightFunction extends SimpleNode {
	
	private ASTPath path;
	private int length;
	
	public ASTRightFunction(int id) {
		super(id);
	}

	public ASTRightFunction(Parser p, int id) {
		super(p, id);
	}

	/** Accept the visitor. **/
	public Object jjtAccept(ParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}

	public ASTPath getPath() {
		return path;
	}

	public void setPath(ASTPath path) {
		this.path = path;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}
/*
 * JavaCC - OriginalChecksum=31949a4be0d6a933b72421f0497c855b (do not edit this
 * line)
 */
