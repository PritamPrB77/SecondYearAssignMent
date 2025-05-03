package week8day3;
import java.io.File;
import java.io.IOException;

public class CreateFile2 {

	public static void main(String[] args) {
		try {
			File f=new File("D:\\myFile.txt");
		
			if(f.createNewFile())
				System.out.println(f.getName());
			else
				System.out.println("file is Already Created");
			if(f.delete()) {
				System.out.println("Successfully deleted");
			}
		}
	
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
