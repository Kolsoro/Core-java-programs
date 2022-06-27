package files1;

import java.io.File;
import java.io.IOException;

public class CompareFilePaths {
	
	public static void main(String args[]) throws IOException {
		
		File file1=new File("/Users/samergosain/Faltu_Kachra/files/file1.txt");
		File file2=new File("/Users/samergosain/Faltu_Kachra/files/file2.txt");
		File file3=new File("/Users/samergosain/Faltu_Kachra/files/file1.txt");

		if(file1.compareTo(file2)==0)
			System.out.println("paths of file1 and file2 are same ");
		else
			System.out.println("paths of file1 and file2 are not  same ");
		
		if(file1.compareTo(file3)==0)
			System.out.println("paths of file1 and file3 are same ");
		else
			System.out.println("paths of file1 and file2 are not same ");
	}

}
