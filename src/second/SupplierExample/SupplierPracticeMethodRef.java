package second.SupplierExample;

import java.util.function.Supplier;

public class SupplierPracticeMethodRef {
	public static void main(String[] args) {
		Supplier<String> stringSupplier = () -> new String("Hello Rizvi");
		System.out.println(stringSupplier.get());

		Supplier<Double> randomNumber = Math::random;
		System.out.println("Random Number: " + randomNumber.get());

		Supplier<Integer> integerNumber = () -> Math.abs(455);
		System.out.println("Integer Number: " + integerNumber.get());

		Supplier<Long> longNumber = () -> Math.max(34l, 56l);
		System.out.println("Long Number: " + longNumber.get());

	}
}
