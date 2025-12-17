package w3r.exceptionHandling;

class OddNoException extends Exception{
	OddNoException(String message){
		super(message);
	}
}

public class _2ExceptionForOddNo {

	public static void main(String[] args) {
		int num=3;
		try {
			if(num%2==1) {
				throw new OddNoException("number is odd");
			}
			System.out.println(num  + " is odd");
		}
		catch(OddNoException e) {
			e.printStackTrace();
		}
		
	}
	
}
