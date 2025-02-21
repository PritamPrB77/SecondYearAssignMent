package WEAK3DAY1;

import java.util.*;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList <Integer>al1=new  ArrayList<>();
		
		System.out.println("Eneter Size To Add");
		int a =sc.nextInt();
		for(int i=0;i<a;i++) {
			al1.add(sc.nextInt());
		}
		
		System.out.println(al1);
		System.out.println("Enter The Number yOU wANT TO SEARCH ");{
			int  b=sc.nextInt();	
			System.out.println(" is element "+b+" present "+al1.contains(b));
			
		}
		
		System.out.println(al1);
		System.out.println("Want To remove Enter Position ");
		al1.remove(sc.nextInt());
		System.out.println(al1);
		
		System.out.println(" is ArrayList is Empty "+  al1.isEmpty());	
		System.out.println(al1);
		System.out.println(al1.reversed());// Used tO pRINT IN rEVERSED oRDERED
		

	}

}
