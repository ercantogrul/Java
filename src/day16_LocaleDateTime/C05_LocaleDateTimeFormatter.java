package day16_LocaleDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class C05_LocaleDateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);  //2023-11-23T11:38:15.575137600

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy:  hh:mm a");  // gun_ay_yil yazdirma
        System.out.println(dtf.format(now)); //*****************23-Nov.-2023:  11:37 AM

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy:  hh:mm");
        System.out.println(dtf1.format(now)); //*****************23-Nov.-2023:  11:38

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy:  hh:mm a",new Locale("tr","TR"));
        System.out.println(dtf2.format(now)); //*****************23-Kas-2023:  11:37 ÖÖ

        LocalDate ll = LocalDate.now();
        System.out.println(ll);
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        System.out.println(dtf3.format(ll)); //*********************

        Locale locale = new Locale("tr","TR");
        String str ="Ilgin";
        System.out.println(str.toLowerCase(locale));
        System.out.println(str.toLowerCase());

        







    }
}
