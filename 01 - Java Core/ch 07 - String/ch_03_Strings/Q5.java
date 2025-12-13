package ch_03_Strings;

public class Q5 {
	
	//Q5. Find the Longest Word in a Sentence (No Split)
	//"I am a Java Developer"
    //Developer
	
	
	public String longestWord(String s) {
		String s1 = "";
		int count = 0;
		String ans = "";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!= ' ' && i!=s.length()-1) {
				s1+=s.charAt(i);
			}
			else {
				if(i==s.length()-1) {
					s1 = s1 + s.charAt(i);
				}
			if(count<s1.length()) {
				count = s1.length();
				ans = s1;
			}
			s1 = "";
			}
		}
		return ans;
	}

	
	public static void main(String[] args) {
		Q5 q5 = new Q5();
		System.out.println(q5.longestWord("I am a Java Developer"));
	}

}
