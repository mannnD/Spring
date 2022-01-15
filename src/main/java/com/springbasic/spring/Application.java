package com.springbasic.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//Application Context- maintains the beans


		ApplicationContext applicationContext= SpringApplication.run(Application.class, args);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch.binarySearch(new int[] {12,4,6}, 3));
	}

}
