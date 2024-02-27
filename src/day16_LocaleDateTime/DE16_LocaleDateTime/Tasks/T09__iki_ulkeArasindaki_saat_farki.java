package day16_LocaleDateTime.DE16_LocaleDateTime.Tasks;

import java.time.LocalTime;
import java.time.ZoneId;

public class T09__iki_ulkeArasindaki_saat_farki {
    // bulunduğunuz ülke ile newYork arasındaki saat farkını yazdırın
    public static void main(String[] args) {

        LocalTime usaTime=LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println(usaTime.getHour());
        LocalTime germanyTime =LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(germanyTime.getHour());

        int saatFarki = germanyTime.getHour()-usaTime.getHour();
        System.out.println(saatFarki);




    }
}
