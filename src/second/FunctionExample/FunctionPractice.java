package second.FunctionExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionPractice {
	public static void main(String[] args) {
		List<String> list = List.of("Tic", "Tac", "Toe");
		Function<String, Integer> func = e -> e.length();

		List<Integer> newList = map(list, func);
		System.out.println(newList);
	}

	private static List<Integer> map(List<String> list, Function<String, Integer> func) {
		List<Integer> newList = new ArrayList<>();
		for (String str: list) {
			newList.add(func.apply(str));
		}
		return newList;
	}

}
