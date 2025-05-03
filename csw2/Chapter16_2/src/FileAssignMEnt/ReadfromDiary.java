package FileAssignMEnt;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadfromDiary {
	public static void main(String[] args) {
		File f = new File("F:\\Sem2csw\\Chapter16_2\\src\\FileAssignMEnt\\diary.txt");
		if(f.exists()) {
			System.out.println(f.getName()+" exists");
		    try {
		    	System.out.println("Diary Are");
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
