package ch_01_VariablesAndDataTypes;

public class Q3 {
	
//	Problem:
//		Write a Java program that reads a string of digits (like "1234") 
	//  and computes the sum of the digits using char arithmetic (without converting to int using Integer.parseInt).
//	
	public static void main(String[] args) {
		String s = "1234";
		int sum = 0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			sum+=c-'0';
		}
		System.out.println(sum);
	}

}
