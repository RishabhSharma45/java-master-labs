package w3r.java8.lambdaExpression;

@FunctionalInterface
interface SumOfTwoIntegers{
	int sum(int a , int b);
}

public class _01SumOfTwoIntegers  {

	public static void main(String[] args) {
		
		SumOfTwoIntegers sum = (a,b)->a+b;
		
		System.out.println(sum.sum(5, 6));
		
	}
	
}
