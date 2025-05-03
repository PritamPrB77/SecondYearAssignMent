package week9day1;

import java.io.File;
import java.util.Scanner;

public class DeleteSpecificFile {

	public static void main(String[] args) {
            System.out.println("EnterFileNAme to Delelte");
            Scanner sc=new Scanner(System.in);
            String FileName=sc.nextLine();
            File f=new File(FileName);
            if(!f.exists()) {
            	System.out.println("File does not exits");
            	return;
//            	 it return from the function
            }
           if(f.delete()) {
        	   System.out.println("File deletre Successfully");
           }
           else {
        	   System.out.println("File Couldnt be deleted");
        	   sc.close();
           }
	}

}
