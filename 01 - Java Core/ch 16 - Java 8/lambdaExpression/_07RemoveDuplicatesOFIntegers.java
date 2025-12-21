package w3r.java8.lambdaExpression;

import java.util.List;

public class _07RemoveDuplicatesOFIntegers {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,5,7,8,9,6,4,5,7,8,7,8,7,5,7,4,2,3);
		list.stream().distinct().forEach(System.out::println);
	}
	
}
