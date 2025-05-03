package AssignMentlambda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class date1 {
public static void main(String[]args) {
	
	 LocalDateTime currentDate=LocalDateTime.now();
	 System.out.println("Current Date & Time : "+currentDate);
	 //Calculate 2 weak
	 LocalDateTime  twoWeeks=LocalDateTime.now().plusWeeks(2);
	 System.out.println(" After 2 weaks  "+twoWeeks);
	 // Display The Date i n Format
	 DateTimeFormatter date= DateTimeFormatter.ofPattern("mm/dd/yyyy");
	 String formatDate=LocalDateTime.now().format(date);
	 System.out.println(" Formatted  Date: "+formatDate);

	
}
}
