package Assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;

public class exp11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			// TODO Auto-generated method stub
		//File file=new File("F:\\Sem2csw\\Chapter14\\src\\in\\soa\\PrB\\ExceptionChapter\\example.txt");
			File file=new File("F:\\Sem2csw\\Chapter16_2\\src\\FileAssignMEnt\\diary.txt");
			
			try {
				FileReader fw=new FileReader(file);
				
				int ch;
				while((ch=fw.read())!=-1) {
//					Character chh=(char)ch;
					//in processing you can  add a line covert it to uppercase;
					System.out.println((char)ch+"  "+new Date());
//					System.out.println(chh.toUpperCase(chh)+" ");
				}
			}
			catch(IOException obj) {
				System.out.println("Exception caught");
				System.out.println(obj.getMessage());;
			}
			finally {
				System.out.println("rest part");
			}
			


	}

}
