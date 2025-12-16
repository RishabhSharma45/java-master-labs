package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	
	int id;
	String name;
	int marks;
	
	

	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}



	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		//return this.marks-o.marks;
		return o.marks-this.marks;
		
	}
	
	
}

public class ComparablePractice {

	public static void main(String[] args) {
		
	
	Student s = new Student(001,"hello",50);
	Student s1 = new Student(002,"hello1",80);
	Student s2 = new Student(003,"hello2",70);
	Student s3 = new Student(004,"hello3",30);
	
	List<Student> student = new ArrayList<>();
	student.add(s);
	student.add(s1);
	student.add(s2);
	student.add(s3);
	
	Collections.sort(student);
	System.out.println(student);
	
}
}





