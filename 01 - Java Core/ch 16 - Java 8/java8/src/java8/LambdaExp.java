package java8;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee hr = ()->"Ramesh singh";
		System.out.println(hr.name());
		
		Predicate<Integer> t = s->s>5;
		System.out.println(t.test(6));
        Function<String,Integer> t2 = s->s.length();
        System.out.println(t2.apply("Hello"));
        Consumer<Integer> t3 = s->System.out.println(s);
        t3.accept(5);
        Supplier<Integer> t4 = ()->5;
        System.out.println(t4.get());
		//System.out.println(hr);
        
        int[] arr = {2,5,6,9,8,7,4,1,5,6,9};
        Arrays.stream(arr).filter(s->s>5).map(s->s*s).sorted().forEach(System.out::println);;
        

	}

}
