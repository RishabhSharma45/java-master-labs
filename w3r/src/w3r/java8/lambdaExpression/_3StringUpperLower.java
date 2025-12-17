package w3r.java8.lambdaExpression;

interface StringUpperLower{
	String convertCase(String s);
}

public class _3StringUpperLower {
	
	public static void main(String[] args) {
		
		StringUpperLower stringUpper = x->{
			return x.toUpperCase();
		};
		StringUpperLower stringLower = x->{
			return x.toLowerCase();
		};
		System.out.println(stringUpper.convertCase("hello"));
		System.out.println(stringLower.convertCase("hello"));
		
	}

}
