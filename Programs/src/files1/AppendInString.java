package files1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppendInString {
	
	public static void main(String args[]) throws IOException {
		File file=new File("/Users/samergosain/Faltu_Kachra/files/test.txt");
		BufferedWriter writer=new BufferedWriter(
				new FileWriter(file));
		writer.write("Hello World!");
		writer.close();
		stringAppend(file,"My name is Samer!!!");
		BufferedReader reader=new BufferedReader(
				new FileReader(file));
		String line;
		while((line=reader.readLine())!=null) {
			System.out.println(line);
		}
		reader.close();
		
	}
	
	public static void stringAppend(File file,String s) throws IOException {
		BufferedWriter writer=new BufferedWriter(new FileWriter(file,true));
		writer.write(s);
		writer.close();
	
	}

}
