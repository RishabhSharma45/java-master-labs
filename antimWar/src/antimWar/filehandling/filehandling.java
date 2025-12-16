package antimWar.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filehandling {
public static void main(String[] args) {
	File f = new File("antimwar.txt");
	if(f.exists()) {
		System.out.println("file already exists");
	}else {
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println(f.getAbsolutePath());
	
	try {
		FileWriter writer = new FileWriter("antimwar.txt");
		writer.write("hello how are you \n");
		writer.write("sb badiya?");
		writer.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	try {
		FileReader reader = new FileReader("antimwar.txt");
		int ch;
		while((ch=reader.read())!=-1) {
			System.out.print((char) ch);
		}
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		BufferedWriter bw = new BufferedWriter(new FileWriter("antimwar.txt"));
		bw.write("ram ram ");
		bw.newLine();
		bw.write("chakachak");
	    bw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		BufferedReader br = new BufferedReader(new FileReader("antimwar.txt"));
		String s;
		while((s=br.readLine())!=null) {
			System.out.print(s);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
