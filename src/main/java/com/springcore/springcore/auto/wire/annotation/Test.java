package com.springcore.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/springcore/auto/wire/config.xml");
	Emp em=(Emp)context.getBean("emp1",Emp.class);
	System.out.println(em);
	}
	
}
