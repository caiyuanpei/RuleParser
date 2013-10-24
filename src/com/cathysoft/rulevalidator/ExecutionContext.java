package com.cathysoft.rulevalidator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 软件执行上下文
 * 
 * @author caiyp
 *
 */
public class ExecutionContext {
	
	private Set<String> signatures = new HashSet<String>();
	
	private Map<String, Object> context = new HashMap<String, Object>();
	
	public void add(Object object) {
		String signature = object.getClass().getName();
		String className = object.getClass().getSimpleName();
		
		if(signatures.contains(signature)) return;
		
		signatures.add(signature);
		context.put(className, object);
	}
}
