package w3r.java8.stream;

import java.util.List;

public class _8SecondSmallestLargest {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,2,3,5,4,6,9,8,7,5,4,5);
		
		list.stream().distinct().sorted().limit(2).skip(1).forEach(System.out::println);
		list.stream().distinct().sorted((a,b)->b-a).limit(2).skip(1).forEach(System.out::println);
		
	}
	
}
