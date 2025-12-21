package w3r.java8.stream;

import java.util.List;

public class _3EvenOddSumUsingStream {
public static void main(String[] args) {
	List<Integer> list = List.of(1,2,3,4,5,6);
	System.out.println(list.stream().filter(x->x%2==0).mapToInt(Integer::intValue).sum());
	System.out.println(list.stream().filter(x->x%2==1).mapToInt(Integer::intValue).sum());
}
}
