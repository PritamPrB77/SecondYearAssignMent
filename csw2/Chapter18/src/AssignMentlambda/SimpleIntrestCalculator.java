package AssignMentlambda;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class SimpleIntrestCalculator {
public static void main(String[]args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter start and end date  DOB Format -yyyy-mm-dd ");
	LocalDate stDate=LocalDate.parse(sc.nextLine());
	LocalDate endDate=LocalDate.parse(sc.nextLine());
	Long daysBtn = ChronoUnit.DAYS.between(stDate,endDate);
	System.out.println("Enter Principal Amt");
	double p=sc.nextDouble();
	double intrest=8.0;
	double time=daysBtn/365;
	double intrestAmt= (p*intrest*time)/100;
	double totalAmt=p+intrestAmt;
	System.out.println("Intrest Amt on your balance is"+ intrestAmt);
	System.out.println(" After Adding amt to your SI total is"+totalAmt );
}
	
}
