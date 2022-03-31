package com.designpattern.creational.factory;

public class Car extends Vehicle{

	public Car(int wheels) {
		this.wheels = wheels;
	}
	
	@Override
	public int getWheels() {
		return this.wheels;
	}

}
