package prahar.multiThreading;

class T1{
	static int count = 0;
	void meth() {
		synchronized(this) {
		
			
		}
	}
	static synchronized void increment() {
	for(int i=0;i<100;i++) {
		count++;
	}
	System.out.println(count);
	}
}

class MyThread3 extends Thread{
	
	public void run(){
		T1.increment();
	}
}

public class ThreadWithRahul2 {
	
	public static void main(String[] args) {
		
	
	MyThread3 thread1 = new MyThread3();
	thread1.start();
	MyThread3 thread2 = new MyThread3();
	thread2.start();
	}

}
