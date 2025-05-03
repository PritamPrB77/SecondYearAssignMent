 package Assignment3;

import java.util.Scanner;

public class exp1 {

	public static void main(String[] args) 
	{ 
//	        String s="SOA ITER 2025"; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter AlphaNumeric String");
	        String s=sc.nextLine();;
	        String num=""; 
	        System.out.println("AlphaNumeric String is : " + s); 
	        try 
	        { 
	        	
	        	if(s==null || s.length()==0||s=="") {
	        		throw new  NullPointerException ("String is Null Enter valid STring");
	        	}
	        	else {
	        		 for(char c:s.toCharArray()) 
	        	          { 
	        			 int a=(int)c;
	     	            
	     	            if (a>=49&&a<=57) {
	     	                  num+=c;
	     	            }
	     	         
	     	             } 
	      
	     	            if(!(num.length()==0)) {
	     	                 System.out.println("Numeric String is : " + num); 
	     	            }
	     	            else {
	     	            	System.out.println("No Numeric Character Present");
	     	            }
	        	}
	        } 
	        catch (NullPointerException e) 
	        { 
	            System.out.println(e); 
	        } 
}
}
