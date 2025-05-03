package week8day3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class CreateandWrite1 {

	public static void main(String[] args) {
		File f=new File("D:\\diary.txt");
		if(f.exists())
			System.out.println(f.getName()+" exists");
		else {
			try {
				f.createNewFile();
				System.out.println("Enter your diary entry:");
				Scanner sc=new Scanner(System.in);
				String entry=sc.nextLine();
				String content=new Date() + "\n" +entry;
				FileWriter fw=new FileWriter(f);
				fw.write(content);	
				System.out.println("Entry Saved Successfully");
				fw.close();
				sc.close();				
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
