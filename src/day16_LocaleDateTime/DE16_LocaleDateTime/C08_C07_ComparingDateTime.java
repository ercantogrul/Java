package day16_LocaleDateTime.DE16_LocaleDateTime;

import java.time.LocalDate;

public class C08_C07_ComparingDateTime {
    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();
        LocalDate dun   = bugun.minusDays(2);
        LocalDate falanGun = bugun.plusDays(58);
        LocalDate digergun = bugun.minusDays(23);
        LocalDate abdiBey = LocalDate.of(1983, 10, 8);

        if (dun.isAfter(bugun)) System.out.println(dun+ " sonradır");
        else  System.out.println(dun+ " sonra değildir");


        System.out.println("böğüün = " + bugun);//böğüün = 2023-02-24
        System.out.println("falanGun = " + falanGun);//falanGun = 2023-04-23
        System.out.println("feşmekanGun = " + digergun);//feşmekanGun = 2023-02-01
        System.out.println("abdiBey = " + abdiBey);//abdiBey = 1983-10-08

        System.out.println("böğüün.isAfter(abdiBey) = " + bugun.isAfter(abdiBey));//True
        System.out.println("abdiBey.isBefore(feşmekanGun) = " + abdiBey.isBefore(digergun));//True
        System.out.println("falanGun.isBefore(feşmekanGun) = " + falanGun.isBefore(digergun));//False

        System.out.println("böğüün.isLeapYear() = " + bugun.isLeapYear());//false  ÖNEMLI

        System.out.println("böğüün.compareTo(abdiBey) = " + bugun.compareTo(abdiBey));//40
        System.out.println("böğüün.compareTo(falanGun) = " + bugun.compareTo(falanGun));// -2
        System.out.println("falanGun.compareTo(feşmekanGun) = " + falanGun.compareTo(digergun));// 2

        int ebikGabik = bugun.compareTo(abdiBey);
        System.out.println("ebikGabık = " + ebikGabik);
        /*     ComperaTo komutu işlevi:
        2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
        2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
        2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için    */
    }
}
