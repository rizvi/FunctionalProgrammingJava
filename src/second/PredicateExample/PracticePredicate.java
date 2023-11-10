package second.PredicateExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PracticePredicate {
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

	}

	private static List<String> filterList(List<String> list, Predicate<String> predicate) {
		List<String> newList = new ArrayList<>();
		for (String str : list) {
			if(predicate.test(str)) {
				newList.add(str);
			}
		}
		return newList;
	}
}
