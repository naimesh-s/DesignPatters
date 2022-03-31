package com.designpattern.creational.prototype;

import java.util.List;

public class PrototypePatternDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Vehicle v = new Vehicle();
		v.insertData();
		
		Vehicle vCopy = (Vehicle) v.clone();
		List<String> list = vCopy.getVehicleList();
	    list.add("Honda new Amaze");
	    
	    System.out.println("Original Vehicle >>> "+ v.getVehicleList());
	    System.out.println("Copy of Vehicle >>> "+ vCopy.getVehicleList());
	    System.out.println(list);
	}

}
