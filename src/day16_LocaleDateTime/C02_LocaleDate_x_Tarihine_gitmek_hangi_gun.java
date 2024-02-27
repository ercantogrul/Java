package day16_LocaleDateTime;

import java.time.LocalDate;
import java.time.Month;

public class C02_LocaleDate_x_Tarihine_gitmek_hangi_gun {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2023,5,20);
        System.out.println("date1 :"+date1);
        System.out.println("bu tarihin hangi gun : "+ date1.getDayOfWeek()); //SATURDAY

        LocalDate date2 = LocalDate.of(2023, Month.MAY,20);
        System.out.println("date2 :"+date2.getDayOfWeek());  //SATURDAY
















    }
}
