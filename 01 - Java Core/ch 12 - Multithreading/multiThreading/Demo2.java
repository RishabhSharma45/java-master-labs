package prahar.multiThreading;

//with synchronized keyword

class Counter2 {
    int count = 0;
    synchronized void increment() {
        count++;
    }
}

public class Demo2 {
	
    public static void main(String[] args) throws InterruptedException {
        Counter2 c = new Counter2();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });

        t1.start();
        t2.start();

      t1.join();
        t2.join();

        System.out.println("Count: " + c.count);
    }
}