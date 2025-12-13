package tractor_rental_service;

import java.time.Duration;
import java.time.LocalTime;

public class Booking {
	
	public double generateReciept(int hp , String name , float milage , LocalTime start , LocalTime stop) {
		System.out.println("generating reciept");
		System.out.println("you booked "  +hp+ "tractor" + "of " + name);
		System.out.println("Starting time " + start);
		System.out.println("stops at " + stop);
		Duration d = Duration.between(start, stop);
		long s = d.toHours();
		System.out.println("total hours tractor run " + s);
		double rs = s*milage;
		System.out.println("you have to pay - " + rs+ " of deisel" + "500 service charge");
		rs = rs +500;
		System.out.println("so your total is - " + rs);
		return rs;
	}

}
