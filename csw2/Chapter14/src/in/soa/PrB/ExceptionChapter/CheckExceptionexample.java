package in.soa.PrB.ExceptionChapter;


import java.io.*;
import java.util.*;
public class CheckExceptionexample {

	/*
	 * 
	 * try {
    File file = new File("empty.txt");
    Scanner sc = new Scanner(file);
    System.out.println(sc.nextLine()); // Error: file me kuch nahi hai
} catch (NoSuchElementException e) {
    System.out.println("File is empty!");     
}
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File file=new File("F:\\Sem2csw\\Chapter14\\src\\in\\soa\\PrB\\ExceptionChapter\\example.txt");
		File file=new File("example.txt");
		
		try {
			Scanner sc=new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException obj) {
			System.out.println("Exception caught");
			System.out.println(obj.getMessage());;
		}
		finally {
			System.out.println("rest part");
		}
		 
	}

}
