package com.designpattern.creational.factory;

public class Bike extends Vehicle{
	
	public Bike(int wheels) {
		this.wheels = wheels;
	}
	
	@Override
	public int getWheels() {
		return this.wheels;
	}

}
