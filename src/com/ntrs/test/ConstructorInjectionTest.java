package com.ntrs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Resource r=new ClassPathResource("com/ntrs/test/appContext.xml");
		BeanFactory factory=new XmlBeanFactory(r);*/
		ApplicationContext context= new ClassPathXmlApplicationContext("com/ntrs/test/appContext.xml");
		Employee e=(Employee) context.getBean("emp");
		e.show();

	}

}
