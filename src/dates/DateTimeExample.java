package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class DateTimeExample {
    public static void main(String[] args) {

        //using LocalDate to print current date
        LocalDate localDate=LocalDate.now();
        System.out.println("Date:"+localDate);
        LocalTime localTime=LocalTime.now();
        System.out.println("Time:"+localTime);
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println("Date and Time:"+localDateTime);
        LocalDate localDate1=LocalDate.of(2022,10,25);
        System.out.println("today's date:"+localDate1);
        LocalDate localDate2=LocalDate.ofYearDay(2022,365);
        System.out.println("year:"+localDate2);

        //values from localDate

        System.out.println("month:"+localDate.getMonth());
        System.out.println("month value:"+localDate.getMonthValue());
        System.out.println("date:"+localDate.getDayOfMonth());
        System.out.println("year:"+localDate.getYear());
        System.out.println("day of year:"+localDate.getDayOfYear());
        System.out.println("day of week:"+localDate.getDayOfWeek());
        System.out.println("day of month using get"+localDate.get(ChronoField.DAY_OF_MONTH));

        //modify localDate
        System.out.println("plusDays:"+localDate.plusDays(2));
        System.out.println("plusMonths:"+localDate.plusMonths(2));
        System.out.println("plusWeeks:"+localDate.plusWeeks(2));
        System.out.println("plusYears:"+localDate.plusYears(2));
        System.out.println("minusDays:"+localDate.minusDays(2));
        System.out.println("withYear:"+localDate.withYear(2023));
        System.out.println("with ChronoField:"+localDate.with(ChronoField.YEAR,2023));
        System.out.println("with TemporalAdjusters:"+localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
    }
}
