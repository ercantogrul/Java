package day16_LocaleDateTime.DE16_LocaleDateTime.Tasks;

import java.time.LocalDate;

public class T04__hangiGun_dogdunuz {
    public static void main(String[] args) {
        // Hangi gün doğduğunuzu (Pazartesi, salı... v.b.) ekrana yazdırın

        LocalDate dogumGunu = LocalDate.of(1978,4,13);
        System.out.println("date1 :"+dogumGunu);
        System.out.println("verilen tarih hangi gun : "+ dogumGunu.getDayOfWeek()); //THURSDAY



    }
}
