package com.tnsif.hinheritance;

public class Nissan extends Car {
	

	public Nissan(String model, int year, double price) {
		super(model, year, price);
	}
	public String getBrandName() {
		return "Nissan";
	}
}
