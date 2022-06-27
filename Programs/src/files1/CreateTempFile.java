package files1;

import java.io.File;
import java.io.IOException;

public class CreateTempFile {

	public static void main(String[] args) throws IOException, InterruptedException {

		
		File tempFile=File.createTempFile("exampleFile", ".txt", 
				new File("/Users/samergosain/Faltu_Kachra/files/"));
		System.out.println(tempFile.getAbsolutePath());
		
		tempFile.deleteOnExit();
		

	}

}
