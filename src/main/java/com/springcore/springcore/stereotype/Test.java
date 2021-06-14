package com.springcore.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/springcore/stereotype/stereoconfig.xml");
		Student student=(Student)context.getBean("ob",Student.class);
		//System.out.println(student.hashCode());
		
		/*System.out.println(student);
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass().getName());*/
		Student student1=(Student)context.getBean("ob",Student.class);
		//System.out.println(student1.hashCode());
		
		Teacher t1=(Teacher)context.getBean("teacher",Teacher.class);
		Teacher t2=(Teacher)context.getBean("teacher",Teacher.class);
		System.out.println(t1.hashCode()+"\n"+t2.hashCode());
	}

}
