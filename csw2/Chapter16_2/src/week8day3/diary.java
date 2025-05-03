package week8day3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class diary {
  public static void main(String[]args) {
	   try {
		 String br="";
		   File f=new File("E:\\Sem2csw\\Chapter17\\src\\week8day3\\diary.txt");
		   FileReader fr= new FileReader("E:\\Sem2csw\\Chapter17\\src\\week8day3\\diary.txt");
		   FileWriter fw=new FileWriter("E:\\Sem2csw\\Chapter17\\src\\week8day3\\diary.txt");
		   if(f.createNewFile()) {
			   System.out.println("File created"+f.getName());
		   }
		   else {
				
			 System.out.println(" File Is Already Created");
			 int chh;
				while((chh=fr.read())!=-1) {
					br+= (char) chh;
				}
				 
				System.out.println("prev String"+br);
			}
//		   Scanner sc=new Scanner(System.in);
//		   System.out.println("wanna to add press 1");
//		   while(sc.nextInt()==1) {
//			   String s=sc.next();
//			   br+=s;
//			   
//			   System.out.println("wanna to add press 1");
//		   }
//		   System.out.println(br);
//		   fw.write(br);
//		 
//		   fw.close();
		   
		   
	   }
	   catch(IOException e) {
			System.out.println(e.getMessage());
		}
	     
  }
}
