 package week9day1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class appendToFile {

	public static void main(String[]args) {
		File f=new File("F:\\Sem2csw\\Chapter16_2\\src\\week9day1\\diary.txt");
		if(f.exists()) {
			System.out.println(f.getName()+"exists");
		  try {
			  FileWriter fw=new FileWriter(f,true);
//          append mode must be true and by default it is false  else it will not working it override the previous content
//			  
			  System.out.println("Enter Text To Append");
			  Scanner sc=new Scanner(System.in);
			  String entry=sc.nextLine();
			  String content=new Date()+"\n"+entry+"\n";
//			  fw.write(content);
			  fw.append(content);
			  System.out.println("Entry Append SuccessFully");
			  fw.close();
			  sc.close();
		  }
		   catch(IOException e) {
			  System.out.println(e.getMessage());
		      }
		  
		}
		  else {
			  System.out.println("File Not Exists");
		  }
	

	}
}
