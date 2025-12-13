package ch_04_Conditionals;

import java.util.Scanner;

//Q2️⃣ — Check if a Character is Vowel, Consonant, Digit, or Special Character

/*
 * 👁 This is a favourite question everywhere.

Example:

Input: a → Vowel

Input: K → Consonant

Input: 7 → Digit

Input: @ → Special

✔ Use if-else-if ladder
✔ Use character ranges
✔ No use of built-in methods allowed (optional rule)
 */

public class Q2 {
	
	public static void main(String[] args) {
		while(true) {
		System.out.println("please enter a character");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c = s.charAt(0);
		
		if(s.length()>1){
			System.out.println("Please enter only Single Character");
		}
		else {
			if((s.charAt(0)>=65 && s.charAt(0)<=90) || (s.charAt(0)>=97 && s.charAt(0)<=122)) {
				if(c=='a' || c=='i' || c=='e' || c=='o' || c=='u') {
					System.out.println("Vowel");
				}
				else {
					System.out.println("Consonent");
				}
			}
			else if(c>=48 && c<=57) {
				System.out.println("digit");
			}
			else {
				System.out.println("special");
			}
		}
		}
	}

}
