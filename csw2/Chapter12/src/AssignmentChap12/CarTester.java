package AssignmentChap12;

import java.util.Scanner;



class car{
	
	private String make;
	private String model;
	
	//setter method to Set Make
	public void setmake(String make) {this.make=make;  }
	
	//getter Method To get Make
	public String Getmake() {return this.make;}
	//setter method to Set Model
	public void setmodel(String model) {this.model=model;  }
	//getter Method To get Model
	public String Getmodel() {return this.model;}
	
	 //constructor
	public car(String make,String model) {
		this.make=make;
		this.model=model;
		System.out.println("makeis"+this.make+"  "+" model is"+ this.model);
	}

}

public class CarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//using constructor
		System.out.println("enter make and model constructor");
		car Mycar1=new  car(sc.next(),sc.next());
		car mycar2= new car(null,null);
		//usinmg method
		System.out.println("enter make and model for method");
		mycar2.setmake(sc.next());
		mycar2.setmodel(sc.next());
		System.out.println("make is"+mycar2.Getmake()+"  "+"model is "+mycar2.Getmodel());
	}

}
