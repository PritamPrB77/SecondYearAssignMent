package week11day1Date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateExample {
 public static void main(String[] args) {
	 //Getting Current DAte
	 LocalDate obj= LocalDate.now();
	 System.out.println("Current Date:-"+obj);
	 //Creating a Specific DAte
	 System.out.println(LocalDate.of(2025, 1, 22));
	 //parsing Date From String
	 System.out.println(LocalDate.parse("2025-04-22"));
	 // Adding days to CurrentDAte
	 LocalDate taskDate=LocalDate.now().plusDays(7);
	 System.out.println(" New Date:"+taskDate);
	 LocalDate taskDate2=LocalDate.now().plusMonths(5);
	 System.out.println(" New Date with Adding Months:"+taskDate2);
	 LocalDate taskDate3=LocalDate.now().plusYears(4);
	 System.out.println(" New Date with Adding Year:"+taskDate3);
	 LocalDate taskDate4=LocalDate.now().plusWeeks(4);
	 System.out.println(" New Date With Adding Weaks:"+taskDate4);
	 // as per the above shown method we also have the Methods in minus Eg:-minusDays...etc
	 
	 ////ChronoUnit is a part of the Java Time API, which was introduced in Java 8. 
	 ///It provides a standardized way to work with different units of time, 
	 ///making it easier to perform date and time calculations. 
	 ///The ChronoUnit enum includes the following time units:
	 /*
	  * By using the ChronoUnit class, you can easily add or subtract days from a LocalDate and perform date-related calculations,
	  *  making it a powerful tool for working with dates in Java.
	  */
	 LocalDate lastMonth=LocalDate.now().minus(1,ChronoUnit.MONTHS);
	 System.out.println("  Last Months: "+lastMonth);
	 LocalDate lastYears=LocalDate.now().minus(1,ChronoUnit.YEARS);
	 System.out.println("  Last Years: "+lastYears);
	 LocalDate nextMonth=LocalDate.now().plus(1,ChronoUnit.MONTHS);
	 System.out.println("  Next Months: "+nextMonth);
	 //similarly For Days And Months
	 
	 //Question-1 From The Current date add 100 days ,20years , and 4 weak
	 
	 LocalDate currentDate=LocalDate.now();
	 System.out.println(" Current Date:"+currentDate);
	 LocalDate add100Days=currentDate.plusDays(100);
	 System.out.println(" Adding 100Days to urrentDate:"+add100Days);
	 LocalDate add20Years=add100Days.plus(20,ChronoUnit.YEARS);
	 System.out.println(" Adding 20 Years to add100Days :"+add20Years);
	 LocalDate fourWeek=add20Years.plus(4,ChronoUnit.WEEKS);;
	 System.out.println(" Adding 4 weaks to add20Years:"+ fourWeek);
// ShoRTCUt way
	 LocalDate cd=LocalDate.now();
	 LocalDate futureDate=cd.plus(100,ChronoUnit.DAYS).plus(20,ChronoUnit.YEARS).plus(4,ChronoUnit.WEEKS);
	 System.out.println(" FutureDays"+cd);
	 
	 //Getting DaysOFWeaks
	 DayOfWeek whichDay=LocalDate.parse("2025-05-01").getDayOfWeek();
	 System.out.println(" Which Day "+whichDay);
	 int dayOfMonth=LocalDate.parse("2025-05-01").getDayOfMonth();
	 System.out.println(" Days Of Month "+dayOfMonth);
	 int dayOfYear=LocalDate.parse("2025-05-01").getDayOfYear();
	 System.out.println(" Days Of Years "+dayOfYear);
	 
	 
	 //Checking LeapYears
	 boolean isLeap=LocalDate.now().isLeapYear();
	 System.out.println(" ISLeap YEars"+isLeap);
	 
	 //comparing DAtes
	 boolean before =LocalDate.parse("2020-06-13").isBefore(LocalDate.parse("2020-06-09"));
	 System.out.println(" is Before"+before);
	 boolean After =LocalDate.parse("2020-06-13").isAfter(LocalDate.parse("2020-06-09"));
	 System.out.println(" is After"+After);
 }
}
