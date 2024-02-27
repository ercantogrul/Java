package day16_LocaleDateTime.DE16_LocaleDateTime.Tasks;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class T06__dogumGununden_bugune_kadar_gecen_gun____ {
    // doğum gününüzden bugüne kadar geçen gün sayısını bulunuz
    public static void main(String[] args) throws ParseException {

        LocalDate heute = LocalDate.now();
        System.out.println(heute);

        LocalDate dogumTarihi= LocalDate.of(1978,4,13);
        System.out.println("dogumTarihi : "+dogumTarihi);

        int gecenGunFarki = (int) ChronoUnit.YEARS.between(dogumTarihi,heute);
        System.out.println(gecenGunFarki);
        int gecenGunFarki1 = (int) ChronoUnit.DAYS.between(dogumTarihi,heute);
        System.out.println(gecenGunFarki1);
        int gecenGunFarki2 = (int) ChronoUnit.MONTHS.between(dogumTarihi,heute);
        System.out.println("ay farki: "+gecenGunFarki2);



        //===================farkli yol========================================

        Date bugun =new Date();
        DateFormat f = new SimpleDateFormat("dd MM yyyy");
        System.out.println(f.format(bugun));

        Date tarih = f.parse("13 04 1978");
        Long fark = (bugun.getTime()-tarih.getTime())/(1000*60*60*24);
        System.out.println("gun farki : "+fark);

        //=============3. yol=================================
        System.out.println(dogumTarihi.toEpochDay());
        System.out.println(heute.toEpochDay());
        long farki = (heute.toEpochDay()-dogumTarihi.toEpochDay());
        System.out.println(farki);























    }
}
