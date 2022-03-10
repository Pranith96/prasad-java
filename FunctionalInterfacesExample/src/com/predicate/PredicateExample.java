package com.predicate;

import java.util.function.Predicate;

public class PredicateExample implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		if(t%2==0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		PredicateExample predicateExample = new PredicateExample();
		boolean result = predicateExample.test(3);
		System.out.println(result);
	}

}
