package com.in.staticsynchronized;

public class Thread2 extends Thread {

	Resourse resourse;

	public Thread2(Resourse resourse) {
		this.resourse = resourse;
	}

	public void run() {
		resourse.printThread(10);
	}
}
