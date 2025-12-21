package w3r.java8.lambdaExpression;

import java.util.function.Predicate;

public class _18PerfectSquareCheck {
    public static void main(String[] args) {
		int num = 25; 
		Predicate<Integer> p = x->x==Math.sqrt(num)*Math.sqrt(num);
		System.out.println(p.test(num));
				
	}
}
