package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_1;

import java.util.Scanner;

public class T11__ {
    public static void main(String[] args) {
        // klavyeden girilen iki sayı birbirine tam bölünebiliyormu bulunuz
        // bölen sıfırsa , hatalı giriş sıfıra bölünemez yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("bolunen sayi gidriniz");
        int bolunen = scan.nextInt();
        System.out.println("bolen sayiyi gidriniz");
        int bolen = scan.nextInt();

        if (bolen!=0) {
            if (bolunen % bolen==0 ){
                System.out.println("sayilar birbirine tam bölünüyor");
            } else
                System.out.println("sayilar birbirine tam bölünmüyor");

        } else
            System.out.println("hatalı giriş, sayi sıfıra bölünemez ");



    }
}
