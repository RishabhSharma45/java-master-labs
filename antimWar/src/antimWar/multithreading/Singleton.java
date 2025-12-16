package antimWar.multithreading;

public class Singleton {
	
	private static volatile Singleton instance;
	
	private Singleton() {}
	
	 public static Singleton getInstance() {
	        if (instance == null) {                 // 1st check (no lock)
	            synchronized (Singleton.class) {
	                if (instance == null) {         // 2nd check (with lock)
	                    instance = new Singleton();
	                }
	            }
	        }
	        return instance;
	    }
	 
	 public static void main(String[] args) {
		
		 
		
	}

}
