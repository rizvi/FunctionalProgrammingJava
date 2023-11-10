package second.BiFunctionExample;

import java.util.function.BiFunction;

public class BiFunctionPractice {
	public static void main(String[] args) {
		BiFunction<String, String, String> biFunction = (a,b) -> a+b;
		System.out.println(biFunction.apply("Abu Zakir ", "Rizvi"));

		BiFunction<String, String, Integer> biFunction1 = (a,b) -> (a+b).length();
		System.out.println(biFunction1.apply("Abu Zakir ", "Rizvi"));
	}
}
