package w3r.java8.lambdaExpression;

import java.util.List;

public class _15SumOfOddEvenUsingLambda {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
		int oddSum = list.stream().filter(x->x%2==1).mapToInt(Integer::intValue).sum();
		System.out.println(oddSum);
		int evenSum = list.stream().filter(x->x%2==0).mapToInt(Integer::intValue).sum();
		System.out.println(evenSum);
		int totalSum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(totalSum);
	}

}
