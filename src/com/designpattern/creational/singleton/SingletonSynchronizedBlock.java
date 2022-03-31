package com.designpattern.creational.singleton;

public class SingletonSynchronizedBlock {

private static SingletonSynchronizedBlock instance;
	
	private SingletonSynchronizedBlock() {}
	
	public static SingletonSynchronizedBlock getInstance() {
		synchronized (SingletonSynchronizedBlock.class) {
			if (instance == null) {
				instance = new SingletonSynchronizedBlock();
			}
		}
		return instance;
	}
}
