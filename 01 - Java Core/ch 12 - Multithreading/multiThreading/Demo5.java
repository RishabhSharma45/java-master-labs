package prahar.multiThreading;

class A {
    synchronized void foo(B b) {
        System.out.println("Thread1 trying to call B.last()");
        b.last();
    }
    synchronized void last() { System.out.println("Inside A.last()"); }
}

class B {
    synchronized void bar(A a) {
        System.out.println("Thread2 trying to call A.last()");
        a.last();
    }
    synchronized void last() { System.out.println("Inside B.last()"); }
}

public class Demo5 extends Thread {
    A a = new A();
    B b = new B();

    public void m1() {
        this.start();
        a.foo(b);
    }

    public void run() {
        b.bar(a);
    }

    public static void main(String[] args) {
        new Demo5().m1();
    }
}

