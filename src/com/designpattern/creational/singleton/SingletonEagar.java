package com.designpattern.creational.singleton;

public class SingletonEagar {
	
	private static SingletonEagar instance = new SingletonEagar();
	
	private SingletonEagar() {
		
	}
	
	public static SingletonEagar getInstance() {
		return instance;
	}
}
