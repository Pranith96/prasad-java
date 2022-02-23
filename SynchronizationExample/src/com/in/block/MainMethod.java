package com.in.block;

public class MainMethod {

	public static void main(String[] args) {
		Resourse re = new Resourse();
		Thread1 thread1 = new Thread1(re);
		Thread2 thread2 = new Thread2(re);
		thread1.start();
		thread2.start();
	}
}
