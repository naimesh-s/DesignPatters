package com.designpattern.creational.abstractFactory;

public class MotorVehicleFactory extends AbstractFactory {

	@Override
	public Vehicle getVehicle(String vehicleType) {
		if (vehicleType.equalsIgnoreCase("MOTORCAR")) {
			return new MotorCar();
		} else if (vehicleType.equalsIgnoreCase("MOTORBIKE")) {
			return new MotorBike();
		}
		return null;
	}

}
