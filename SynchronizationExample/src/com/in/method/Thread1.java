package com.in.method;

public class Thread1 extends Thread {

	Resourse resourse;

	public Thread1(Resourse resourse) {
		this.resourse = resourse;
	}

	public void run() {
		resourse.printThread(5);
	}
}
