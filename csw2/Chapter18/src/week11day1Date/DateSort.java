package week11day1Date;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DateSort {
	public static void main(String[] args) {
        List<LocalDate> dates = Arrays.asList(
            LocalDate.of(2024, 5, 1),
            LocalDate.of(2022, 3, 14),
            LocalDate.of(2023, 8, 21),
            LocalDate.of(2023, 8, 22),
            LocalDate.of(2023, 8, 20)
        );
        
        

        //dates.sort((d1, d2) -> d1.compareTo(d2));
        Collections.sort(dates,(x,y)->x.compareTo(y));
        dates.forEach(System.out::println);
    }
}
