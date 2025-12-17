package w3r.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {
    public void run() {
        System.out.println("Kaam ho raha hai");
    }
}

public class _3ExecuterService {
	
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		 service.execute(new MyTask());
	     service.execute(new MyTask());
	     service.execute(new MyTask());
	     service.execute(new MyTask());
	     
	     service.shutdown();
	}
     
}
