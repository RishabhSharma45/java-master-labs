package prahar.multiThreading;

class MyThread extends Thread{
	public void run() {
		System.out.println("Thread running: " + Thread.currentThread().getName());
	}
}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		 System.out.println("Runnable running: " + Thread.currentThread().getName());
		
	}
	
}

public class Demo {
   public static void main(String arg[]) {
	   
	 //1 run thread using thread class
   MyThread t1 = new MyThread();
   t1.start();
   
     //2 run thread using runnable interface 
   Thread t2 = new Thread(new MyRunnable());
   t2.start();
   
//     //3run multiple thread
//   for(int i=0;i<=30;i++) {
//	   new MyThread().start();
//   }
   
   //4 sleep
   for(int i=0;i<=3;i++) {
	   try { Thread.sleep(500); } catch (InterruptedException e) {}
	   new MyThread().start();
   }
   
   
   //5 thread naming
   Thread t3 = new Thread(new MyRunnable());
   Thread t4 = new Thread(new MyRunnable());
   
   System.out.println("Before start: " + t3.isAlive());
   
   
   t3.setName("hello");
   //6 set priority
   t3.setPriority(10);
   t3.start();
   try {
	//7 join
	t3.join(); //wait for t1 to finish
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   t4.start();
   
   //8 is alive ?
   System.out.println("Before start: " + t3.isAlive());
   
   //9 ananonymous thread running ?
   new Thread(() -> {
       System.out.println("Anonymous thread running");
   }).start();

   //10 thread naming
   Thread t = Thread.currentThread();
   System.out.println("Current thread name: " + t.getName());
   t.setName("RishabhMainThread");
   System.out.println("Renamed thread: " + t.getName());
   
   
   
	}
}
