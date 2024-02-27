package Faruk_hoca_yeni_ilk5gun.DE07zIlk7dersDegerlendirmeSorulari.Level_2;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        // Klavyeden isim ve soyisim tek variable okunuyor giriliyor
        // isim ve soy ismi alt alta yazdırınız
        // ( isim 2 adet olabilir, bu durumda isimler 1. satıra, soy isim ise 2.satıra gelmelidir.)
        Scanner scanner = new Scanner(System.in);
        System.out.print("İsmi girin : ");
        String ad = scanner.nextLine();
        int bY = ad.lastIndexOf(" "); // son boşluğun yerini bulduk
        System.out.println(ad.substring(0,bY));
        System.out.println(ad.substring(bY+1));
        // "Ali hasan CAN"
        // output
        // Ali hasan
        // Can

    }
}
