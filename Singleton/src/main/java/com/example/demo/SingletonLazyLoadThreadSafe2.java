package com.example.demo;

public class SingletonLazyLoadThreadSafe2 {

	private static SingletonLazyLoadThreadSafe2 instance = null;

	private SingletonLazyLoadThreadSafe2() {

	}

	public static SingletonLazyLoadThreadSafe2 getInstance() {
		if (instance == null) {
			synchronized (SingletonLazyLoadThreadSafe2.class) {
				if (instance == null)
					instance = new SingletonLazyLoadThreadSafe2();
			}
		}
		return instance;
	}
	
	public void someMethod() {
		System.out.println("Hello from " + this.getClass().getName());
	}

}
