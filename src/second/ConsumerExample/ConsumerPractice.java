package second.ConsumerExample;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractice {
	public static void main(String[] args) {
		List<Integer> list = List.of(34,55,66,75,44,89,90);
		Consumer<Integer> consumer = e -> System.out.println(e);
		consumer.accept(33);
		printElements(list, consumer);

		List<String> list1 = List.of("Ashraful", "Tamim", "Mahmudullah", "Mashrafee", "Mushfiqur Rahim");
		Consumer<String> consumer1 = s -> System.out.println("Player: "+s);
		printElements(list1, consumer1);
	}

	private static <T> void printElements(List<T> list, Consumer<T> consumer) {
		for (T t: list) {
			consumer.accept(t);
		}
	}

}
