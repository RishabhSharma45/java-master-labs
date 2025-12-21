package w3r.java8.lambdaExpression;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{
	private String name ;
	private int age;
	private double marks;
	private int cls;
	public Student(String name, int age, double marks,int cls) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.cls=cls;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + ", cls=" + cls + "]";
	}
	public int getCls() {
		return cls;
	}
	public void setCls(int cls) {
		this.cls = cls;
	}
	
}

public class _20SortingOfObjectList {
	
	public static int getRank(Student s) {
		 if (s.getMarks() >= 95) return 1;   // Rank A
		    if (s.getMarks() >= 90) return 2;   // Rank B
		    return 3;
	}

	public static void main(String[] args) {
		Student s1 = new Student("rahul" , 25 , 97.52,10);
		Student s2 = new Student("rakesh" , 22 , 94.52,10);
		Student s3 = new Student("mukesh" , 21 , 91.69,9);
		Student s4 = new Student("subham" , 28 , 92.85,9);
		Student s6 = new Student("ritik" , 29 , 92.85,9);
		Student s5 = new Student("ankit" , 30 , 90.02,10);	
		
		List<Student> list = List.of(s1,s2,s3,s4,s5,s6);
		
		//based on marks
		System.out.println("sorted on based of marks");
		list.stream().sorted(Comparator.comparing(Student::getMarks)).forEach(System.out::println);
		System.out.println();
		//based on marks reverse
		System.out.println("sorted on based of marks reversed");
		list.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).forEach(System.out::println);
		System.out.println();
		
		//based on name 
		System.out.println("sorted on based of names");
		list.stream().sorted(Comparator.comparing(Student::getName)).forEach(System.out::println);
		System.out.println();
		//based on name 
		System.out.println("sorted on based of names reversed");
		list.stream().sorted(Comparator.comparing(Student::getName).reversed()).forEach(System.out::println);
		System.out.println();
		
		
		/*
		 * Sort students by:

          cls ascending

          same class → marks descending

          same marks → age ascending

          same age → name lexicographically

          ❗ Constraint:
		 */
		
		
		list.stream().sorted( Comparator.comparing(Student::getCls).thenComparing(Comparator.comparing(Student::getMarks).reversed().thenComparing(Comparator.comparing(Student::getAge)).thenComparing(Comparator.comparing(Student::getName)))).forEach(x->System.out.println(x));
	
	
		/*
		 * 🥈 Q2. Topper Per Class with Tie-Breaker ⚔️

         Task:
         
         Har cls ka topper student nikaalo
         
         Topper = highest marks
         
         Agar marks same ho:
         
         kam age wala jeetega
         
        📌 Output:
		 */
		
		Map<Integer, Optional<Student>> map = list.stream().collect(Collectors.groupingBy(Student::getCls,Collectors.maxBy(Comparator.comparing(Student::getMarks).thenComparing(
                Comparator.comparing(Student::getAge).reversed()
            ))));
		
		Map<Integer, Student> topperPerClass =
		        list.stream()
		            .collect(Collectors.groupingBy(
		                Student::getCls,
		                Collectors.collectingAndThen(
		                    Collectors.maxBy(
		                        Comparator.comparing(Student::getMarks)
		                                  .thenComparing(
		                                      Comparator.comparing(Student::getAge).reversed()
		                                  )
		                    ),
		                    Optional::get
		                )
		            ));

		System.out.println(map);
		
		System.out.println(list.stream().collect(Collectors.groupingBy(Student::getCls)));
		
		System.out.println();
		
		list.stream().sorted(
				Comparator.comparing(_20SortingOfObjectList::getRank).thenComparing(
						Comparator.comparing(Student::getMarks).reversed().thenComparing(Student::getName))
				).forEach(System.out::println);
		System.out.println();
		
		List<Student> top3 =
		        list.stream()
		            .sorted(Comparator.comparing(Student::getMarks).reversed())
		            .limit(3)
		            .toList();

		List<Student> result =
		        Stream.concat(
		            top3.stream(),
		            list.stream()
		                .filter(s -> !top3.contains(s))
		                .sorted(Comparator.comparing(Student::getName))
		        ).toList();

		result.forEach(System.out::println);

		
		
		
	}
	
}
