package w3r.java8.lambdaExpression;

import java.util.function.BiFunction;

public class _10ConcatenateStringsUsingLambda {
	
	public static void main(String[] args) {
		BiFunction<String , String , String> f = (a,b)->a.concat(b);
		System.out.println(f.apply("hello ", "hii"));
	}

}
