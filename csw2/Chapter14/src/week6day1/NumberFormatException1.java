package week6day1;

import java.util.*;
import java.lang.*;
public class NumberFormatException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x=0;
			x=Integer.parseInt("ss");
			System.out.println(x);
		}
		 catch (NumberFormatException e) {
		
			System.out.println("Exception caught");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	
		
		finally {
			System.out.println("Rest portion of code...");
		}
	}

}
