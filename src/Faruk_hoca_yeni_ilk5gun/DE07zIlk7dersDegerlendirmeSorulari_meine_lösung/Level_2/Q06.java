package Faruk_hoca_yeni_ilk5gun.DE07zIlk7dersDegerlendirmeSorulari_meine_lösung.Level_2;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        // Klavyeden isim ve soyisim tek variable okunuyor giriliyor
        // isim ve soy ismi alt alta yazdırınız
        // ( isim 2 adet olabilir, bu durumda isimler 1. satıra, soy isim ise 2.satıra gelmelidir.)

        Scanner scan = new Scanner(System.in);
        System.out.print("isim ve soyisim giriniz : ");
        String str = scan.nextLine();
        int bosluk = str.indexOf(" ");                 // ilk boslugun yerini verir
        System.out.println(str.substring(0,bosluk)+"\n"+str.substring(bosluk+1));

        // yukardaki Ali hasan gibi isim soy ismler icin gecerli EKSIK-EKSIK
        // ama "Ali hasan CAN" gibi uc veya daha uzun isimler icin alttaki yol dogru

        Scanner scanner = new Scanner(System.in);
        System.out.print("İsmi girin : ");
        String ad = scanner.nextLine();

        int bY = ad.lastIndexOf(" ");           // son boşluğun yerini bulduk
        System.out.println(ad.substring(0,bY));
        System.out.println(ad.substring(bY+1));

        // Ali hasan
        // Can



    }
}
