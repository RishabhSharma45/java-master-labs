package w3r.java8.lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _06AverageOfDoublesusingLambda {
	
	public static void main(String[] args) {
		List<Double> list = new ArrayList<>();
		list.add(22.02d);
		list.add(14.72d);
		list.add(24.0892d);
		list.add(28.876d);
		list.add(27.742d);
		
		System.out.println(list.stream().mapToDouble(Double::doubleValue).average().orElse(0.0));
	}

}
