package w3r.filehandling;

import java.io.File;

public class _5GetFileSize {
	
	public static void main(String[] args) {
		
		File f = new File("ram.txt");
		System.out.println(f.length()); //inmb kb bytes
		
	}

}
