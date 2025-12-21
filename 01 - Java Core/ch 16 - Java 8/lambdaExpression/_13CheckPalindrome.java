package w3r.java8.lambdaExpression;

import java.util.function.Predicate;

public class _13CheckPalindrome {
	
	public static void main(String[] args) {
		String s = "nitin";
		Predicate<String> p = x->{
			if(x.equals(new StringBuilder(x).reverse().toString())) {
				return true;
			}
			else {
				return false;
			}
		};
		System.out.println(p.test(s));
	}

}
