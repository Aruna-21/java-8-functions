package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTemeExample {
    public static void main(String[] args) {

        //using LocalDateTime to print current date and time
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println("localDateTime:"+localDateTime);
        System.out.println(LocalDateTime.of(2022,11,2,12,01,23,2));

        System.out.println("getHour:"+localDateTime.getHour());
        System.out.println("getMinute:"+localDateTime.getMinute());

        LocalDate localDate=LocalDate.of(2022,11,3);
        System.out.println("atTime:"+localDate.atTime(10,58));
        LocalTime localTime=LocalTime.of(10,58);
        System.out.println("atDate:"+localTime.atDate(localDate));
        
        LocalDateTime localDateTime1=localTime.atDate(localDate);
        System.out.println("toLocalDate:"+localDateTime1.toLocalDate());
        System.out.println("toLocalTime:"+localDateTime1.toLocalTime());

    }
}
