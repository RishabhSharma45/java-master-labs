package w3r.java8.lambdaExpression;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _16LongestSmallestString {
	
	public static void main(String[] args) {
	
	List<String> list = List.of("hello","how","are","you","?");
	
	//using function -
	
	Function<List<String>,Integer> fLongest = x->{
		int count=0;
		for(String a : x) {
			if(a.length()>count) {
				count = a.length();
			}
		}
		return count;
	};
	
	System.out.println(fLongest.apply(list));
	
	Function<List<String>,Integer> fSmallest = x->{
		int count=Integer.MAX_VALUE;
		for(String a : x) {
			if(a.length()<count) {
				count = a.length();
			}
		}
		return count;
	};
	System.out.println(fSmallest.apply(list));
	
	//using stream
	
	 Map<Integer, List<String>> map = list.stream().collect(Collectors.groupingBy(String::length));
	 System.out.println(map);
	 int smallest = map.keySet().stream().mapToInt(Integer::intValue).min().orElse(0);
	 int longest = map.keySet().stream().mapToInt(Integer::intValue).max().orElse(0);
	 System.out.println("smallest "+ smallest + " longest " + longest);
	 
	 
	}
}
