package day16_LocaleDateTime.DE16_LocaleDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class C10_Locale {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        Locale locale = new Locale("tr", "TR");
        // Tarihi Türkçe ay ismiyle yazdır
        System.out.println(today.format(DateTimeFormatter.ofPattern("d MMMM yyyy", locale)));
    }
}
