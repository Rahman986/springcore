package com.springcore.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstractor {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext(" com/springcore/springcore/ci/ciConfig.xml");
		Person person=(Person)context.getBean("person");
		System.out.println(person);
		
		  Addition add=(Addition)context.getBean("add");
		  add.doSum();
		  
		  
	}

}
