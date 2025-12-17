package w3r.java8.lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class _5SortString {
  public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("rahul");
	list.add("kunal");
	list.add("arun");
	list.add("sumit");
	Collections.sort(list,(a,b)->b.compareToIgnoreCase(a));
	System.out.println(list);
	}
}
