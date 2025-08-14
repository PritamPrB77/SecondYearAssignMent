package AssignMentlambda;


//import java.time.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class LocalDateTimeFormatter {
public static void main(String []args) {
	LocalDateTime dateTime=LocalDateTime.of(2024, 5,3,23,45,33);
	System.out.println("Current format= "+dateTime);
 DateTimeFormatter formatter=
 		DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss a");
 //HH- 24 hr format
 //hh- 12 hr format
 /*
  * Corrected Explanation:
✅ yyyy: Year

✅ MM: Month (01–12)

❌ DD: Wrong – DD is day of year (001–365), not day of month!

Use dd for day of month

❌ HH:MM:SS: only HH is correct

MM here is month, but you're using it for minutes – use mm

SS is invalid – use ss for seconds

✅ a: AM/PM marker (only makes sense with 12-hour clock, i.e., hh)
  */
 String formattedDateTime=dateTime.format(formatter);
 System.out.println("Formatted DateTime: "+formattedDateTime);
 
 String currentdatetime=LocalDateTime.now().format(formatter);
 System.out.println(currentdatetime);


 
}
}
