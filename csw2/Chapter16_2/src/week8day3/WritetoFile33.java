package week8day3;

import java.io.FileWriter;
import java.io.IOException;

public class WritetoFile33{
public static void main(String args[]) {
	try {
		FileWriter fw=new FileWriter("F:\\Sem2csw\\Chapter16_2\\src\\week8day3\\demo.txt");
//		 if file was not  created the it automatically creates file  then perform erote opertaions
//		write (String path
		
		fw.write("java programme");
		fw.write('\n');
		char[]charArr= {'H','e','l','l','o','o','H','e','l','l','o','o','H','e','l','l','o','o'};
//		write(char[]);
		fw.write(charArr);
		fw.write('\n');
//		fw.write(String, int,int);
		int value=65;;
		fw.write("world",1,3);
//		here in the baove only substring is written from 1 to 3 1,2,3 index written inside the file;
		fw.write(value);
		fw.close();
//		 it can't wrote the file if you can wrote the above statement
		
	}
	catch(IOException e) {
		System.out.println(e.getMessage());
	}
}
}
