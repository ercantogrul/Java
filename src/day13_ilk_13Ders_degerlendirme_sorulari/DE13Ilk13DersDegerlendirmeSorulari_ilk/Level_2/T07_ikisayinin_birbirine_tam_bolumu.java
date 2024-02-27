package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_2;

import java.util.Scanner;

public class T07_ikisayinin_birbirine_tam_bolumu {
    public static void main(String[] args) {
        // klavyeden girilen iki sayı birbirine tam bölünebiliyormu bulunuz
        // bölen sıfırsa , hatalı giriş sıfıra bölünemez yazdırn ve yeni sayı istesin
        // 0 dan farklı bir bölen girene kadar da işlem devam etsin


        Scanner scan = new Scanner(System.in);
        int bolunen =1;
        int bolen = 1;

        do {
            System.out.println("bolunecek sayiyi giriniz");
            bolunen = scan.nextInt();
            System.out.println("bolen sayiyi giriniz");
            bolen = scan.nextInt();

            if (bolen != 0) {
                if (bolunen % bolen == 0) {
                    System.out.println("sayilar birbirine tam bölünüyor");
                }else {
                    System.out.println("sayilar birbirine tam bölünmüyor");
                }
            } else System.out.println("hatalı giriş, sayi sıfıra bölünemez ");

        } while (bolen != 0);



    }
}
