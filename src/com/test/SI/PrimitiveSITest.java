package com.test.SI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrimitiveSITest {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/test/SI/appContextPrimSI.xml");
		EmployeePrimSI e=(EmployeePrimSI) context.getBean("empSI");
		e.show();

	}

}
