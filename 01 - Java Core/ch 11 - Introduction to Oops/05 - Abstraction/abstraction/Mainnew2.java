package prahar.oops.abstraction;

import java.util.ArrayList;

abstract class Employee{
	String name;
	int id;
	abstract double calculateSalary();
}
class FullTimeEmployee extends Employee{

	@Override
	double calculateSalary() {
		return 20000;
	}
	
}
class PartTimeEmployee extends Employee{
	
	int hours;
	int rate;
	
	PartTimeEmployee(int hours , int rate){
		this.hours=hours;
		this.rate=rate;
	}

	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return hours * rate;
	}
	
}

public class Mainnew2 {
	
	public static void main(String[] args) {
		
		FullTimeEmployee e1 = new FullTimeEmployee();
		FullTimeEmployee e2 = new FullTimeEmployee();
		FullTimeEmployee e3 = new FullTimeEmployee();
		PartTimeEmployee e4 = new PartTimeEmployee(5,2000);
		PartTimeEmployee e5 = new PartTimeEmployee(8,2500);
		ArrayList<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		double totalSalary = 0;
		for(Employee e : list ) {
			totalSalary += e.calculateSalary();
		}
		System.out.println(totalSalary);
		
		
		
		//Create array/list of employees and calculate total company salary using runtime polymorphism.
		
	}

	
}
