package com.learnJava.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {
	static Function<String, String> function = (name) ->name.toUpperCase();
	static Function<String, String> addSomeString = (name) ->name.concat(" Loves Java 21");
	public static void main(String[] args) {
		System.out.println("Result is: "+function.apply("Rizvi"));
		System.out.println("Result of andthen is: "+function.andThen(addSomeString).apply("Rizvi"));

		// compose method er vitor er ta shobar age execute hobe. Pore others task execute hobe
		// compose er vitor addSomeString function ta shobar age execute hobe
		System.out.println("Result of compose is: "+function.compose(addSomeString).apply("Rizvi"));

	}
}
