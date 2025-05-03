package FileAssignMEnt;



import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFileContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Source Path");
//  "E:\Sem2csw\Chapter17\src\week9day1\src.txt" src path
		Scanner sc = new Scanner(System.in);
		String sourcePath = sc.nextLine();
		System.out.println("Enter DestinationPath");
//"E:\Sem2csw\Chapter17\src\week9day1\dst.txt" src path
		String destPath = sc.nextLine();

		File src = new File(sourcePath);
		File dst = new File(destPath);
		
		if(!src.exists()||!dst.exists()) {
			System.out.println("File cant be readable");
			return;
		}
		if(!src.canRead()||!dst.canWrite()) {
			System.out.println("Read And wrote not possible");
			 return;
		}
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dst, true);
			// used for not overriding previous content
			int ch;

			/*
			 * How Works? fr,fw let msg=javv it read the single character j when empty it
			 * return -1 int value=65;// it wrote its ascii value //write(int c)
			 * fw.write(45);//- to wrote 1,2,3 you need to wrote it in String format likr
			 * fw.write("1");....
			 */
			while ((ch = fr.read()) != -1) {
				// fr.read() return integer value/ascii value of that code
				// when we print chars ascii value printed
				fw.write(ch);// when we write into file it converts int to character inbuiltely and wrote it
								// that character
			}
			fr.close();
			fw.close();
			sc.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
