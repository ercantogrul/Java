package day16_LocaleDateTime;

import java.time.LocalDateTime;

public class C04_LocaleDateTime {
    public static void main(String[] args) {


        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("dateTime :"+dateTime);   //2023-11-23T11:13:36.049712700
        System.out.println(dateTime.getYear());   //2023
        System.out.println(dateTime.getDayOfYear());  //327
        System.out.println(dateTime.getMonth());   //NOVEMBER
        System.out.println(dateTime.getMonthValue()); //11
        System.out.println(dateTime.getDayOfMonth());  //23
        System.out.println(dateTime.getDayOfWeek());  // THURSDAY

        System.out.println(dateTime.getHour());
        System.out.println(dateTime.getMinute());
        System.out.println(dateTime.getSecond());



    }

}
