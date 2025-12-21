package w3r.java8.stream;

import java.util.List;

public class _6SortListOfStringUsingStream {
public static void main(String[] args) {
	List<String> list = List.of("rahul","yuvraj","sachin","virat","rohit","rahul","sachin","raman","sanchit","ronit","viraj");
	list.stream().sorted((a,b)->a.compareToIgnoreCase(b)).forEach(System.out::println);
	list.stream().sorted((a,b)->b.compareToIgnoreCase(a)).forEach(System.out::println);
}
}
