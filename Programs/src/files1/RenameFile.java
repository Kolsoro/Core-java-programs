package files1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RenameFile {
	public static void main(String[] args) throws IOException, InterruptedException {

		Path oldFile = Paths.get("/Users/samergosain/Faltu_Kachra/files/hello.txt");

		try {
			Files.move(oldFile, oldFile.resolveSibling("Samer.txt"));
			System.out.println("File successfully renamed");

		} catch (IOException e) {}
	}
}
