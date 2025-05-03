package week8day3;

import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile2 {
	public static void main(String[] args) {
		try {
			FileReader fr= new FileReader("F:\\Sem2csw\\Chapter16_2\\src\\week8day3\\demo1.txt");
			//read single character
			int c= fr.read();
			System.out.println("single char: "+(char)c);
			//read a portion of character into char arr
			char [] charArr=new char[5];
			int charead= fr.read(charArr);
			System.out.println("charRead: "+charead);
			for(char ch:charArr) {
				System.out.print(ch+" ");
			}
//			Read All
			// bUt here It reads The Rest Part 
			int chh;
			while((chh=fr.read())!=-1) {
				System.out.println((char)chh+" ");
			}
//			When file has no data it return -1
			fr.close();
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

		}

}
