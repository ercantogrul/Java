package day16_LocaleDateTime.DE16_LocaleDateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;


public class C01_LocaleDate {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("bugun = "+today);
        Month ay = today.getMonth();
        DayOfWeek hGunu= today.getDayOfWeek();
        System.out.println(ay);
        System.out.println(hGunu);
        today = today.plusDays(40);
        System.out.println("bugun + 40 gun "+today);
        today = today.minusWeeks(10);
        System.out.println("bugun - 30 gün "+today);
        today = LocalDate.now();
        System.out.println("bugun =. "+today);
        System.out.println("today.getYear()     = "+today.getYear());
        System.out.println("today.getMonthValue()="+today.getMonthValue());
        System.out.println("today.getMonth()    = "+today.getMonth());
        System.out.println("today.getDayOfMonth()="+today.getDayOfMonth());
        System.out.println("today.getDayOfWeek()= "+today.getDayOfWeek());
        System.out.println("today.getDayOfYear()= "+today.getDayOfYear());




    }

    private static void metotDate(Date today) {

    }
}
