package com.example.demo;

import java.io.Serializable;

public class SingletonSerializable implements Serializable {

	private static final long serialVersionUID = 1L;

	private SingletonSerializable() {
	}

	private static class SingletonHelper {
		private static final SingletonSerializable singletonWithHelper = new SingletonSerializable();
	}

	public static SingletonSerializable getInstance() {
		return SingletonHelper.singletonWithHelper;
	}
	
	protected Object readResolve() {
	    return getInstance();
	}
	public void someMethod() {
		System.out.println("Hello from " + this.getClass().getName());
	}

}
