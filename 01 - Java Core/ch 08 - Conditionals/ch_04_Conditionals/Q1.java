package ch_04_Conditionals;

import java.util.Scanner;

public class Q1 {
	
	//Q1️⃣ — Grade Calculator (REAL INTERVIEW)
	//📌 Print grade based on this scale:

//≥ 90 → A+
//
//80–89 → A
//
//70–79 → B
//
//60–69 → C
//
//50–59 → D
//
//< 50 → FAIL
	
	

	public static void main(String[] args) {
		
		while(true) {
			System.out.println("please enter no.");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			if(n>=90) {
				System.out.println("Grade A+");
			}
			else if(n>=80 && n<=89) {
				System.out.println("Grade A");
			}
			else if(n>=70 && n<=79) {
				System.out.println("Grade A");
			}
			else if(n>=60 && n<=69) {
				System.out.println("Grade A");
			}
			else if(n>=50 && n<=59) {
				System.out.println("Grade A");
			}
			else {
				System.out.println("Fail");
			}
			
		}

	}

}
