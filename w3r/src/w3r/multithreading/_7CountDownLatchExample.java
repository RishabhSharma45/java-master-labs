package w3r.multithreading;

import java.util.concurrent.CountDownLatch;

class RegistryDR extends Thread {
    CountDownLatch latch;
    String name;

    RegistryDR(CountDownLatch latch, String name) {
        this.latch = latch;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ready and waiting for supervisor signal...");
            latch.await(); // yahan ruk gaye
            System.out.println(name + " starts registry process!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class _7CountDownLatchExample {

    public static void main(String[] args) throws InterruptedException {

        // 1 supervisor ka signal
        CountDownLatch latch = new CountDownLatch(1);

        Thread t1 = new RegistryDR(latch, "SR1");
        Thread t2 = new RegistryDR(latch, "SR2");
        Thread t3 = new RegistryDR(latch, "SR3");

        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(2000); // supervisor preparation
        System.out.println("Supervisor gives signal now!");
        latch.countDown(); // signal diya → sab SR start
    }
}
