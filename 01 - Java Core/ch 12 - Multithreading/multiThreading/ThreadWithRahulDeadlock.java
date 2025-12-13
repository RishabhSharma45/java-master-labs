package prahar.multiThreading;

class Deadlock{
	void m1() {
		m2();
		System.out.print("m1");
	}
	void m2() {
		m1();
		System.out.print("m2");
	}
}


public class ThreadWithRahulDeadlock {

	public static void main(String[] args) {
		Deadlock d1 = new Deadlock();
		d1.m1();
		
	}
}
