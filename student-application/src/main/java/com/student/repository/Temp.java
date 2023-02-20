package com.student.repository;

import java.util.ArrayDeque;
import java.util.Deque;

public class Temp {

	public static void main(String[] args) {
//
//		int e = 0;
//		int od = 0;
//		for( int i = 0;i<5;i++) {
//			if(i%2==0) {
//				e+=2;
//				System.out.println(i+1 +"even");
//			}
//			else {
//				od += 2;
//				System.out.println(i+1 +"odd");
//
//			}
//		}
//		System.out.println(Math.max(e,od));
//
////	}
//		Integer i = 5;
//		System.out.println(i=null);
//		System.out.println(i.toString());
//		List<> l = new ArrayList<>();
//		try {
//			foo();
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//	}
//
//	private static void foo() throws Exception {
//
//		throw new Exception("foo");
//	}
		
		Deque<Integer> d= new ArrayDeque<>();
		d.offer(1);
		d.offer(2);
		var i = d.peek();
		var i1 = d.poll();
		var i2 = d.peek();
		System.out.println(i+ " " +i1+ " " +i2);
	}
}
