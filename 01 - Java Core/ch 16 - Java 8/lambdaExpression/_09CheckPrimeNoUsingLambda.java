package w3r.java8.lambdaExpression;

import java.util.function.Predicate;

public class _09CheckPrimeNoUsingLambda {

	public static void main(String[] args) {
		Predicate<Integer> p = x->{
			for(int i=2;i<=Math.sqrt(x);i++) {
				if(x%i==0) {
					return false;
				}
			}
			return true;
		};
		System.out.println(p.test(6));
	}
	
}
