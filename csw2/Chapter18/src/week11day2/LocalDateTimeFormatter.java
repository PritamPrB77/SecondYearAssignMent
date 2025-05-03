package week11day2;
// import java.time.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class LocalDateTimeFormatter {
public static void main(String []args) {
	LocalDateTime dateTime=LocalDateTime.of(2024, 5,30,23,45,33);
	System.out.println("Current format= "+dateTime);
    DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy/MM/DD HH:MM:SS a");
    //HH- 24 hr format
    //hh- 12 hr format
    String formattedDateTime=dateTime.format(formatter);
    System.out.println("Formatted DateTime: "+formattedDateTime);
    
    String currentdatetime=LocalDateTime.now().format(formatter);


    
}
}
