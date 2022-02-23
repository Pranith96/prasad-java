package com.in.block;

public class Resourse {

	void printThread(int num) {
		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i * num);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Hi");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("welcome");

	}
}
