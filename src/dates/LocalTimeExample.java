package dates;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {
    public static void main(String[] args) {

        //using LocalTime to print current time
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime:" + localTime);
        LocalTime localTime1 = LocalTime.of(9, 30);
        System.out.println("LocalTime :" + localTime1);
        LocalTime localTime2 = LocalTime.of(9, 30, 30);
        System.out.println("localTime2:" + localTime2);
        LocalTime localTime3 = LocalTime.of(9, 30, 30, 12345);
        System.out.println("localTime3:" + localTime3);

        //getting values from localTime
        System.out.println("getHour:" + localTime.getHour());
        System.out.println("getMinute:" + localTime.getMinute());
        System.out.println("CLOCK_HOUR_OF_DAY:" + localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));


        //modify the values of localTime
        System.out.println("minusHours:"+localTime.minusHours(2));
        System.out.println("ChronoUnit.HOURS:"+localTime.minus(2, ChronoUnit.HOURS));
        System.out.println("MIDNIGHT:"+localTime.with(LocalTime.MIDNIGHT));
        System.out.println("HOUR_OF_DAY:"+localTime.with(ChronoField.HOUR_OF_DAY,22));
        System.out.println("plusMinutes:"+localTime.plusMinutes(30));
        System.out.println("withHour:"+localTime.withHour(10));
    }

}
