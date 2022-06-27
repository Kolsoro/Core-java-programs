package test3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class MostRepeatedWords {
	
	
	public static void main(String args[]) throws IOException {
		int count=0;
		int max=0;
		String word="";
		String line="";
		ArrayList<String> words=new ArrayList<>();
		FileReader fr=new FileReader("/Users/samergosain/Faltu_Kachra/files/data.txt");
		BufferedReader br=new BufferedReader(fr);
		
		while((line=br.readLine())!=null) {
			String[] strings=line.toLowerCase().split("([,.\\s]+)");
				for(String s:strings) 
					words.add(s);
			
		}
		
		for(int i=0;i<words.size();i++) {
			count=1;
			for(int j=i+1;j<words.size();j++) {
				if(words.get(i).equals(words.get(j)))
					count++;
			}
			if(max<count) {
				max=count;
				word=words.get(i);
			}
		}
		System.out.println(word+" ,count : "+max);
		br.close();
		
	}
	
	
}
