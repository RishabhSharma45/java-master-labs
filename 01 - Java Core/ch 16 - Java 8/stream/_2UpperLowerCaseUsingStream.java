package w3r.java8.stream;

import java.util.List;

public class _2UpperLowerCaseUsingStream {
   public static void main(String[] args) {
	   List<String> list = List.of("rahul","ramesh","kunal","ritik","yash");
   	list.stream().map(x->x.toUpperCase()).forEach(System.out::println);
   	list.stream().map(x->x.toLowerCase()).forEach(System.out::println);
}
}
