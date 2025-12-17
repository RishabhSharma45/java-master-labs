package w3r.multithreading;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

public class _2RunnableJava8use {
	
	public static void main(String[] args) {
		
		MyRunnable r = new MyRunnable();
		Thread t1 = new Thread(r);
		
	}

}
