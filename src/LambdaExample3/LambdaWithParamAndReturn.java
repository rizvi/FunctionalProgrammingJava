package LambdaExample3;

public class LambdaWithParamAndReturn {
	public static void main(String[] args) {
		LengthOfString ls = s -> s.length();
		System.out.println("Length of Srting1: "+ls.length("Hello World!"));

		int length = ls.length("My name is Rizvi");
		System.out.println("Length of String2: "+length);
	}
}
