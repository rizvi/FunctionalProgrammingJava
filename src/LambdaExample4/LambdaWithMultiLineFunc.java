package LambdaExample4;

import LambdaExample3.LengthOfString;

public class LambdaWithMultiLineFunc {
	public static void main(String[] args) {
		LengthOfString len = str -> {
			int l = str.length();
			return l;
		};

		int strLength = len.length("Hello, My name is Rizvi");
		System.out.println(strLength);
	}
}
