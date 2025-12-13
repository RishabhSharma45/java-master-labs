package prahar.multiThreading;

class Message {
    private boolean ready = false;

    synchronized void produce() throws InterruptedException {
        System.out.println("Producer: Preparing data...");
        Thread.sleep(1000);
        ready = true;
        System.out.println("Producer: Data ready, notifying...");
        notify();
    }

    synchronized void consume() throws InterruptedException {
        while (!ready) {
            System.out.println("Consumer: Waiting for data...");
            wait();
        }
        System.out.println("Consumer: Data received!");
    }
}

public class Demo6 {
    public static void main(String[] args) {
        Message msg = new Message();

        new Thread(() -> {
            try { msg.consume(); } catch (Exception e) {}
        }).start();

        new Thread(() -> {
            try { msg.produce(); } catch (Exception e) {}
        }).start();
    }
}

