package com.in.method;

public class Resourse {

	synchronized void printThread(int num) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i * num);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
