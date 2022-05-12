package com.designpattern.creational.singleton;

import java.io.ObjectStreamException;

public class SingletonLazy {

	private static SingletonLazy INSTANCE;

	private SingletonLazy() {
		
		if(INSTANCE != null) {
			throw new IllegalStateException("Singleton Instance Already Created");
		}
	}

	public static SingletonLazy getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingletonLazy();
		}
		return INSTANCE;
	}

	private Object readResolve() throws ObjectStreamException {
		return INSTANCE;
	}

	private Object writeReplace() throws ObjectStreamException {
		return INSTANCE;
	}

	public Object clone() throws CloneNotSupportedException {
		// return INSTANCE
		throw new CloneNotSupportedException();
	}

}
