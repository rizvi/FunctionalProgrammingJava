package first.LambdaGenericsExample1;
@FunctionalInterface
public interface FunctionalGenerics<T, R> {
	R execute(T t);
}
