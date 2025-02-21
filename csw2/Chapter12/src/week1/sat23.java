package week1;

import java.util.Scanner;



class sat23 {}

 class car{
	
	private String make;
	private String model;
	
	//setter method to Set Make
	public void setmake(String make) {this.make=make;  }
	
	//getter Method To get Make
	public String Getmake() {return this.make;}
	//setter method to Set Model
	public void setmodel(String make) {this.model=model;  }
	//getter Method To get Model
	public String Getmodel() {return this.model;}
	
	 //constructor
	public car(String make,String model) {
		this.make=make;
		this.model=model;
		System.out.println("makeis"+this.make+"  "+" model is"+ this.model);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//using constructor
		System.out.println("enter make and model constructor");
		car s1=new  car(sc.next(),sc.next());
		car s2 = new car(null,null);
		//usinmg method
		System.out.println("enter make and model for method");
		s2.setmake(sc.next());
		s2.setmodel(sc.next());
		System.out.println("make is"+s2.Getmake()+"  "+"model is "+s2.Getmodel());
		

	}
  
}

