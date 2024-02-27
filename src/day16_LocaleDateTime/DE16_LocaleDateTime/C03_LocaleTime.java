package day16_LocaleDateTime.DE16_LocaleDateTime;

import java.time.LocalTime;

public class C03_LocaleTime {
    public static void main(String[] args) {
        LocalTime suan = LocalTime.now();
        System.out.println(suan);
        System.out.println(suan.getHour());
        System.out.println(suan.getMinute());
        System.out.println(suan.getSecond());
        System.out.println(suan.getNano());
        suan = LocalTime.of(10,4);
        System.out.println(suan);
        suan = suan.plusHours(5);
        System.out.println(suan);

    }
}
