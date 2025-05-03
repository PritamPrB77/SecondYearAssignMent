package week8day2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Employee {
//private String f_name,m_name,l_name;
	private int age; 
private String name;
private LocalDate dob;
Employee(String name, LocalDate date1,int age ){
	 this.dob=date1;
	 this.age=age;
this.name=name;
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
@Override
public String toString() {
	return "Employee [age=" + age + ", name=" + name + ", dob=" + dob + "]";
}


public void setName(String name) {
	this.name = name;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}

public String passwordMaker() {
	String[] words= this.name.split(" ");
	String s=this.dob.toString();
	String[] date=s.split("-");
	
	System.out.println(date[0]);
	
	int year=this.dob.getYear();
	System.out.println(year);
	return ""+words[words.length-1]+year;
	
}

public static void main(String[] args) { 
	
	
//	
//	 SimpleDateFormat ft 
//     = new SimpleDateFormat("dd-MM-yyyy"); 
//	 
//	 String str = "02/18/1995"; 
//     ft = new SimpleDateFormat("MM-dd-yyyy"); 
//     Date date = null;
//     try {
//		 date = ft.parse(str);
//	} catch (ParseException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} 

//	https://www.freecodecamp.org/news/java-scanner-nextline-call-gets-skipped-solved/
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter The Year, month,date");
	LocalDate date = LocalDate.of(sc.nextInt(),sc.nextInt(),sc.nextInt());
    System.out.println(date);
	System.out.println("Enter Name");
	String name;
	name=new String(sc.nextLine());
	System.out.println("Enter Age");
	int age=Integer.parseInt(sc.nextLine());
	Employee e1=new Employee(name,date,age);
	System.out.println(e1.passwordMaker());
	
   System.out.println("Details of Studnet is");
   System.out.println(e1);
}

}
