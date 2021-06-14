package com.springcore.springcore.javaconfig;



public class Student {
	
	private Samosa samosa;
	
	
	
public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}


public Samosa getSamosa() {
		return samosa;
	}


	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}


public void reading() {
	System.out.println("student is reading book");
	samosa.display();
	
}
}
