package test3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class WordsCount {
	
	public static void main(String args[]) throws IOException {
	
//		String line="";	
//		ArrayList<String> words=new ArrayList<>();
//		FileReader fr=new FileReader("/Users/samergosain/Faltu_Kachra/files/data.txt");
//		BufferedReader br=new BufferedReader(fr);
//		
//		while((line=br.readLine())!=null) {
//			String[] strings=line.toLowerCase().split("([.,\\s]+)");
//			for(String s:strings) {
//				words.add(s);
//			}
//	}
//		System.out.println(words.size());

		   String line;  
	        int count = 0;  
	  
	        //Opens a file in read mode  
	        FileReader file = new FileReader("/Users/samergosain/Faltu_Kachra/files/data.txt");  
	        BufferedReader br = new BufferedReader(file);  
	  
	        //Gets each line till end of file is reached  
	        while((line = br.readLine()) != null) {  
	            //Splits each line into words  
	            String words[] = line.split(" ");  
	            //Counts each word  
	            count = count + words.length;  
	  
	        }  
	  
	        System.out.println("Number of words present in given file: " + count);  
	        br.close();  

}}
