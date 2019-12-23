package com.example.demo;

public enum SingletonEnum {
	INSTANCE;
	
	//....
	
	public void someMethod() {
		System.out.println("Hello from " + this.getClass().getName());
	}

}
