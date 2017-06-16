package com.ntrs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionInherit {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/ntrs/test/appContextInherit.xml");
		EmployeeInherit e=(EmployeeInherit) context.getBean("emp2");
		e.show();
	}

}
