package w3r.exceptionHandling;

public class _1Basic {
	
	public static void main(String[] args) {
		int num = 0;
		try {
			if(num==0) {
				throw new ArithmeticException("no. cannot be zero");
			}
			System.out.println("on dividion output " + 10/num);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
	}

}
