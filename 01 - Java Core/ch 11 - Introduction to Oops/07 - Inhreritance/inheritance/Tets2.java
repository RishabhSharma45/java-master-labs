package prahar.oops.inheritance;

class A1 {
    A1() { System.out.println("A"); }
}

class B1 extends A1{
    B1() { System.out.println("B"); }
}

class C1 extends B1 {
    C1() { System.out.println("C"); }
}


class A3 {
    void common() { System.out.println("Common"); }
}

class B3 extends A3 {}
class C3 extends A3 {}



public class Tets2 {
    public static void main(String[] args) {
        new C1();
        new B3().common();
        new C3().common();
    }
}
