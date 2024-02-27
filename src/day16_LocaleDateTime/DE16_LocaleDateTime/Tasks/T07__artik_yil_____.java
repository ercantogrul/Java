package day16_LocaleDateTime.DE16_LocaleDateTime.Tasks;

import java.time.LocalDate;

public class T07__artik_yil_____ {
    // 1900 yılından itibaren artık yılları yazdırınız
    public static void main(String[] args) {

        LocalDate tarih = LocalDate.of(1900, 01, 01);

        for (int i = 1900; i < 2023; i++) {

            if (tarih.isLeapYear()){
                System.out.print(tarih.getYear() + " ");
            }
            tarih = tarih.plusYears(1);


        }


    }
}
