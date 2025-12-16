package antimWar.multithreading;

class Producer{
	
	int quantity;
	
	synchronized void gaveProduct(int quantity) {
		while(this.quantity<quantity) {
			System.out.println("producer producing product wait");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 if(this.quantity>=quantity) {
		System.out.println("products are now avalaible "  + "given to consumer");
		}
	}
	
	synchronized void producing(int quantity) {
		while(this.quantity!=quantity) {
			this.quantity++;
		}
		notify();
	}
	
}
class Consumer{
	
	synchronized void needProduct(Producer p , int quantity) {
		System.out.println("consumer need "  + quantity + " of product ");
		p.gaveProduct(quantity);
	}
	
}
public class ProducerConsumerWaitNotify {
	
	public static void main(String[] args) {
		Consumer c = new Consumer();
		Producer p = new Producer();
		
		Thread t1 = new Thread(()->{
			c.needProduct(p, 5);
		});
		t1.start();
		Thread t2 = new Thread(()->{
			p.producing(5);
		});
		t2.start();
		}

}
