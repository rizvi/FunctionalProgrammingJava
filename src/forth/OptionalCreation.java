package forth;

import java.util.Optional;

public class OptionalCreation {
	public static void main(String[] args) {
		String val = "Hello Markava Tank";

		Optional<String> optional = Optional.of(val);
		// empty
		Optional<Integer> emptyData = Optional.empty();
		// nullable
		Optional<String> nullableData1 = Optional.ofNullable(val);
		Optional<String> emptyOptional = Optional.ofNullable(null);
	}
}
