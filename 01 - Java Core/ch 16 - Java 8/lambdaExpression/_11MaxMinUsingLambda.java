package w3r.java8.lambdaExpression;

import java.util.List;

public class _11MaxMinUsingLambda {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,2,5,4,6,9,8,7,5);
		
		int max = list.stream().mapToInt(Integer::intValue).max().orElse(0);
		int min = list.stream().mapToInt(Integer::intValue).min().orElse(0);
		System.out.println("max " + max + " and min " + min);
		
	}

}
