package day16_LocaleDateTime.DE16_LocaleDateTime;

import java.time.LocalDateTime;

public class C04_LocaleDateTime {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("dateTime = " + dateTime);
        System.out.println(dateTime.getYear());
        System.out.println(dateTime.getDayOfYear());
        System.out.println(dateTime.getMonth());
        System.out.println(dateTime.getMonthValue());
        System.out.println(dateTime.getDayOfMonth());
        System.out.println(dateTime.getDayOfWeek());
        System.out.println(dateTime.getHour());
        System.out.println(dateTime.getMinute());
        System.out.println(dateTime.getSecond());
        System.out.println(dateTime.getNano());
        dateTime = dateTime.plusWeeks(5);
        System.out.println(dateTime);
    }
}
