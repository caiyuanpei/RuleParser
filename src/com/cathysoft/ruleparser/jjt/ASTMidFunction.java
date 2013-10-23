/* Generated By:JJTree: Do not edit this line. ASTMidFunction.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.cathysoft.ruleparser.jjt;

public class ASTMidFunction extends SimpleNode {
	
	private ASTPath path;
	private int start;
	private int length;
	
	
	public ASTMidFunction(int id) {
		super(id);
	}

	public ASTMidFunction(Parser p, int id) {
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

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}
/*
 * JavaCC - OriginalChecksum=872c28f7d4c0c766a7b39ea9c19299e0 (do not edit this
 * line)
 */
