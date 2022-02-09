package com.example.accessmodifers;

public class Bird {

	public void sparrow() {
		woodPecker();
		System.out.println("sparrow");
	}

	private void woodPecker() {
		System.out.println("wood pecker");
	}

	protected void pigeon() {
		System.out.println("pigeon");
	}

	void peacock() {
		System.out.println("peacock");
	}
}
