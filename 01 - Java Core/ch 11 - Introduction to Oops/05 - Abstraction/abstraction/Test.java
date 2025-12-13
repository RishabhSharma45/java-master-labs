package prahar.oops.abstraction;

class A {
   private void show() {
        System.out.println("A - private show()");
    }
    
    void callShow() {
        show();
    }
}

class B extends A {
    private void show() {
        System.out.println("B - private show()");
    }
}

public class Test {
    public static void main(String[] args) {
        A b = new B();
        b.callShow();
        
        /*
         * ✔ Expected Concept Understanding:

         private method overridden nahi hoti

         call always parent show() ko jaega 

         B ke private show() ka koi use nahi
         */
    }
}
