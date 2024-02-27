package day16_LocaleDateTime.DE16_LocaleDateTime;

import java.time.LocalDate;
import java.time.Month;

public class C02_LocaleDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1980,9,12);
        System.out.println("date = " + date);
        System.out.println("bu tahih hangi gün = "+date.getDayOfWeek());
        LocalDate date2 = LocalDate.of(2023, Month.MAY,20);
        System.out.println("date2 = " + date2);
    }
}
