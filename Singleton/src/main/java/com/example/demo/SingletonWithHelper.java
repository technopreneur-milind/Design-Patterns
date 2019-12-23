package com.example.demo;

public class SingletonWithHelper {

	private SingletonWithHelper() {
	}

	private static class SingletonHelper {
		private static final SingletonWithHelper singletonWithHelper = new SingletonWithHelper();
	}

	public static SingletonWithHelper getInstance() {
		return SingletonHelper.singletonWithHelper;
	}
	
	public void someMethod() {
		System.out.println("Hello from " + this.getClass().getName());
	}

}
