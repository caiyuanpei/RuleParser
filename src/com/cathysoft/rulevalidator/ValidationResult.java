package com.cathysoft.rulevalidator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * 
 * @author caiyp
 * @version 1.0
 *
 */
public class ValidationResult {

	private static Logger logger = LoggerFactory.getLogger(ValidationResult.class);
	
	public enum Level {
		NORMAL, SERIOUS
	}
	
	private boolean valid = true;
	
	public void error(Level level, String field, String message) {
		this.valid = false;
		
		logger.error(level.name()+": "+message);
	}

	public boolean isValid() {
		return valid;
	}
	
}
