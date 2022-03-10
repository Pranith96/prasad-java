package com.userdefined;

public class MainMethod {

	public static void main(String[] args) {
		/*
		 * Addition ad = new AdditionImpl(); ad.add();
		 */

		Addition ad1 = () -> System.out.println("Add");
		ad1.add();

		Subtraction sb = (a, b, c) -> {
			int d = a + b;
			int e = d * c;
			System.out.println(e);
		};
		sb.sub(5, 5, 5);

		Addition2 ad3 = (a, b, c) -> {
			int d = a + b;
			int e = d * c;
			return e;
		};
		int result = ad3.add(5, 5, 5);
		System.out.println(result);
	}
}
