package com.springcore.springcore.spel;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/springcore/spel/stereoconfig.xml");
		  Demo demo=(Demo) context.getBean("demo",Demo.class);
		  System.out.println(demo);
		  
		/*  SpelExpressionParser teamp=new SpelExpressionParser();
		Expression ex=teamp.parseExpression("#{2+4}");
		System.out.println(ex.getValue());*/
	}

}
