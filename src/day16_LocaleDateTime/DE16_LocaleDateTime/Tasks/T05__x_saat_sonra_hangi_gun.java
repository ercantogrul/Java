package day16_LocaleDateTime.DE16_LocaleDateTime.Tasks;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class T05__x_saat_sonra_hangi_gun {
    public static void main(String[] args) {
        // x saat sonra hangiki tarih ve saat nedir yazdırınız
        int x=1000;


        LocalDateTime heute = LocalDateTime.now();
        heute = heute.plusHours(x);
        System.out.println(heute);
        Locale locale = new Locale("de","DE");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd / MMM/ yyyy - EEEE   HH:mm");
        System.out.println(dtf.format(heute));

        //================ikinci yöntem= uzun=======================

        LocalDateTime suan = LocalDateTime.now();
        System.out.println(suan);

        int gun = 1000/24;
        int saat = 1000-(gun*24);
        int dakika = saat-60;

        if (gun>0 && saat>0 && dakika>0){
            System.out.println(suan.plusDays(gun).plusHours(saat).plusMinutes(dakika));
        } else if (gun>0 && dakika>0) {
            System.out.println(suan.plusDays(gun).plusHours(saat));
        } else if (gun>0 ) {
            System.out.println(suan.plusDays(gun));
        }
















    }
}
