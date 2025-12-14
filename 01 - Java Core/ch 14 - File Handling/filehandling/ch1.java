package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ch1 {
	public static void main(String[] args) {
		File f = new File("ram.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("file Created");
			}
			else {
				System.out.println("file already Exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
		System.out.println(f.exists());
		
		try {
			FileWriter writer = new FileWriter("ram.txt");
			writer.write("Ram ram bhaisahb\n");
			writer.write("kya haal chaal");
			writer.close();
			System.out.println("write succesfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	try {
		FileReader fileReader = new FileReader("ram.txt");
		int ch;
		while((ch = fileReader.read()) != -1) {
			System.out.print((char)ch);
		}
		System.out.println();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		BufferedWriter bfw = new BufferedWriter(new FileWriter("ram.txt"));
		bfw.write("sb badiya?");
		bfw.newLine();
		bfw.write("yes brother");
		bfw.close();
		System.out.println("buffered writer se likh diya");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
    
	try {
		BufferedReader bfr = new BufferedReader(new FileReader("ram.txt"));
		String line;
		try {
			while((line = bfr.readLine()) !=null) {
				System.out.print(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	//try with resources....
	
	try (BufferedReader br =
            new BufferedReader(new FileReader("ram.txt"))) {

           System.out.println(br.readLine());

       } catch (Exception e) {
           e.printStackTrace();
       }
	
	}  
}
