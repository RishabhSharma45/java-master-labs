package w3r.exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;

public class _3FileNotFoundException {

	public static void main(String[] args) {
		try {
			File f = new File("ram.txt");
			if(!f.exists()) {
			throw new FileNotFoundException("file not present");
		} 
			System.out.println(f.getAbsolutePath());
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
