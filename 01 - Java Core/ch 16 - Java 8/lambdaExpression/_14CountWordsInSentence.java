package w3r.java8.lambdaExpression;

import java.util.function.Function;

public class _14CountWordsInSentence {
	
	public static void main(String[] args) {
		String s = "hello how are you buddy";
		Function<String , Integer> f = x->{
			String[] a = x.split(" ");
			return a.length;
		};
		System.out.println(f.apply(s));
	}

}
