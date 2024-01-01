package com.learnJava.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateMoreExample {
	// Without using return call
	static Predicate<Integer> pre1 = i -> i%2==0;
	static Predicate<Integer> pre2 = i -> i%5==0;

	public static void predicateAnd() {
		System.out.println("Predicate And Result is: "+pre1.and(pre2).test(30));
	}
	public static void main(String[] args) {
		System.out.println(pre1.test(4));
		System.out.println(pre1.test(5));
		predicateAnd();
	}
}
