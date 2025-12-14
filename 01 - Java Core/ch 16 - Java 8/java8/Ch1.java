package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparator<Employee>{
	
	String name;
	int salary;
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o2.salary-o1.salary;
	}
	
	
	
	
}

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}

class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e2.salary - e1.salary;
    }
}

public class Ch1 {
  public static void main(String[] args) {
	  Employee e1 = new Employee("e1", 2000);
      Employee e2 = new Employee("e2", 3000);

      List<Employee> emp = new ArrayList<>();
      emp.add(e1);
      emp.add(e2);

      Collections.sort(emp, new NameComparator());
      
      emp.forEach(e ->
      System.out.println(e.name + " " + e.salary)
  );
}
}
