package com.designpattern.creational.abstractFactory;

public class TestAbstractFactoryMain {

	public static void main(String[] args) {
		 AbstractFactory abstractFactory = FactoryProducer.getFactory("MOTOR_VEHICLES");
		 Vehicle vehicle = (Vehicle) abstractFactory.getVehicle("MOTORCAR");
		 vehicle.getWheels();
		
	}

}
