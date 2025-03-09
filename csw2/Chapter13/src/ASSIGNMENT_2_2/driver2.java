package ASSIGNMENT_2_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class Student{
	private String name; private int age,mark;
	Student(String name,int age, int mark){
		this.name=name;this.age=age; this.mark=mark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", mark=" + mark + "]";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//search based on content comparision
		Student that=(Student) obj;
		// it will not work in name cases so ewual method are important
		if( this.age==that.age && this.name.equals(that.name)&& this.mark==that.mark) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return  Objects.hash(this.name,this.age,this.mark);
	}
	public static void removee(List<Student> al) {
		   Scanner sc=new Scanner(System.in);
           System.out.println("Enter the Object to  it remove");
           
           Student s2=new Student(sc.next(),sc.nextInt(),sc.nextInt());
		 if(al.contains(s2)) {
      	   al.remove(s2);
      	   System.out.println(s2+"  object is removed");
         }
         else {
      	   System.out.println("enterd object not presentr");
         }
	}
	
	public static int count(List<Student> al) {
		return al.size();
	}
	
}


public class driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Student> al=new ArrayList<>();
		al.add(new Student("x",45,450));
		al.add(new Student("a",4,45));
		al.add(new Student("b",5,50));
		al.add(new Student("c",34,111));
		al.add(new Student("d",67,375));
		al.add(new Student("e",12,40));
		al.add(new Student("x",45,450));
		
		for(Student s:al) {
			System.out.println(s);
		}
           System.out.println("Enter the Objec to check it contains or not--name,age,mark");
           
           Student s1=new Student(sc.next(),sc.nextInt(),sc.nextInt());
           if(al.contains(s1)) {
        	   System.out.println(s1+"  it conatins the enterd object");
           }
           else {

        	   System.out.println(s1+" is not present");
           }
        System.out.println("Enter t0 remove");

           Student.removee(al);
       System.out.println(al);
          System.out.println("the number of objects Are"+Student.count(al));
        
           if(al.get(0).equals(al.get(al.size()-1))) {
        	   System.out.println( al.get(0)+" and "+al.get(al.size()-1)+" are equal");
           }
           else {
        	   System.out.println("both are not equal");
           }
             

	}

}
