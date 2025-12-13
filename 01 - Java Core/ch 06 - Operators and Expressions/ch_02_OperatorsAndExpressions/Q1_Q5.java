package ch_02_OperatorsAndExpressions;

public class Q1_Q5 {
	
	public static void main(String[] args) {
			
	//q1
		
	 /* Question:
      Write a Java program to evaluate the following expression step-by-step and print the final result:
      int a = 10, b = 5, c = 2;
      int result = a++ + --b * c + (a > b && b < c || a == 11 ? 20 : 30) - a / b;
      Also explain operator precedence, short-circuit behaviour, and why the final answer comes.
	 */
		
	 int a = 10;
	 int b = 5;
	 int c = 2;
	 
	 int result = a++ + --b * c + (a > b && b < c || a == 11 ? 20 : 30) - a / b;
	 System.out.println(result);
	 //
	
	//q2
	
	/*
	 * Question:

Write a Java program that takes an integer n = 29 and prints:

Binary representation

n << 2 with explanation

n >> 3 with explanation

~n (bitwise NOT) and why output becomes negative

n & 15, n | 15, n ^ 15 with explanation
	 */
	 
	 int n = 29;
	 System.out.println(n << 2); 
	 System.out.println(n >> 3);
	 System.out.println(~n);
	 System.out.println(n&15);
	 System.out.println(n|15);
	 System.out.println(n^15);
	 
	
	//q3
	
	/*
	 * byte a = 50;
       byte b = 70;
       byte c = (byte)(a * b / 4 + 10 - a % 3);

	 */
	 
	 byte a2 = 50;
     byte b2 = 70;
     byte c2 = (byte)(a2 * b2 / 4 + 10 - a2 % 3);
     System.out.println(c2);

	
	//q4
	
	/*
	 * Write a Java program to evaluate the following ternary chain:  
	 * int x = 5, y = 10, z = 15;

int result = x > y ? 
                (y > z ? x + y : y + z) : 
                (x < z ? (z - x) : (x * y));

	 */
	
	//q5
	
	/*
	 * Write a Java program:
	 * int a = 7, b = 3;
double result = a++ + --b * 2 + (double)(a / b) - (a > b ? 1.5 : 2.5);

	 */
	
	}
}
