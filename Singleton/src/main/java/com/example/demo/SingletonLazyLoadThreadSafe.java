package com.example.demo;

public class SingletonLazyLoadThreadSafe {

	private static SingletonLazyLoadThreadSafe instance = null;

	private SingletonLazyLoadThreadSafe() {

	}

	public static SingletonLazyLoadThreadSafe getInstance() {
		synchronized (SingletonLazyLoadThreadSafe.class) {
			if (instance == null)
				instance = new SingletonLazyLoadThreadSafe();
		}
		return instance;
	}
	
	public void someMethod() {
		System.out.println("Hello from " + this.getClass().getName());
	}

}
