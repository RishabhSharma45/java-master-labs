package tractor_rental_service;

import java.time.LocalTime;
import java.util.Scanner;

public class TractorService {
	
	static void booking(Tractor t1) {
		LocalTime start =	t1.start();
		  LocalTime stop = t1.stop();
		  Booking b = new Booking();
		  double rs = b.generateReciept(t1.getHp(), t1.getName(), t1.milage(), start, stop);
		  System.out.println("press 1 to pay");
		  Scanner sc = new Scanner(System.in);
		  sc.nextInt();
		  Payment p = new Payment();
		  p.pay(rs);
	}
	
	public static void main(String[] args) {
		
		System.out.println("welcome to Tractor Rental Service");
		Tractor t1 = new Tractor("eicher" , 45 , 2.0f);
		Tractor t2= new Tractor("mahindra" , 35 , 2.0f);
		Tractor t3 = new Tractor("hmt" , 40 , 2.0f);
		
		Farmer f1 = new Farmer("f1" , t1);
		Farmer f2 = new Farmer("f2" , t2);
		Farmer f3 = new Farmer("f3" , t3);
		
		
		System.out.println("we having 3 farmers currently those having following tractors  ");
		
		System.out.println(f1.getName() + "tractor name - " + f1.getTractor().getName() + "horse power - " + f1.getTractor().getHp() + "will conmsume deisel prer hour - " + f1.getTractor().milage());
		System.out.println(f2.getName() + "tractor name - " + f2.getTractor().getName() + "horse power - " + f2.getTractor().getHp() + "will conmsume deisel prer hour - " + f2.getTractor().milage());
		System.out.println(f3.getName() + "tractor name - " + f3.getTractor().getName() + "horse power - " + f3.getTractor().getHp() + "will conmsume deisel prer hour - " + f3.getTractor().milage());
		
		System.out.println("press 1 for tractor of - " + f1.getName());
		System.out.println("press 2 for tractor of - " + f2.getName());
		System.out.println("press 3 for tractor of - " + f3.getName());
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch(num) {
		case 1 :
		  booking(t1);
		  break;
		case 2 :
			booking(t2);
			break;
		case 3 :
			booking(t3);
			break;
		default:
			System.out.println("Wrong Input");
		  }
	}

}
