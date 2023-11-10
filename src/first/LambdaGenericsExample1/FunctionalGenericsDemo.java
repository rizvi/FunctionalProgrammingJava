package first.LambdaGenericsExample1;

public class FunctionalGenericsDemo {
	public static void main(String[] args) {
		FunctionalGenerics<String, String> fun = s -> s.substring(1,5);
		System.out.println(fun.execute("Bangladesh"));

		FunctionalGenerics<String, Integer> fun1 = s -> s.length();
		System.out.println(fun1.execute("Hello Rizvi"));

		FunctionalGenerics<Integer, Integer> fun2 = s -> s*s;
		System.out.println("Square of 5 is: " + fun2.execute(5));

		FunctionalGenerics<Integer, String> fun3 = s -> "My age is: "+s;
		System.out.println(fun3.execute(27));
	}
}
