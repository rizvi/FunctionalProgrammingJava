package second.PredicateGenericExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PracticePredicateGeneric {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Basics");
		list.add("");
		list.add("Strong");
		list.add("");
		list.add("My name is Rizvi");
		list.add("Rizvi prefers milk to tea");

		Predicate<String> predicate = s -> !s.isEmpty();
		List<String> newList = filterList(list, predicate);
		System.out.println(newList);

		Predicate<String> secondPredicate = s -> s.contains("Rizvi");
		List<String> anotherList = filterList(list, secondPredicate);
		System.out.println(anotherList);

		List<Integer> intList = List.of(1, 2, 3, 4, 5, 6);
		Predicate<Integer> integerFilter = e -> e % 2 == 0;
		List<Integer> evenList = filterList(intList, integerFilter);

		System.out.println("Even Number List: " + evenList);

		List<Integer> intList1 = List.of(1, 2, 3, 4, 5, 6, 11, 15);
		Predicate<Integer> integerFilter1 = e -> e > 10;
		List<Integer> evenList1 = filterList(intList1, integerFilter1);

		System.out.println("More than 10 Numbers: " + evenList1);

	}

	private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
		List<T> newList = new ArrayList<>();
		for (T str : list) {
			if (predicate.test(str)) {
				newList.add(str);
			}
		}
		return newList;
	}
}
