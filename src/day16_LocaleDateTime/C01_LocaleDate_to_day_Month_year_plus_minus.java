package day16_LocaleDateTime;

import java.time.*;

public class C01_LocaleDate_to_day_Month_year_plus_minus {
    public static void main(String[] args) {

        //*****Date mutable class yani degistirilebilir
        //****LocaleDate ise immutable class

        LocalDate bugun = LocalDate.now();
        System.out.println(bugun);   //2023-11-23
        System.out.println(bugun.getMonth());   //NOVEMBER
        Month ay = bugun.getMonth();  // Month veri tipi

        String ayay = String.valueOf(bugun.getMonth()); //bu tavsiye edilmez
        System.out.println(ayay);

        DayOfWeek haftaninGunu= bugun.getDayOfWeek();
        System.out.println(haftaninGunu); //THURSDAY

        YearMonth yilVeAy = YearMonth.now();
        System.out.println("x = " + yilVeAy);  //x = 2023-11

        bugun = bugun.plusDays(40); // 40 gün sontra ki
        System.out.println(bugun);   //2024-01-02

        bugun = bugun.minusWeeks(10); // 10 hafta geriye geldik
        System.out.println(bugun); // 2023-10-24

        bugun = LocalDate.now();
        System.out.println(bugun);                  //2023-11-23
        System.out.println("bugun.getYear() :"+ bugun.getYear());        //2023
        System.out.println("bugun.getMonthValue(): "+bugun.getMonthValue());   //11
        System.out.println("bugun.getMonth(): "+bugun.getMonth());        //NOVEMBER
        System.out.println("bugun.getDayOfMonth() :"+bugun.getDayOfMonth());   //23
        System.out.println("bugun.getDayOfWeek() :"+bugun.getDayOfWeek());   //THURSDAY
        System.out.println("bugun.getDayOfYear():"+bugun.getDayOfYear());   //327


        methodDate(bugun);
        System.out.println(bugun);  //2023-11-23



    }

    private static void methodDate(LocalDate bugun) {
        bugun = bugun.plusYears(5);
    }
}
