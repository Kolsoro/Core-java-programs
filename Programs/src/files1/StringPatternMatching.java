package files1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPatternMatching {

	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("/Users/samergosain/Faltu_Kachra/files/test.txt");
		writer.write("Writing in the test file!");
		writer.close();
		System.out.println("writing is closed");
		BufferedReader br = new BufferedReader(new FileReader("/Users/samergosain/Faltu_Kachra/files/test.txt"));
		Pattern pattern = Pattern.compile("[A-Za-z][a-z]+");
		System.out.println("Patterns matching the string are :");
		String line;
		while ((line = br.readLine()) != null) {
			Matcher matcher = pattern.matcher(line);
			while (matcher.find()) {
				int start = matcher.start(0);
				int end = matcher.end(0);
				System.out.print(line.substring(start, end)+"|");
			}
		}

	}

}
