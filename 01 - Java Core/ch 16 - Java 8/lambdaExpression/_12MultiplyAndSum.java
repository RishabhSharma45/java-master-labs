package w3r.java8.lambdaExpression;

import java.util.List;
import java.util.function.Function;

public class _12MultiplyAndSum {
	
	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,5,4,6,9,8,7,5);
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("sum "+sum);
		
		int mul = list.stream().reduce(1, (x,y)->x*y);
		System.out.println(mul);
	}

}
