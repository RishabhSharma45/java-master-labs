package w3r.multithreading;

import java.util.concurrent.CyclicBarrier;

class RegistrySR extends Thread {
    CyclicBarrier barrier;
    String name;

    RegistrySR(CyclicBarrier barrier, String name) {
        this.barrier = barrier;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " is ready for registry");
            Thread.sleep((long)(Math.random()*2000)); // thoda delay simulate
            System.out.println(name + " reached barrier, waiting...");
            barrier.await(); // yahan ruk jaata hai thread
            System.out.println(name + " starts registry process!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class _6CyclicBarrierExample {

    public static void main(String[] args) {

        // 3 threads ko wait karna
        CyclicBarrier barrier = new CyclicBarrier(3, () -> {
            System.out.println("All SRs ready, registry process starting now!");
        });

        Thread t1 = new RegistrySR(barrier, "SR1");
        Thread t2 = new RegistrySR(barrier, "SR2");
        Thread t3 = new RegistrySR(barrier, "SR3");

        t1.start();
        t2.start();
        t3.start();
    }
}

