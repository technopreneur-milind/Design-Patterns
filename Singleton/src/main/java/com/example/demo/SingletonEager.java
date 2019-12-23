package com.example.demo;

public class SingletonEager {

	private static SingletonEager instance = new SingletonEager();

	private SingletonEager() {

	}

	public static SingletonEager getInstance() {
		return instance;
	}

	public void someMethod() {
		System.out.println("Hello from " + this.getClass().getName());
	}

}
