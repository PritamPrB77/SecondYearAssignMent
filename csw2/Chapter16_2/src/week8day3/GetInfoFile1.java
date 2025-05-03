package week8day3;
import java.io.File;
import java.io.IOException;

public class GetInfoFile1{

	
//	File f = new File("F:\\Sem2csw\\Chapter17\\src\\week8day3\\diary.txt");
	public static void main(String[] args) {
		File f = new File("F:\\Sem2csw\\Chapter17\\src\\week8day3\\diary.txt");
		if(f.exists()) {
			//get file name
			System.out.println(f.getName());
			//full path from the root directory
			System.out.println(f.getAbsolutePath());
			f.setReadable(true);
			f.setWritable(true);
			//check whether readable or not
			System.out.println(f.canRead());
			//check whether writable or not
			System.out.println(f.canWrite());
			//length of file in bytes and return zero for empty file
			System.out.println(f.length());
		}
		else {
			System.out.println("file not exist");
		}

	}

}
