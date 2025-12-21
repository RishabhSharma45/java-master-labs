package w3r.java8.lambdaExpression;

import java.util.List;

public class _17CheckWords {
	
	public static void main(String[] args) {
		
		List<String> list = List.of("hello","how","are","you");
		
		System.out.println(list.stream().filter(x->x.equals("hello")).count()>0);
		
		System.out.println(list.stream().anyMatch(x->x.equals("hello")));
		
	}

}
