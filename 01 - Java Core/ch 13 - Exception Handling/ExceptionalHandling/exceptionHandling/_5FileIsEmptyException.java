package w3r.exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileIsEmptyException extends Exception{
	FileIsEmptyException(String message){
		super(message);
	}
}

public class _5FileIsEmptyException {

	public static void main(String[] args) {
		File f = new File("ram2.txt");
		try {
			if(!f.exists()) {
				throw new FileNotFoundException("File Not Found");
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("creating file");
			System.out.println(e.getMessage());
		}
		
		
		
		try {
			f.createNewFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("file is at " + f.getAbsolutePath());
//		
//		try {
//			FileWriter writer = new FileWriter("ram2.txt");
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter a no. to enter in file");
//			
//			
//				writer.write("1111");
//				writer.close();
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		String s = "";
		try {
			FileReader reader = new FileReader("ram2.txt");
			int ch ;
			
			while((ch=reader.read())!= -1) {
				
			   s = s + (char) ch;
			   
			}
			System.out.println(s);
			reader.close();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			if(s.equals("")) {
				throw new FileIsEmptyException("file is empty");
			}
			else {
				System.out.println(s);
			}
		}
		catch(FileIsEmptyException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
