package third;

import java.util.function.BiFunction;

public class StaticReferenceMethod {

	public static void main(String[] args) {
		BiFunction<String, String, String> biFunction = B_Class::staticMethod;
		System.out.println(biFunction.apply("Hello", "Rizvi"));
	}
}

class B_Class {
	static String staticMethod(String a, String b) {
		return a + b;
	}
}