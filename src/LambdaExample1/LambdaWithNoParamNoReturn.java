package LambdaExample1;

public class LambdaWithNoParamNoReturn {
	public static void main(String[] args) {
		Name name = () -> System.out.println("Rizvi");
		name.myName();
	}
}
