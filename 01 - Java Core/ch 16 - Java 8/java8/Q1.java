package java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee3 {
	private int id;
	private String name;
	private String department;
	private double salary;
	public Employee3() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee3(int id, String name, String department, double salary) {
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
		return "Employee3 [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
}

public class Q1 {
	
     public static void main(String[] args) {
	
	Employee3 e1 = new Employee3(001,"rakesh","civil",50000);
	Employee3 e2 = new Employee3(002,"kamlesh","it",40000);
	Employee3 e3 = new Employee3(003,"rahul","hr",50000);
	Employee3 e4 = new Employee3(004,"ankit","civil",30000);
	Employee3 e5 = new Employee3(005,"riya","hr",20000);
	Employee3 e6 = new Employee3(006,"taniya","hr",40000);
	Employee3 e7 = new Employee3(007,"bhaskar","it",60000);
	
	List<Employee3> list = List.of(e1,e2,e3,e4,e5,e6,e7);
	
	list.stream().filter(x-> x.getSalary()>50000).forEach(System.out::println);
	list.stream().filter(x-> x.getDepartment()=="hr").forEach(x->System.out.println(x.getName()));
	
	Map<String , Long> map = list.stream().collect(Collectors.groupingBy(Employee3::getDepartment,Collectors.counting()));
	System.out.println(map);
	Map<String , Double> map2 = list.stream().collect(Collectors.groupingBy(Employee3::getDepartment,Collectors.summingDouble(Employee3::getSalary)));
	System.out.println(map2);
	
	System.out.println(list.stream().filter(x->x.getDepartment()=="hr").mapToDouble(Employee3::getSalary).min());
	
	list.stream().sorted(Comparator.comparing(Employee3::getName)).forEach(x->System.out.println(x.getName()));
	
	list.stream().map(x->x.getSalary()*0.1 + x.getSalary()).forEach(System.out::println);
	
	System.out.println(list.stream().mapToDouble(Employee3::getSalary).average());
	
	 System.out.println(list.stream().collect(Collectors.groupingBy(Employee3::getDepartment)));
	 
	 
	
	
     }

}
