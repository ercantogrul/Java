package day16_LocaleDateTime.DE16_LocaleDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class C05_LocaleDateTimeFormatter {
    public static void main(String[] args) {

        LocalDate ll = LocalDate.now();
        Locale locale = new Locale("fi","FI");
        LocalDateTime now = LocalDateTime.now();
//        String str = "Ilgın";
//        System.out.println(str.toLowerCase(locale));
//        System.out.println(str.toLowerCase());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy  hh:mm a",locale);
        System.out.println(dtf.format(now));


    //    System.out.println(dtf.format(ll));
/*
		 format->
		 GUN
		 d : basta 0 varsa 0 yazmadan gun numarasi yazılır
		 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi yazar
		 DDD : yilin kacinci gunu oldugunu yazar
		 E, EE, EEE : gun isminin ilk 3 harfi
		 EEEE : gun isminin tamamini

		 AY (Ay icin M, dakika icin m kullanilir)
		 M : basta 0 varsa 0 yazmadan ay numarasi yazılır
		 MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi yazılır
		 MMM : Ay isminin ilk 3 harfi yazılır
		 MMMM : Ay isminin tamami yazılır

		 yy : yilin son iki rakamini
		 yyyy : Yilin tamamini yazılır

		 Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

		 HH : saatin tamami, tek rakamli saat olursa 02 gibi
		 H  : tek rakamli saat olursa sadece saati 2 gibi yazar

		 hh :  12 saat dilimine gore 2 rakam olarak yazılır
		 h : 12 saat dilimine gore tek rakam olanlari tek olarak yazılır

		 m : minute tek rakamlari 8 gibi  tek yazlır
		 mm: tek rakamlari 08 gibi yazılır

		 a yazarsak AM veya PM degerini yazar


		 */



    }
}
