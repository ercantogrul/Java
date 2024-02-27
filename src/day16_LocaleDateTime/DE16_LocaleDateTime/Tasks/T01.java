package day16_LocaleDateTime.DE16_LocaleDateTime.Tasks;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class T01 {
    public static void main(String[] args) {
        // 100 gün sonraki tarihi ekrana yazdırınız

        LocalDate bugun = LocalDate.now();
        System.out.println(bugun);
        bugun =bugun.plusDays(100);
        System.out.println("yüzgün sonra ki tarih : "+bugun);

        WeekFields kacinciHafta = WeekFields.of(Locale.GERMANY);  //WeekFields class i
        System.out.println(kacinciHafta);


    }
}
