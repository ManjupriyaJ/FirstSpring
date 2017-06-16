package com.ntrs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireByTypeTest {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/ntrs/test/appContextAWByType.xml");
		ClassA classA=(ClassA) context.getBean("a");
		classA.display();

	}

}
