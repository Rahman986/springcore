package com.springcore.springcore.lifecycle;

public class Samosa {
	private double price;
	

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Samosa(double price) {
		super();
		this.price = price;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
public void hey() {
	System.out.println("Inside int method hey I am going");
}
public void buy() {
	System.out.println("inside destroy method this is destroy");
}

}
