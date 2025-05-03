package FileAssignMEnt;



import java.io.File;
import java.util.Scanner;

public class RenameToAFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// src loc  "E:\Sem2csw\Chapter17\src\week9day1\src.txt" src path
		// rename loc  "E:\Sem2csw\Chapter17\src\week9day1\xyz.txt" src path
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
