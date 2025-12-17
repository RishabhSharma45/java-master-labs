package w3r.multithreading;

import java.util.concurrent.locks.ReentrantLock;

class Count{
	
	int count;
	
	ReentrantLock lock = new ReentrantLock();
	
	void increment() {
		   lock.lock();
	        try {
	            count++;
	        } finally {
	            lock.unlock();
	        }
	}
	
}

public class _1ReentrantLockTutorial {
	
	public static void main(String[] args) throws InterruptedException {
		
		Count c = new Count();
		
		Thread t1 = new Thread(()->{
			for(int i=0;i<1000;i++) {
				c.increment();
			}
		});
		Thread t2 = new Thread(()->{
            for(int i=0;i<1000;i++) {
				c.increment();
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();   // ⏳ wait for t1
		t2.join();   // ⏳ wait for t2

		System.out.println(c.count);
		
	}

}
