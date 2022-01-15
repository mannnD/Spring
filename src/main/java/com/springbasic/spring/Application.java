package com.springbasic.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		System.out.println(binarySearch.binarySearch(new int[] {12,4,6}, 3));
	}

}
