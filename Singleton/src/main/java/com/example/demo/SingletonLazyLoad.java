package com.example.demo;

public class SingletonLazyLoad {

	private static SingletonLazyLoad instance = null;

	private SingletonLazyLoad() {

	}

	public static SingletonLazyLoad getInstance() {
		if (instance == null)
			instance = new SingletonLazyLoad();
		return instance;
	}
	
	public void someMethod() {
		System.out.println("Hello from " + this.getClass().getName());
	}

}
