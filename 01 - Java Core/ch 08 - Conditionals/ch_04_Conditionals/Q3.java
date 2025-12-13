package ch_04_Conditionals;

public class Q3 {

//	Q3️⃣ — Find the Largest of 3 Numbers WITHOUT using && or ||
	/*
	 * 🔥 Twist: Compound conditions not allowed
Use only nested if–else.

Example:
Input: 3 numbers
Output: Largest
	 */
	
	public static void main(String[] args) {
		int n1 = 8 , n2 = 18 , n3 = 12;
		if(n1>n2) {
			if(n1>n3) {
				System.out.println(n1);
			}
		}
		if(n2>n3) {
			if(n2>n1) {
				System.out.println(n2);
			}
		}
		if(n3>n1) {
			if(n3>n2) {
				System.out.println(n3);
			}
		}
	}
	
}
