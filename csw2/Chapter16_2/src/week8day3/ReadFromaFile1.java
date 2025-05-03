package week8day3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromaFile1 {

	public static void main(String[] args) {
		File f=new File("D:\\diary.txt");
		if(f.exists()) {
			System.out.println(f.getName()+" exists");
		    try {
		    	FileReader fr=new FileReader(f);
		    	int ch;
		    	while((ch=fr.read())!=-1)
		    		System.out.print((char)ch+" ");
		    	fr.close();
		    }
		    catch(IOException e) {
		    	System.out.println(e.getMessage());
		    }
		}
		else {
			System.err.println("file not exist");
		}

	}

}
