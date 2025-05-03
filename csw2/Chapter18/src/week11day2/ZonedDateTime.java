package week11day2;
import java.util.*;
import java.time.ZoneId;
public class ZonedDateTime {
public static void main(String[]args){
//to create time zone
ZoneId id= ZoneId.of("Asia/Seoul");
System.out.println("id: "+id);

//to get all the time zone
Set<String>allIds =ZoneId.getAvailableZoneIds();
System.out.println("Available time zone "+allIds);

}
}