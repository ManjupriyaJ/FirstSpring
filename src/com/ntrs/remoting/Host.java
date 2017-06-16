package com.ntrs.remoting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Host{  
public static void main(String[] args){  
ApplicationContext context = new ClassPathXmlApplicationContext("com/ntrs/remoting/appContextRMI.xml");  
System.out.println("Waiting for requests");  
}  
}  
