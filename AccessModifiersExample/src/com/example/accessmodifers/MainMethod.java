package com.example.accessmodifers;

import com.example.demo.Bird1;

public class MainMethod {

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.peacock();
		bird.pigeon();
		bird.sparrow();

		Bird1 bird1 = new Bird1();
		bird1.parrot();
	}
}
