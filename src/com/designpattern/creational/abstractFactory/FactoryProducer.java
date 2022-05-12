package com.designpattern.creational.abstractFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String factoryType) {
		if(factoryType.equalsIgnoreCase("ELECTRIC_VEHICLES")) {
			return new ElectricVehicleFactory();
		}else if(factoryType.equalsIgnoreCase("MOTOR_VEHICLES")) {
			return new MotorVehicleFactory();
		}
		return null;
	}
}
