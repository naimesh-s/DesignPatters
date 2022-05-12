package com.designpattern.creational.singleton;

public class TestSingleton {

	public static void main(String[] args) throws InterruptedException {
		Runnable r = ()->{
			for(int i=0; i<5; i++) {
				System.out.println("Child thread running...");
			}
			SingletonSynchronizedBlock s1 = SingletonSynchronizedBlock.getInstance();
			System.out.println(s1);
		};
		
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<5; i++) {
			System.out.println("Main thread running...");
		}
		SingletonSynchronizedBlock s2 = SingletonSynchronizedBlock.getInstance();
		System.out.println(s2);
		
	}
}
