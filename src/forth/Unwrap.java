package forth;

import java.util.Optional;

public class Unwrap {
	public static void main(String[] args) {
		Integer a = 10;
		Optional<Integer> optional = Optional.of(a);
		//get
		Integer integerVal = optional.get();
		System.out.println(integerVal);

		Optional<Integer> emptyOptional = Optional.empty();
//		emptyOptional.get();  // It gives NoSuchElementException

		//isPresent
//		Integer val = optional.isPresent()? emptyOptional.get(): 0;
//		System.out.println(val);

		//orElse
		Integer orElse = emptyOptional.orElse(0);
		System.out.println(orElse);

		//orElseGet
		Integer orElseGet = emptyOptional.orElseGet(() -> 0);
		System.out.println(orElseGet);

		//orElseThrow
		Integer orElseThrown = emptyOptional.orElseThrow(() -> new IllegalArgumentException());
	}
}
