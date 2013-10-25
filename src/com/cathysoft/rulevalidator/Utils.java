package com.cathysoft.rulevalidator;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class Utils {

	public static Set<String> getFieldsExcept(
			@SuppressWarnings("rawtypes") Class clazz, Set<String> exceptions) {
		
		Field[] fields = clazz.getDeclaredFields();
		
		Set<String> set = new HashSet<String>();
		
		for(Field f : fields) {
			if(exceptions.contains(f.getName())) continue;
			
			set.add(f.getName());
		}
		return set;
	}
	
	public static Object getValue(Object obj, String fieldName) {
		try {
			@SuppressWarnings("rawtypes")
			Class clazz = obj.getClass();
			@SuppressWarnings("unchecked")
			Method method = clazz.getDeclaredMethod("get"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1));
			return method.invoke(obj);
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
