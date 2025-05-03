package week9day1;

import java.io.File;
import java.util.Scanner;

public class RenameToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("current file name");
  Scanner sc=new Scanner(System.in);
  String curremtName=sc.nextLine();
  System.out.println("Enter New file name");
  String newname=sc.nextLine();
  File  file=new File(curremtName);
  File  newfile=new File(newname);
  
//  check file existance
  if(!file.exists()) {
	  System.out.println("file doesnt exits");
	  return;
  }
  if(file.renameTo(newfile)) {
	  System.out.println("file renamed successfully");
  }
  else {
	  System.out.println("File couldnt be Renamned");
	  sc.close();
  }
	}
}
