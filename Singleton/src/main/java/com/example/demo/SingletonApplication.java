package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingletonApplication.class, args);
		SingletonEager.getInstance().someMethod();
		SingletonLazyLoad.getInstance().someMethod();
		SingletonLazyLoadThreadSafe.getInstance().someMethod();
		SingletonLazyLoadThreadSafe2.getInstance().someMethod();
		SingletonWithHelper.getInstance().someMethod();
		SingletonEnum.INSTANCE.someMethod();
		SingletonSerializable.getInstance().someMethod();
	}

}
