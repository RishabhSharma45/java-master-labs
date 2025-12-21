package w3r.exceptionHandling;

import java.util.ArrayList;
import java.util.List;

class DuplicateIntegerException extends Exception{
	DuplicateIntegerException(String message){
		super(message);
	}
}

public class _6DuplicateIntegerException {
    public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,4,5,1,2,4);
		List<Integer> list2 = new ArrayList<>();
		
	try {
		for(int a : list) {
			if(list2.contains(a)) {
				throw new DuplicateIntegerException("duplicate integer exists in list");
			}
			list2.add(a);
		}
		System.out.println("no duplicate in list");
	}
	catch(DuplicateIntegerException e) {
		e.printStackTrace();
	}
		
	}
}
