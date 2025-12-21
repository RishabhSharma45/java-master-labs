package w3r.filehandling;

import java.io.File;

public class _2ReadWriteRequest {
	
	public static void main(String[] args) {
		
		File f = new File("C:/Users/Soft Tech/eclipse-workspace/w3r/ram.txt");
		if(f.canWrite()) {
			System.out.println("can write");
		}
		else {
			System.out.println("cannot write");
		}
		
		if(f.canRead()) {
			System.out.println("can read");
		}
		else {
			System.out.println("cannot read");
		}
		
	}

}
