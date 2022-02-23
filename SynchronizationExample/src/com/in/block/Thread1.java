package com.in.block;

public class Thread1 extends Thread {

	Resourse resourse;

	public Thread1(Resourse resourse) {
		this.resourse = resourse;
	}

	public void run() {
		resourse.printThread(5);
	}
}
