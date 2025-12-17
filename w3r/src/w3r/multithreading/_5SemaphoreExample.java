package w3r.multithreading;

import java.util.concurrent.Semaphore;

class RegistryWorker extends Thread {
    Semaphore sem;
    String name;

    RegistryWorker(Semaphore sem, String name) {
        this.sem = sem;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " waiting for permit...");
            sem.acquire(); // permit le liya
            System.out.println(name + " gets permit, working...");
            Thread.sleep(2000); // kaam chal raha
            System.out.println(name + " finished work, releasing permit");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            sem.release(); // permit chhod diya
        }
    }
}

public class _5SemaphoreExample {

    public static void main(String[] args) {

        Semaphore sem = new Semaphore(2); // ek time me 2 threads kaam karenge

        Thread t1 = new RegistryWorker(sem, "SR1");
        Thread t2 = new RegistryWorker(sem, "SR2");
        Thread t3 = new RegistryWorker(sem, "SR3");
        Thread t4 = new RegistryWorker(sem, "SR4");
        Thread t5 = new RegistryWorker(sem, "SR5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

