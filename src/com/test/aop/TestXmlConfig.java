package com.test.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXmlConfig {
	public static void main(String[] args){  
	       ApplicationContext context = new ClassPathXmlApplicationContext("com/test/aop/applicationContextAOPXmlConfig.xml");  
	       OperationXmlConfig e = (OperationXmlConfig) context.getBean("opBean");  
	       System.out.println("calling msg...");  
	        e.msg();  
	       System.out.println("calling m...");  
	        e.m();  
	       System.out.println("calling k...");  
	       e.k();  
		   }  

}
