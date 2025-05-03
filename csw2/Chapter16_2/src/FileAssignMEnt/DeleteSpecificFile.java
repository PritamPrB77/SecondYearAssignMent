package FileAssignMEnt;



import java.io.File;
import java.util.Scanner;

public class DeleteSpecificFile {
// to delete you need to enter path
	////  "E:\Sem2csw\Chapter17\src\week9day1\src.txt" src path like this
	//File f = new File("F:\\Sem2csw\\Chapter16_2\\src\\FileAssignMEnt\\diary.txt"); in th prompt with out quotation 
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
