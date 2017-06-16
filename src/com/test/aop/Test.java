package com.test.aop;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Test{  
   public static void main(String[] args){  
       ApplicationContext context = new ClassPathXmlApplicationContext("com/test/aop/applicationContextAOP.xml");  
       Operation e = (Operation) context.getBean("opBean");  
        System.out.println("calling msg...");  
       e.msg();  
       System.out.println("calling m...");  
       e.m();  
        System.out.println("calling k1...");  
       e.k1();  
       System.out.println("calling ka...");  
       e.ka();  
       System.out.println("calling kan...");  
       e.kan(17);  
   }  
}  

