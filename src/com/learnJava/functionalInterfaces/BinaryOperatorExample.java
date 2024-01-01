package com.learnJava.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
	static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);
	public static void main(String[] args) {
		BinaryOperator<Integer> binaryOperator = (a,b) -> a*b;
		System.out.println(binaryOperator.apply(5,6));

		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
		System.out.println("Result of MaxBy is: "+maxBy.apply(7,9));

		BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
		System.out.println("Result of MinBy is: "+minBy.apply(7,9));
	}
}
