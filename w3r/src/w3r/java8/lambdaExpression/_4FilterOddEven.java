package w3r.java8.lambdaExpression;

import java.util.List;

interface FilterOddEven{
	String oddOrEven(int i);
}

public class _4FilterOddEven {
  public static void main(String[] args) {
	  List<Integer> list = List.of(1,2,3,4,5,6);
	  FilterOddEven filterOddEven = i->{
		  if(i%2==0) {
			  return "even";
		  }
		  else {
			  return "odd";
		  }
	  };
	  
	  for(int a : list) {
		  System.out.println(a+ " is "+filterOddEven.oddOrEven(a));
	  }
}
}
