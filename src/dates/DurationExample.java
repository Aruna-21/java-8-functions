package dates;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {
    public static void main(String[] args) {

        //using Duration to represent time in minutes, hours, seconds and nanoseconds
        LocalTime localTime=LocalTime.of(7,30);
        LocalTime localTime1=LocalTime.of(8,30);
        Long diff=localTime.until(localTime1, ChronoUnit.MINUTES);
        System.out.println("diff:"+diff);
        Duration duration=Duration.between(localTime,localTime1);
        System.out.println("duration:"+duration.toMinutes());
    }
}
