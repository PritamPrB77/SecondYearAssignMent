 package week8day3;

import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile23 {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("F:\\Sem2csw\\Chapter16_2\\src\\week8day3\\demo.txt");
			//Read the single character
			int c=fr.read();
			System.out.println("Single char:"+(char)c);
			
			//Read a portion of character into a charArr
			char[] charArr=new char[9];
			int charRead=fr.read(charArr,2,7);
			System.out.println("charRead:"+charRead);
					
			for(char ch:charArr)
				System.out.print(ch+ " ");
			System.out.println();
			
			//Read All
			//rest all
			int chh;
			while((chh=fr.read())!=-1) {
				System.out.print((char)chh+" ");
			}
			fr.close();
				
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
