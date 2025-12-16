package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q2 {
	
	public static void main(String[] args) {
		
		/*
		 * 🔥 Q2. Remove duplicate characters using streams

           Input: "programming"
           Output: "progamin"
		 */
		
		String str = "programming";
		List<Character> list = str.chars() 
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
		list.stream().distinct().forEach(System.out::print);
		System.out.println();
		
		int[] arr = {10,20,30,40,50};
		List<Integer> list2 = new ArrayList<>();
		for(int a : arr) {
			list2.add(a);
		}
		list2.stream().sorted((o1, o2) -> o1-o2 ).limit(2).skip(1).forEach(System.out::println);
		
		list2.stream().mapToInt(Integer::intValue).sum(); // or whatever
		
		List<String> list3 = Arrays.asList("Java", "Spring", "Boot", "API");

		Map<Integer, List<String>> map =
		        list3.stream().collect(Collectors.groupingBy(String::length));
		map.forEach((k, v) -> System.out.println(k + " -> " + v));

	}

}
