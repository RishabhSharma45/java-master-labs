package w3r.java8.lambdaExpression;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

public class _19SecondLargestSmallestInArray {
	
	public static void main(String[] args) {
		
		Integer[] a = {8,9,7,5,6,8,5,6,1,4,5};
		int secondSmallest = Arrays.stream(a).sorted().skip(1).findFirst().orElse(0);
		System.out.println(secondSmallest);
		 Integer secondLargest = Arrays.stream(a)
			      .distinct()
			      .sorted(Comparator.reverseOrder())
			      .skip(1)
			      .findFirst()
			      .orElse(null);
		System.out.println(secondLargest);
	}
	

}
