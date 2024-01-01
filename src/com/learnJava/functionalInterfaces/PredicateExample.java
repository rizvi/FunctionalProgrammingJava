package com.learnJava.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		Predicate<Integer> p = i -> {
			return i%2==0;
		};

		System.out.println(p.test(4));
		System.out.println(p.test(5));

		// Without using return call
		Predicate<Integer> pre = i -> i%2==0;

		System.out.println(pre.test(8));
		System.out.println(pre.test(15));
	}
}
