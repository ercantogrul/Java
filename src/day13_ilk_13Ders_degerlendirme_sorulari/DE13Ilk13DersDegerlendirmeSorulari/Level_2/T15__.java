package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

import java.util.Scanner;

public class T15__ {
    public static void main(String[] args) {
        /* Klavyeden verilen x adet sayının ortalamasını bulan proğram yazınız,
        sayı negatif verilirse ortalamaya katma ve proğramı sonlandır.
        (x sınır değil belirsizlik ifade eder, yani nagatif sayı girilene kadar işleme devam)

         */
        Scanner scanner = new Scanner(System.in);
        int sayi;
        int counter = 0;
        int toplam=0;
        do {
            sayi = scanner.nextInt();
            toplam += sayi;
            counter++;
        } while (sayi>=0);
        toplam = toplam - sayi;
        counter--;
        double avarage = toplam / counter;
        System.out.println("avarage = " + avarage);

    }
}
