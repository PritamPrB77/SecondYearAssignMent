package Assignment3;

import java.util.Scanner;

public class exp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner sc=new Scanner(System.in);
		
		try {
			String s=sc.nextLine();
			
//			int a=Integer.valueOf(s);
			int a=Integer.parseInt(s);
			try {
			   double res=100/a;
			  System.out.println(res);
			
			}
			catch(ArithmeticException e) {
				System.out.println("exception caught"+"\n"+e.getMessage());
			}
		}
		catch(NumberFormatException  e) {
			System.out.println("exception caught"+"\n"+e.getMessage()+e);
		}
		
		}
		

}
