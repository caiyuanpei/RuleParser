/* Generated By:JJTree: Do not edit this line. ASTNotEmptyExpression.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.cathysoft.ruleparser.jjt;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ASTNotEmptyExpression extends SimpleNode {
	
	private boolean allbut = false;
	
	private List<ASTPath> paths = new LinkedList<ASTPath>();
	
	private Map<String, Set<String>> pathMap = new HashMap<String, Set<String>>();
	
	public ASTNotEmptyExpression(int id) {
		super(id);
	}

	public ASTNotEmptyExpression(Parser p, int id) {
		super(p, id);
	}

	/** Accept the visitor. **/
	public Object jjtAccept(ParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}

	public boolean isAllbut() {
		return allbut;
	}

	public void setAllbut(boolean allbut) {
		this.allbut = allbut;
	}

	public List<ASTPath> getPaths() {
		return paths;
	}

	public void setPaths(List<ASTPath> paths) {
		this.paths = paths;
	}
	
	public Map<String, Set<String>> getPathMap() {
		return pathMap;
	}

	public void setPathMap(Map<String, Set<String>> pathMap) {
		this.pathMap = pathMap;
	}

	public void addPath(ASTPath path) {
		this.paths.add(path);
		
		if(pathMap.containsKey(path.getDomain())) {
			pathMap.get(path.getDomain()).add(path.getField());
		} else {
			Set<String> set = new HashSet<String>();
			set.add(path.getField());
			pathMap.put(path.getDomain(), set);
		}
	}
}
/*
 * JavaCC - OriginalChecksum=7e79ac9986ce20f720eeebcdb33c4d84 (do not edit this
 * line)
 */
