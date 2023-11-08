import java.util.stream.IntStream;

public class ImperativeVsDeclarative {
	// Imperative
	public static void main(String[] args) {
		int sumOfEvents = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 1) {
				sumOfEvents = sumOfEvents + i;
			}
		}
		System.out.println("Sum: " + sumOfEvents);

		// Declarative or Functional
		sumOfEvents = IntStream.rangeClosed(0, 100)
				.filter(i -> i % 2 == 0)
				.reduce((x, y) -> x + y)
				.getAsInt();
		System.out.println("Summation of Even numbers: " + sumOfEvents);

		sumOfEvents = IntStream.rangeClosed(0, 100)
				.filter(i -> i % 2 == 1)
				.reduce((x, y) -> x + y)
				.getAsInt();
		System.out.println("Summation of Odd Numbers: " + sumOfEvents);
	}
}