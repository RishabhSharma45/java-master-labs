package ch_03_Strings;

public class Q1 {
	
	//Q1. Reverse Each Word in a Sentence (Without using split)
	//Input:
	//"I love Java Programming"
	//Output:
	//"I evol avaJ gnimmargorP"

	public String reverseWord(String s) {
		if(s.length()==1) {
			return s;
		}
		return s.charAt(s.length()-1) + reverseWord(s.substring(0,s.length()-1));
	}
	
	public String reverseSentence(String s) {
		String s1 = "";
		String ans = "";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!= ' ' && i!=s.length()-1) {
				s1+=s.charAt(i);
			}
			else {
				if(i==s.length()-1) {
					s1+=s.charAt(i);
				}
			ans+=reverseWord(s1)+" ";
			s1 = "";
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		String s = "I love Java Programming";
		Q1 q1 = new Q1();
		System.out.println(q1.reverseSentence(s));
	}

}
