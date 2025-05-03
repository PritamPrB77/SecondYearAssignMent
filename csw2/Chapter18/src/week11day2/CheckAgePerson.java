package week11day2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CheckAgePerson {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The DOB-yyyy-mm-dd");
		
//		 LocalDate dob=LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
		LocalDate dob=LocalDate.parse(sc.next());
		 System.out.println(dob);
		 LocalDate currentDate=LocalDate.now();
		int age=currentDate.getYear()-dob.getYear();
		if(currentDate.getMonthValue()<dob.getMonthValue() || 
		      (currentDate.getMonthValue()==dob.getMonthValue() && currentDate.getDayOfMonth()<dob.getDayOfMonth())) {
			age--;
		}
		
		System.out.println(" Age is"+ age);
		
	}

}


