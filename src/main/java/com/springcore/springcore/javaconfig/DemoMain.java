package com.springcore.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class DemoMain {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Javaconfig.class);
		Student student=(Student)context.getBean("con",Student.class);
		System.out.println(student);
		student.reading();
		
	}

}
