package w3r.java8.stream;

import java.util.List;
import java.util.OptionalDouble;

public class _1averageOfIntegersUsingStream {
      public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,4,5,6);
		OptionalDouble avg =  list.stream().mapToDouble(Integer::intValue).average();
		System.out.println(avg);
	}
}
