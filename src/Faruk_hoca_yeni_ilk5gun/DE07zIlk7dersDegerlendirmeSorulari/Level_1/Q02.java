package Faruk_hoca_yeni_ilk5gun.DE07zIlk7dersDegerlendirmeSorulari.Level_1;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        /* Klavyeden girilen 3 double sayının toplamını wrapper class yardımı ile yazdırınız.
        toplama '+' işareti kullanılmayacak.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.print("3 adet double sayı giriniz : ");
        double d1 = 10;
        double d2 = 10.5;
        double d3 = 23.10;

        double top12 = Double.sum(d1,d2);
        double top   = Double.sum(d3,top12);

        // yol 2
        double toplam = Double.sum(d3,Double.sum(d1,d2));



    }
}
