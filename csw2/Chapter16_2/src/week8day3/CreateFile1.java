package week8day3;

import java.io.File;
import java.io.IOException;

public class CreateFile1 {
  public static void main(String[]args) {
	  try {
	     File f=new File("F:\\Sem2csw\\Chapter16_2\\src\\week8day3\\demo1.txt");
//		   File f=new File("E:\\Sem2csw\\Chapter17\\src\\week8day3\\demo.txt");
		  
	    if(f.createNewFile())
	  			   System.out.println(f.getName());
	  		else
	  			System.out.println("Already Exit");
	  }
	  catch(IOException e) {
		  System.out.println("  "+e.getMessage());
	  }
  }
}
