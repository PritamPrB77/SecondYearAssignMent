package FileAssignMEnt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class DisplayMetaDAta {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// src loc "E:\Sem2csw\Chapter17\src\week9day1\src.txt" src path
		// rename loc "E:\Sem2csw\Chapter17\src\week9day1\xyz.txt" src path
		System.out.println("file name");
		Scanner sc = new Scanner(System.in);
		String inpfile= sc.nextLine();
	
		File f = new File(inpfile);

//  check file existance
		if (!f.exists()) {
			System.out.println("file doesnt exits");
			return;
		}
		else { 
        System.out.println(" file size is"+f.length());
        System.out.println("File was last Modified"+f.lastModified());
        System.out.println(f.lastModified());
        System.out.println(f.length());
        
		}

	}

}
