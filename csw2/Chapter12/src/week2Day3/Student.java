package week2Day3;

import java.util.*;

public class Student {
private int id;
private String Name;

   public Student(int id, String Name) {
	   this.id=id;
	   this.Name=Name;
	   
   }
 
   // if we use  @Override we need To follow Actual Method signature  to override to we implement onject class
   // object package
   //else we can write in Normal studednt class insted of object class if we wriote student we dont need 
   // to perform downcasting if we use student class; 
   @Override
   public boolean equals(Object s)// This Object  is from Object class
   {	
	   
	   Student that=(Student)s;//Downcasting
	   if((this.id==that.id)&&(this.Name==that.Name)) {  // ques comesequal condition based on id
		   return true;
            }
	   else  return false;
   }
   
   @Override
   public int hashCode() {
	   return Objects.hash(id,Name);//in HashCode We  we Also Pass id
	   //Objects Class is inherited from utiliclass;
   }
   
   
   
   
	   public static void main(String[] args) {
   
		// TODO Auto-generated method stub
		
		Student s1=new Student(1,"Rama");
		Student s2=new Student(1,"Rama");
		Student s3=new Student(2,"Rama");
		boolean res=(s1==s2);
		System.out.println("s1 equals s2 "+ res);
		boolean res2=(s1.equals(s2));
		System.out.println("s1 equals s2 "+ res2);
		boolean res3=((s1.Name).equals(s2.Name));
		System.out.println("s1 equals s2 "+ res3);
		System.out.println(s1.hashCode()+"\n"+s2.hashCode()+"\n"+s3.hashCode());

	}

}
