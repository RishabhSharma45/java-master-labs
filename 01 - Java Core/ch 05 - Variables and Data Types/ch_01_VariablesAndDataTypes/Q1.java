package ch_01_VariablesAndDataTypes;

public class Q1 {
	
//	Problem:
//		Write a Java program to read an array of bytes from user input. 
//		Compute the sum of all elements and store in a byte variable. Print the final result and explain the output.

	public static void main(String[] args) {
		
		byte[] arr = {5,100,16,7};
		byte sum = 0;
		for(byte a : arr) {
			sum= (byte) (sum + a); //or can use sum+=a;
		}
		System.out.println(sum);

	}

}
