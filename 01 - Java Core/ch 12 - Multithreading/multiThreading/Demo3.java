package prahar.multiThreading;

//with synchronized block

class Printing{
	
	void print() {
		synchronized(this) {
		for(int i=0;i<5;i++) {
			System.out.println("thread running" + Thread.currentThread().getName());
		}
	}
}
}

public class Demo3 {

	public static void main(String[] args) {
		Printing p = new Printing();
	    new Thread(()->p.print()).start();
		new Thread(()->p.print()).start();

	}

}
