package com.designpattern.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonBreakerByDeserialization {

	public static void main(String[] args) {
		SingletonLazy obj1 = SingletonLazy.getInstance();
		SingletonLazy obj2 = null;
		try {
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\naimesh.shah\\Desktop\\pesonal\\singleton.txt"));
			outputStream.writeObject(obj1);

			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\naimesh.shah\\Desktop\\pesonal\\singleton.txt"));
			obj2 = (SingletonLazy) inputStream.readObject();
			
			System.out.println("obj1 >> "+obj1);
			System.out.println("obj2 >> "+obj2);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {

		}

	}

}
