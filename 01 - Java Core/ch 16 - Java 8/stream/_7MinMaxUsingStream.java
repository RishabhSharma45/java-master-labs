package w3r.java8.stream;

import java.util.List;

public class _7MinMaxUsingStream {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,2,3,5,4,6,9,8,7,5,4,5);
		System.out.println(list.stream().mapToInt(Integer::intValue).max());
		System.out.println(list.stream().mapToInt(Integer::intValue).min());
		
		Integer max = list.stream().max(Integer::compare).orElse(null);
		Integer min = list.stream().min(Integer::compare).orElse(null);
		
		System.out.println("max " + max + " min " + min);
		
	}
	
}
