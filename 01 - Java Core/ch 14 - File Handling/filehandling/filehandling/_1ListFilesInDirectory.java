package w3r.filehandling;

import java.io.File;

public class _1ListFilesInDirectory {
	
	public static void main(String[] args) {
		File f = new File("C:/Users/Soft Tech/eclipse-workspace/w3r");
        File f2 = new File("ram.txt");
		if(f2.exists()) {
			System.out.println(f2.getAbsolutePath());
		}
		String[] fileList = f.list();
		for(String name:fileList) {
			System.out.println(name);
		}
	}

}
