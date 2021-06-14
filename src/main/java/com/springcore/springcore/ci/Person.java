package com.springcore.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certi cert;
	private List<String>list;
	
	public Person(String name, int personId,Certi cert,List<String> list) {
		
		this.name = name;
		this.personId = personId;
		this.cert=cert;
		this.list=list;
	}

	@Override
	public String toString() {
		return this.name+":"+this.personId+":"+this.cert.name;
	}
	
	

}
