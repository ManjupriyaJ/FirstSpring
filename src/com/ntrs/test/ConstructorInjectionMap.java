package com.ntrs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionMap {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/ntrs/test/appContextMap.xml");
		QuestionCIMap q=(QuestionCIMap) context.getBean("forumMap");
		q.displayInfo();
	}

}
