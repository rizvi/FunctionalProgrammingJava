package first.LambdaExample2;

public class LambdaWithParametersOnly {
	public static void main(String[] args) {
		MathOperation add = (a, b) -> System.out.println(a+b);
		add.operation(10,20);

		MathOperation subtract = (a, b) -> System.out.println(a-b);
		subtract.operation(50,20);

		MathOperation product = (a, b) -> System.out.println(a*b);
		product.operation(10,20);

		MathOperation devide = (a, b) -> System.out.println(a/b);
		devide.operation(100,20);
	}
}
