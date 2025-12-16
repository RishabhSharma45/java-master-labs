package antimWar.multithreading;

public class Printsequenceusing3threadsABCABCABC {
	
	 int turn = 1;

	    synchronized void printA() {
	        while (turn != 1) {
	            try { wait(); } catch (Exception e) {}
	        }
	        System.out.print("A");
	        turn = 2;
	        notifyAll();
	    }

	    synchronized void printB() {
	        while (turn != 2) {
	            try { wait(); } catch (Exception e) {}
	        }
	        System.out.print("B");
	        turn = 3;
	        notifyAll();
	    }

	    synchronized void printC() {
	        while (turn != 3) {
	            try { wait(); } catch (Exception e) {}
	        }
	        System.out.print("C");
	        turn = 1;
	        notifyAll();
	 }
	
	public static void main(String[] args) {
		
		Printsequenceusing3threadsABCABCABC a = new Printsequenceusing3threadsABCABCABC();
		
		int i = 0;
		
		 while(i<5) {
		Thread t1 = new Thread(()->{
			a.printA();
		});
		Thread t2 = new Thread(()->{
			a.printB();
		});
		Thread t3 = new Thread(()->{
			a.printC();
		});
		
		t1.start();
		t2.start();
		t3.start();
		 
		i++;
		
		}
		
	}

}
