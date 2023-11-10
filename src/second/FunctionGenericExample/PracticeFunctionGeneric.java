package second.FunctionGenericExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class PracticeFunctionGeneric {
	public static void main(String[] args) {
		List<String> list = List.of("Tic", "Tac", "Toe");
		Function<String, Integer> func = e -> e.length();

		List<Integer> newList = map(list, func);
		System.out.println(newList);
	}

	private static <T, R> List<R> map(List<T> list, Function<T, R> func) {
		List<R> newList = new ArrayList<>();
		for (T str: list) {
			newList.add(func.apply(str));
		}
		return newList;
	}
}
