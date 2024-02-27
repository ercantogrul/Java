package Faruk_hoca_yeni_ilk5gun.DE07zIlk7dersDegerlendirmeSorulari_meine_lösung.Level_1;

import java.util.Scanner;

public class Q02_ {
    public static void main(String[] args) {
        /* Klavyeden girilen 3 double sayının toplamını wrapper class yardımı ile yazdırınız.
        toplama '+' işareti kullanılmayacak.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("uc sayi giriniz: ");
        double d1 = 3.45;
        double d2 = 2.25;
        double d3 = 5.25;

        double toplam =Double.sum(Double.sum(d1,d2),d3);
        System.out.println(toplam);


    }
}
