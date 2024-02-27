package day16_LocaleDateTime.DE16_LocaleDateTime.Tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class T03_100gun_sonra_turkce_ay_ismi {
    public static void main(String[] args) {
        // 100 gün sonraki tarihi ekrana yazdırınız (Türkçe ay ismi kullanarak)

        LocalDate bugun = LocalDate.now();
        System.out.println(bugun);
        bugun =bugun.plusDays(100);
        System.out.println(bugun);  // 100 gun sonraki gün

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd / MMMM / yyyy  EEEE",new Locale("tr","TR"));
        System.out.println(dtf.format(bugun)); // 03 / Mart / 2024  Pazar







    }
}
