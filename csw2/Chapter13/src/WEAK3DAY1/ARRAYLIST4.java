package WEAK3DAY1;

import java.util.*;

class user{
	 int age;
	 String name;
	 user(int age,String name){
		 this.name=name;
		 this.age=age;
	 }
	 
	 public String  toString() {
		return ""+this.age+""+this.name ;
		 
	 }
	 
 }

public class ARRAYLIST4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<user> s1=new ArrayList<>();
		System.out.println("Enter the size of Arralist And add element");
		int a=2;
		System.out.println("enter");
		for(int i=0;i<a;i++) {
			s1.add(new user(sc.nextInt(),sc.next()));
		}
		
		System.out.println(s1);
		
	System.out.println(	s1.contains(new user(sc.nextInt(),sc.next())));
		

	}

}
