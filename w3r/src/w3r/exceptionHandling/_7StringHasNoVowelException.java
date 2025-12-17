package w3r.exceptionHandling;

class StringHasNoVowelException extends Exception{
	StringHasNoVowelException(String message){
		super(message);
	}
}

public class _7StringHasNoVowelException {
    public static void main(String[] args) {
		String s = "hello hoe are you";
		try {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				throw new StringHasNoVowelException("string contains vowels");
			}
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
