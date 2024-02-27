package day16_LocaleDateTime.DE16_LocaleDateTime.Tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class T02_1YilSonra {
    public static void main(String[] args) {
        // 1 yıl sonraki tarihi  ekrana yazdırınız (dd - MM - yy) formatı kullanarak

        LocalDate bugun = LocalDate.now();
        System.out.println(bugun);//bugunku tarih
        System.out.println("bugun.plusYears(1) = " + bugun.plusYears(1));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(dtf.format(bugun.plusYears(1)));  //bir yil sonraki tarih





    }
}
