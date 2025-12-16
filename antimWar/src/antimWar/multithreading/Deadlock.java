package antimWar.multithreading;

class Pen{
	synchronized void needPaper(Paper p) {
		System.out.println("pen locked");
		System.out.println("having pen need paper");
		p.givePaper();
	}
	synchronized void givePen() {
		System.out.println("pen given");
	}
}
class Paper{
	synchronized void needPen(Pen p) {
		System.out.println("pen locked");
		System.out.println("having paper need pen");
		p.givePen();
	}
	synchronized void givePaper() {
		System.out.println("paper given");
	}
}
public class Deadlock {
	
	
	public static void main(String[] args) {
		
		Pen p = new Pen();
		Paper pa = new Paper();
		
		
		Thread t1 = new Thread(()->{
		  p.needPaper(pa);
		}
		);
		Thread t2 = new Thread(()->{
			pa.needPen(p);
		}
        );
		t1.start();
		t2.start();
	}

}
