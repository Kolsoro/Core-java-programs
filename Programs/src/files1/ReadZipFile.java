package files1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ReadZipFile {

	public static void readFromZip(String filePath) throws IOException {

		File file = new File(filePath);

		FileInputStream fis = null;
		ZipInputStream zis = null;
		ZipEntry ze = null;
         
		System.out.println("Files in the zip are :");
		fis=new FileInputStream(file);
		zis=new ZipInputStream(new BufferedInputStream(fis));
		while((ze=zis.getNextEntry())!=null) {
			System.out.println(ze.getName());
		}
		zis.close();
	
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the location of zip file :");
		String filePath = br.readLine();
		readFromZip(filePath);
	}
}