package com.predicate;

import java.util.function.Predicate;

public class PredicateExample1 { /*
									 * implements Predicate<Integer> {
									 * 
									 * @Override public boolean test(Integer t) { if(t%2==0) { return true; } return
									 * false; }
									 */

	public static void main(String[] args) {
		/*
		 * PredicateExample1 predicateExample = new PredicateExample1(); boolean result
		 * = predicateExample.test(3); System.out.println(result);
		 */

//		Predicate<Integer> predicateExample1 = (t) -> {
//			if (t % 2 == 0) {
//				return true;
//			}
//			return false;
//		};
//		predicateExample1.test(4);

		Predicate<Integer> predicateExample = t -> t % 2 == 0;
		boolean r = predicateExample.test(2);
		boolean r1 = predicateExample.test(3);
		System.out.println(r);
		System.out.println(r1);

	}

}
