package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee2 implements Comparable<Employee2>{
	
	String name;
	int salary;
	
	public Employee2(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


	@Override
	public int compareTo(Employee2 o) {
		// TODO Auto-generated method stub
		return o.salary-this.salary;
	}
	
}

public class Ch2 {
  public static void main(String[] args) {
	  Employee2 e1 = new Employee2("e1", 2000);
      Employee2 e2 = new Employee2("e2", 3000);

      List<Employee2> emp = new ArrayList<>();
      emp.add(e1);
      emp.add(e2);
      
      Collections.sort(emp);
      
      emp.forEach(e->System.out.println(e.name+" "+e.salary));
}
}
