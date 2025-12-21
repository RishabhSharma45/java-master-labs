package w3r.filehandling;

import java.io.File;

public class _3IsDirectoryIsFile {
  public static void main(String[] args) {
	File f = new File("C:/Users/Soft Tech/eclipse-workspace/w3r/ram.txt");
	if(f.isDirectory()) {
		System.out.println("is directroty");
	}
	else {
		System.out.println("it is not directory");
	}
	
	if(f.isFile()) {
		System.out.println("is file");
	}
	else {
		System.out.println("not a file");
	}
}
}
