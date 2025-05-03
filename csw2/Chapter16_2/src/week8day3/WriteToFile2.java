             package week8day3;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile2 {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("F:\\Sem2csw\\Chapter16_2\\src\\week8day3\\demo3.txt");
			//write(String)
			fw.write("Java Program");
			fw.write('\n');
			char[] charArr= {'H','e','l','l','o'};
			//write(char[])
			fw.write(charArr, 1,3);
			fw.write('\n');
			int value=65;// it wrote its ascii value
			//write(int c)
			fw.write(value);
			fw.write('\n');
			//write(String,int,int)
			fw.write("World",1,3);
			fw.write("1111111");
			fw.write(45);//-
			fw.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
