package Assignment2_1;


import java.util.*;


class AgeComp implements Comparator<Studentt> 
{

	@Override
	public int compare(Studentt o1, Studentt o2) {
		// TODO Auto-generated method stub
		
		if( o1.getAge()<o2.getAge()) {
			return -1;
		}
		
		
		else if(o1.getAge()>o2.getAge()) {
			return 1;
		}
		return 0;
	}
}


 class NameCmp implements Comparator<Studentt> {

	@Override
	public int compare(Studentt o1, Studentt o2) {

		return o1.getName().compareTo(o2.getName());
	}

}


   class rollComp implements Comparator<Studentt> {

		@Override
		public int compare(Studentt o1, Studentt o2) {
			return Integer.compare(o1.getRollno(), o2.getRollno());
		}


	}



 class Studentt {
          
	private int rollno,age;
	private String name;
	Studentt(int x,int y,String z){
		this.rollno=x;
		this.age=y;
		this.name=z;
	
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", age=" + age + ", name=" + name + "]";
	}


	@Override
	public boolean equals(Object obj) {
		Studentt that=(Studentt)obj;
		
		if(this.age==that.age && this.name==that.name && this.rollno==that.rollno) {
			return true;
		}
		return false;
	}
	
}





public class Comparetordriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Studentt[] arr=new Studentt[3];
		arr[0]=new Studentt(101,23,"xyz");
		arr[1]=new Studentt(100,22,"abc");
		arr[2]=new Studentt(103,21,"pqr");
		
	for(Studentt i:arr) {
		System.out.println(i.toString());
	}
	
	System.out.println(".................Name................");
	
	Arrays.sort(arr,new NameCmp());
	for(Studentt i:arr) {
		System.out.println(i.toString());
	}
	System.out.println(".................Age................");
	Arrays.sort(arr,new AgeComp());
	for(Studentt i:arr) {
		System.out.println(i.toString());
	}

	System.out.println(".................RollNo................");
	Arrays.sort(arr,new rollComp());
	for(Studentt i:arr) {
		System.out.println(i.toString());
	}
		

	}

}
