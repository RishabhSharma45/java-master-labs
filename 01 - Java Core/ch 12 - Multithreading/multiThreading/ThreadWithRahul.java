package prahar.multiThreading;

class MyThread1 extends Thread{
	public void run() {
		System.out.println("Rahul " + Thread.currentThread().getName());
		for(int i=0;i<10;i++) {
			System.out.println("hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


class MyRunnable1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Rahul " + Thread.currentThread().getName());
		
		for(int i=0;i<10;i++) {
			System.out.println("helloRun");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class ThreadWithRahul {

	public static void main(String[] args) {
		
		MyThread1 t1 = new MyThread1();
		//t1.start();
//		t1.setName("ravi");
		t1.start();
		
		for(int i=0;i<5;i++) {
			
			System.out.println(t1.isAlive());
		}
		
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		MyRunnable1 r1 = new MyRunnable1();
		Thread t2 = new Thread(r1);
		t2.start();
		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(t1.isAlive());
		
	}

}
