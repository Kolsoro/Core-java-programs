package files1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyFromFileaToFileb {

	public static void copyContent(File a, File b) throws IOException {

		FileInputStream fin = new FileInputStream(a);
		FileOutputStream fout = new FileOutputStream(b);
		int n;
		try {
			while ((n = fin.read()) != -1) {
				fout.write(n);
			}
		} finally {
			if (fin != null)
				fin.close();
			if (fout != null)
				fout.close();
			System.out.println("file copied");
		}
	}

	public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the file path you want to read from :");
		String a =br.readLine();
		System.out.println("enter the file path you want to write to :");
		String b=br.readLine();
		File x=new File(a),y=new File(b);
        copyContent(x, y);		
	}

}
