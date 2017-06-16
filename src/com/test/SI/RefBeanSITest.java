package com.test.SI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefBeanSITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Resource r=new ClassPathResource("com/ntrs/test/appContext.xml");
		BeanFactory factory=new XmlBeanFactory(r);*/
		ApplicationContext context= new ClassPathXmlApplicationContext("com/test/SI/appContextRefBean.xml");
		EmployeeRefBean e=(EmployeeRefBean) context.getBean("empSI1");
		e.show();

	}

}
