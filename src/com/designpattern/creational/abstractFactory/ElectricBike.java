package com.designpattern.creational.abstractFactory;

public class ElectricBike implements Vehicle {

	@Override
	public void getWheels() {
		System.out.println("Inside ElectricBike::getWheels method");
	}

}
