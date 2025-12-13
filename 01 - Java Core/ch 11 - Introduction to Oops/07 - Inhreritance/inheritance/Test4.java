package prahar.oops.inheritance;

class A4 {
    static void m1() { System.out.println("A-static"); }
}

class B4 extends A4 {
    static void m1() { System.out.println("B-static"); }
}

public class Test4 {
    public static void main(String[] args) {
        A4 a = new B4();
        a.m1();
    }
}
