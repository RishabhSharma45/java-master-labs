package w3r.filehandling;

import java.io.File;
import java.util.Date;

public class _4LastFileModified {
	
	public static void main(String[] args) {
		
		File f = new File("ram.txt");
		Date d = new Date(f.lastModified());
		System.out.println(d);
	}

}
