package com.springcore.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/springcore/lifecycle/lifecycleonfig.xml");
	
	//registering shutdwon hook
	context.registerShutdownHook();
	/*Samosa sa=(Samosa)context.getBean("samosa");
	System.out.println(sa);
	
	System.out.println("******************************");
	Pepsi p=(Pepsi)context.getBean("pep");
	System.out.println(p);*/
	Example example=(Example)context.getBean("exmple");
	System.out.println(example);
	
}
}
