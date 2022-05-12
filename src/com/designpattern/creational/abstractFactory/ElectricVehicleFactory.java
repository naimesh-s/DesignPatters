package com.designpattern.creational.abstractFactory;

public class ElectricVehicleFactory extends AbstractFactory {

	@Override
	public Vehicle getVehicle(String vehicleType) {
		if (vehicleType.equalsIgnoreCase("ELECTRICCAR")) {
			return new ElectricCar();
		} else if (vehicleType.equalsIgnoreCase("ELECTRICBIKE")) {
			return new ElectricBike();
		}
		return null;
	}

}
