package com.cathysoft.phdeers;

import java.io.InputStream;

import com.cathysoft.phdeers.domains.Roles;
import com.cathysoft.phdeers.domains.User;
import com.cathysoft.rulevalidator.ExecutionContext;
import com.cathysoft.rulevalidator.RuleValidator;
import com.cathysoft.rulevalidator.ValidationResult;

public class RuleValidateTest{

	public static void main(String[] args) throws Exception {
		User user = new User();
		
		user.setUsername("220202198402020911");
		user.setPassword("123");
		user.setName("蔡元沛");
		user.setQuestion("-");
		user.setAnswer("-");
		user.setEmail("caiyuanpei@vip.qq.com");
		user.setRoles(Roles.GKZK_EXAMINEE);
		
		ExecutionContext context = new ExecutionContext();
		context.add(user);
		
		InputStream rule = ClassLoader.getSystemResourceAsStream("user.rule");
		
		RuleValidator validator = RuleValidator.buildValidator(rule);
		
		ValidationResult result = validator.validate(context);
		
		System.out.println(result.isValid());
		
	}

}
