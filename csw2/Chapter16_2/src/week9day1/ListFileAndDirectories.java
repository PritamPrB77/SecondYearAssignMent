package week9day1;

import java.io.File;
import java.util.Scanner;

public class ListFileAndDirectories {

	public static void main(String[] args) {
   System.out.println("Enter Directory Path");
   Scanner sc=new Scanner(System.in);
   String directoryPath=sc.nextLine();
   File f=new File(directoryPath);
//   validate the directorypath
   if(!f.exists()||!f.isDirectory()) {
	    System.out.println("Director Doesnt Exists");
	    return;
   }
   System.out.println("Listing All Files");
   String[] fileList=f.list();
   for(String str:fileList)
	   System.out.println(str);
	}

}
