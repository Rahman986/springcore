package com.springcore.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Javaconfig {
	
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean(name= {"student","teamp","con"})
	public Student getStudent() {
    Student student=new Student(getSamosa());
    return student;
	}

}
