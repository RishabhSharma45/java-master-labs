package w3r.java8.stream;

import java.util.List;

public class _5CountStringStartingWithLetter {
public static void main(String[] args) {
	List<String> list = List.of("rahul","yuvraj","sachin","virat","rohit","rahul","sachin","raman","sanchit","ronit","viraj");
	long count = list.stream().filter(x->x.startsWith("ra") || x.startsWith("vi")).count();
	System.out.println(count);
}
}
