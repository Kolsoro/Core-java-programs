package files1;

import java.io.File;
import java.io.IOException;

public class ReadOnlyFile {

	public static void main(String[] args)  {

		try {

			boolean flag;
			File f = new File("/Users/samergosain/Faltu_Kachra/files/hello.txt");
			flag = f.setWritable(false);
		    if(!f.canWrite()) 
		    	System.out.println("file is read only");
		    else
		    	System.out.println("file is writable");
		    
		}catch(Exception e) {
			System.out.println("sorry unable to change the read only mode");
		}
	
	}

}
