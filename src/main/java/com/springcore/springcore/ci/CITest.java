package com.springcore.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CITest {
	public static void main(String[] args) {
		ApplicationContext contex=new ClassPathXmlApplicationContext(" com/springcore/springcore/ci/ciConfig.xml");
		Person p=(Person)contex.getBean("person");
		System.out.println(p);
	}

}
