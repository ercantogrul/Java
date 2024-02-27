package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_2;

import java.util.Scanner;

public class T15_x_adet_sayinin_ortalamasi {
    public static void main(String[] args) {
        /* Klavyeden verilen x adet sayının ortalamasını bulan proğram yazınız,
        sayı negatif verilirse ortalamaya katma ve proğramı sonlandır.
        (x sınır değil belirsizlik ifade eder, yani nagatif sayı girilene kadar işleme devam)
         */

        Scanner scan = new Scanner(System.in);

        int sayi ;
        int toplam =0;
        int counter =0;

        do {
            System.out.println("bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi>=0){
                toplam+=sayi;
                counter++;
                System.out.println(toplam);

            }else {
                break;
            }

        }while (sayi>=0);
        System.out.println("toplam : "+ toplam);
        System.out.println("ortalama : "+ (toplam/counter));


    }
}
