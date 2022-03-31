package com.designpattern.creational.factory;

public class VehicleFactory {

	public static Vehicle getInstance(String type, int wheels) {
		if(type == VehicleType.CAR) {
			return new Car(wheels);
		}else if(type == VehicleType.BIKE) {
			return new Bike(wheels);
		}
		return null;
	}
	
	public static void main(String[] args) {
		Vehicle v = new VehicleFactory().getInstance("car", 4);
		System.out.println(v);
	}

}
