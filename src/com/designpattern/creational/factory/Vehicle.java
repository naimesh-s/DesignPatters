package com.designpattern.creational.factory;

public abstract class Vehicle {
	
	int wheels;
	
	public abstract int getWheels();
	
	@Override
	public String toString() {
		return "Vehicle has number of wheels : "+this.getWheels();
	}
}
