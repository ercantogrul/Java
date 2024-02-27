package day16_LocaleDateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class C07_Duration {
    public static void main(String[] args) {



        LocalTime t1 = LocalTime.of(5,1);
        LocalTime t2 = LocalTime.now();
        Duration fark = Duration.between(t2,t1);
        System.out.println(fark.getSeconds()/3600);
        System.out.println(fark.toHours());



    }
}
