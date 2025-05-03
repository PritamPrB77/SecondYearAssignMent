package FileAssignMEnt;

import java.util.*;
import java.io.*;

public class DiaryFileEnttry {

	public static void main(String[] args) {

		File f = new File("F:\\Sem2csw\\Chapter16_2\\src\\FileAssignMEnt\\diary.txt");
		
		System.out.println(" Enter your diary entry ");
		Scanner sc = new Scanner(System.in);
		String entry = sc.nextLine();
		try {
			if (!f.exists()) {
				f.createNewFile();
				System.out.println(f.getName() + " created");
			} else {

				System.out.println("file already exit ");
			
				String content = "\n"+new Date() + "\n" + entry;
				FileWriter fw = new FileWriter(f,true);
				fw.write(content);
				System.out.println("Entry Saved Successfully");
				fw.close();
				sc.close();

			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
