package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class exp6 {

	public static void main(String[] args) 
	{ 
	Scanner sc=new Scanner(System.in); 
	int a[]= {54,7,8,435,65,01,98}; 
	try 
	{ 
	System.out.println("Original array: "); 
	for (int i=0;i<a.length;i++) 
	{ 
	System.out.print(a[i]+" "); 
	} 
	System.out.println("\nSorted array is :"); 
	Arrays.sort(a); 
	for (int i=0;i<a.length;i++) 
	{ 
		System.out.print(a[i]+" "); 
	} 
	
	System.out.println("\nEnter a postion to find element:"); 
	int n=sc.nextInt(); 
	System.out.println("Search found : " + a[n]); 
	} 
	catch(ArrayIndexOutOfBoundsException e ) 
	{ 
		System.out.println("exception caught"+e.getMessage());
	} 
	}

}
