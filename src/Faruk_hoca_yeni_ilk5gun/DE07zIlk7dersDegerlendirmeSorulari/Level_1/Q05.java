package Faruk_hoca_yeni_ilk5gun.DE07zIlk7dersDegerlendirmeSorulari.Level_1;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        // Klavyeden isim ve soyisim tek variable olarak okunuyor giriliyor
        // isim ve soy ismi alt alta yazdırınız
        Scanner scanner = new Scanner(System.in);
        System.out.print("İsmi girin : ");
        String ad = scanner.nextLine();

        int bY = ad.indexOf(" ");                        // boşluk hangi indexte yerini bulduk. indexof int bir degerdir.sadece o karakterin hangi sirada oldugunu gösterir
        System.out.println(ad.substring(0,bY));
        System.out.println(ad.substring(bY+1));
        // mehmet guzel

        // Bu soruda adi ve soyadı buyuk harfle başlatalım
        System.out.println(ad.substring(0,1).toUpperCase()+ad.substring(1,bY).toLowerCase());
        System.out.println(ad.substring(bY+1,bY+2).toUpperCase()+ad.substring(bY+2).toLowerCase());
    }
}
