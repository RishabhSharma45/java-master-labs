package w3r.java8.lambdaExpression;

interface IsStringIsEmpty{
	boolean isStringIsEmpty(String s);
}

public class _02IsStringIsEmpty {

	public static void main(String[] args) {
		
		IsStringIsEmpty isStringIsEmpty = x->{
			if(x.equals("")){
				return true;
			}
			else {
				return false;
			}
		};
		System.out.println(isStringIsEmpty.isStringIsEmpty(""));
		
	}
	
}
