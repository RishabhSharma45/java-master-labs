package w3r.java8.stream;

import java.util.List;
import java.util.stream.Collectors;

public class _4RemoveDuplicatesUsingStream {
public static void main(String[] args) {
	List<String> list = List.of("rahul","yuvraj","sachin","virat","rohit","rahul","sachin");
	List<String> removedDuplicatesList = list.stream().distinct().collect(Collectors.toList());
	System.out.println(removedDuplicatesList);
}
}
