package antimWar.multithreading;

class Pen2{
	 void needPaper(Paper2 p) {
		synchronized(this){
		System.out.println("pen locked");
		}
		synchronized(p) {
		System.out.println("having pen need paper");
		p.givePaper();
		}
	}
	synchronized void givePen() {
		System.out.println("pen given");
	}
}
class Paper2{
	 void needPen(Pen2 p) {
		synchronized(this) {
		System.out.println("pen locked");
		}
		synchronized(p) {
		System.out.println("having paper need pen");
		p.givePen();
		}
	}
	synchronized void givePaper() {
		System.out.println("paper given");
	}
}
public class DeadlockSolution {
	
	
	public static void main(String[] args) {
		
		Pen2 p2 = new Pen2();
		Paper2 pa2 = new Paper2();
		
		
		Thread t1 = new Thread(()->{
		  p2.needPaper(pa2);
		}
		);
		Thread t2 = new Thread(()->{
			pa2.needPen(p2);
		}
        );
		t1.start();
		t2.start();
	}

}

