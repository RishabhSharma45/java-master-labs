package w3r.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class MyThread implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "Hello";
	}

	
	
}

public class _4Collable {

	public static void main(String[] args) throws Exception {
		
		MyThread t1 = new MyThread();
		
		 // Callable ko thread me chalane ke liye FutureTask
        FutureTask<String> futureTask = new FutureTask<>(t1);
        
     // Thread bana ke start karenge
        Thread thread = new Thread(futureTask);
        thread.start();
        
     // Result lena (yeh block karta hai jab tak thread finish nahi hota)
        String result = futureTask.get();
        System.out.println("Result from Callable: " + result);
		
		
	}
	
}
