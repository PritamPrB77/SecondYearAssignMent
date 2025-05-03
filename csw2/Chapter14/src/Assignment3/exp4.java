package Assignment3;

import java.util.Scanner;

public class exp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         try {
        	 System.out.println("Enter a Numbeer");
        	// int num=sc.nextInt();
        	 String s=sc.next();
//        	 double res=calculateSqareRoot(num);
        	 int num=Integer.parseInt(s);
        	 double res=calculateSqareRoot(num);
        	 System.out.println("result:"+res);
         }
         catch(ArithmeticException |NumberFormatException obj) {
        	 System.out.println("Exception caught");
        	 System.out.println(obj.getMessage());
         }
    
	}
	
	
	public static  double calculateSqareRoot(int num)  throws ArithmeticException{
	     if(num<0) {
	    	 throw new ArithmeticException("negetive number");
	     }
	     return Math.sqrt(num);
		
		}
	

}
