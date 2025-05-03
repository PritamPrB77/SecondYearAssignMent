package week6day1;

import java.io.DataInputStream;

public class Exceptione3 {
  
	public static void main(String[] args) {
		try{
			DataInputStream input=new DataInputStream(System.in);
			int x,y,result=0;
			System.out.println("Enter the first Number");
			x=Integer.parseInt(input.readLine());
			System.out.println("Enter second Number");
			y=Integer.parseInt(input.readLine());
			result=x/y;
			System.out.println("result is"+result);
		}
		
		 
//}catch(ArithmeticException obj) {
//	 System.out.println("exception caught");
//	 System.out.println(obj.getMessage());
//	 
//}catch(NumberFormatException obj) {
//     System.out.println("Exception caught");
//     System.out.println(obj.getMessage());
//     }
// catch(IOException obj) {
//         System.out.println("Exception caught");
//         System.out.println(obj.getMessage());
//         }
		
		
		catch(Exception  e ) {
			// instead of writing all catch block for individual exception if we wrote that it handels all the exception 
			// it is the parent class of all the exceptons
			System.out.println("Exception caught");
			System.out.println(e.getMessage());
			
		}
		
		finally {
			System.out.println("mein to run hoga");
		}
	}
}
