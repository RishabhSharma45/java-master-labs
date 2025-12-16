package java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

//Q2. Employee details program 
/*
Write a Java program to: 
1. Create an Employee class with fields: int id, String name, String department, double salary 
2. Store a list of at least 6 employees in different departments. 
Using Java Streams, perform the following tasks: 
Print the list of all employee names sorted by salary (descending). 
3. Find the average salary of employees in the "IT" department.   
Find the employee with the highest salary.
*/
class Employee{
	private int id;
	private String name;
	private String department;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
	
}
public class Q1sample {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(001,"rakesh","it",20000);
		Employee e2 = new Employee(002,"rahul","civil",30000);
		Employee e3 = new Employee(003,"priya","hr",20000);
		Employee e4 = new Employee(004,"sohan","it",40000);
		Employee e5 = new Employee(005,"sachin","it",50000);
		Employee e6 = new Employee(006,"prachi","hr",30000);
		
		List<Employee> list = List.of(e1,e2,e3,e4,e5,e6);
		
		/*
		Write a Java program to: 
		1. Create an Employee class with fields: int id, String name, String department, double salary 
		2. Store a list of at least 6 employees in different departments. 
		Using Java Streams, perform the following tasks: 
		Print the list of all employee names sorted by salary (descending). 
		3. Find the average salary of employees in the "IT" department.   
		Find the employee with the highest salary.
		*/
		
		list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
		
		 OptionalDouble avgSalary = list.stream().filter(x->x.getDepartment()=="it").mapToDouble(Employee::getSalary).average();
		 System.out.println(avgSalary);
		 
		 OptionalDouble highestSalary =  list.stream().filter(x->x.getDepartment()=="it").mapToDouble(Employee::getSalary).max();
		 System.out.println(highestSalary);
		 
		 
		Map<String, Double> map = list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(map);
		 
		
		
	}
	
	



}











