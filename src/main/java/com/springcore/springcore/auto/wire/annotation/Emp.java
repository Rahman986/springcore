package com.springcore.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("address12")
	private Address address;
	

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address getAddress() {
		return address;
	}

 //@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	//@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
	}


	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	

	
	

}
