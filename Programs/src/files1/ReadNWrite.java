package files1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadNWrite {

	public static void main(String[] args) throws IOException {


		FileReader reader=new FileReader("/Users/samergosain/Faltu_Kachra/files/input.txt");
		FileWriter writer=new FileWriter("/Users/samergosain/Faltu_Kachra/files/output.txt");
		String str="";
		int i;
		while((i=reader.read())!=-1) {
			writer.write((char)i);
		}
		System.out.println(str);
		writer.write(str);
		
		reader.close();
		writer.close();
		System.out.println("Reader and writer both done");
	}

}
