package w3r.java8.lambdaExpression;

@FunctionalInterface
interface FactorialUsingLambda{
	int factorial(int num);
}

public class _08FactorialUsingLambda {

	public static void main(String[] args) {
		FactorialUsingLambda f = num->{
			for(int i=num-1;i>=1;i--) {
				num = num * i;
			}
			return num;
		};
		System.out.println(f.factorial(5));
	}
	
}
