package day16_LocaleDateTime;

import java.time.LocalTime;

public class C03_LocaleTime__saat_dakika_saniye {
    public static void main(String[] args) {

        LocalTime suan = LocalTime.now();
        System.out.println(suan);
        System.out.println(suan.getHour());
        System.out.println(suan.getMinute());
        System.out.println(suan.getSecond());
        System.out.println(suan.getNano());

        suan = LocalTime.of(15, 4);
        System.out.println(suan);

        suan=suan.plusHours(5);  //5 saat ileri
        System.out.println(suan);



    }

}
