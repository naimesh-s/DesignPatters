package com.designpattern.creational.abstractFactory;

public class ElectricCar implements Vehicle {

	@Override
	public void getWheels() {
		System.out.println("Inside ElectricCar::getWheels method");
	}

}
