package com.designpattern.creational.singleton;

import java.lang.reflect.Constructor;

/**
 * By using reflection we can break the Singleton object creation. 
 * To prevent this we have to throw exception from Singleton class(in this case SingletonSynchronizedBlock.class) constructor if instance contains object.
 * @author naimesh.shah
 *
 */
public class SingletonBreakerByReflection {

	public static void main(String[] args) {
		SingletonLazy obj1 = SingletonLazy.getInstance();
		SingletonLazy obj2 = null;
		try {
			Constructor<SingletonLazy> constructor = SingletonLazy.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			obj2 = (SingletonLazy) constructor.newInstance();
			
		}catch(Exception ex) {
			System.out.println();
			ex.printStackTrace();
		}
		System.out.println("Object 1 >> "+ obj1);
		System.out.println("Object 2 >> "+ obj2);
	}

}
