package week9day1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFileContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("Enter Source Path");
//  "E:\Sem2csw\Chapter17\src\week9day1\src.txt" src path
  Scanner sc=new Scanner(System.in);
  String sourcePath=sc.nextLine();
  System.out.println("Enter DestinationPath");
//"E:\Sem2csw\Chapter17\src\week9day1\dst.txt" src path
  String destPath=sc.nextLine();
  
  File src = new File(sourcePath);
  File dst= new File(destPath);
  try {
	  FileReader fr=new FileReader(src);
	  FileWriter fw=new FileWriter(dst,true);// used for not overriding previous content
	  int ch;
	 
	  /*
	   * How Works?
	   * fr,fw
	   * let msg=javv it read the single character j when empty it return -1
	   * 
	   */
	  while((ch=fr.read())!=-1) {
          // fr.read() return integer value/ascii value of that code 
		  // when we print chars  ascii value  printed
		  fw.write(ch);// when we  write  into file it converts  int to character inbuiltely and wrote it that character
	  }
	  fr.close();
	  fw.close();
	  sc.close();
  }
  catch(IOException e) {
	  System.out.println(e.getMessage());
  }
	
	}

}
