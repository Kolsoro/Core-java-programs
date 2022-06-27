package files1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreateNewFile {

	public static void createFile() {
		try {

			String fileName="";
			String filePath="";
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter file name:");
			fileName=br.readLine();
			System.out.println("enter file path:");
			filePath=br.readLine();
			File f=new File(filePath+""+fileName+".txt");
			//Here “createNewFile()” method is called with the help of the File class object.
			//This method creates a blank file on a given directory path.
			f.createNewFile();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String args[]) {
		createFile();
	}

}
