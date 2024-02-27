package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_2;

import java.util.Scanner;

public class T12_sayinin_RAKAMLARI_TOPLAMI {
    /* Klavyeden kaç basamklı olduğu belli olmayan int bir sayı veriliyor
    basamakları toplamını enaz 2 yöntem ile bulunuz ( her bir yöntem bir method olsun,
    metota parametre olarak sayı gider, rakam toplamı return edilir.)

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi = scan.nextInt();

        basamaklarToplami1(sayi);
        basamaklarToplami2(sayi);

    }

    private static void basamaklarToplami2(int sayi) {
        String sy = String.valueOf(sayi);
        int toplam =0;
        for (int i = 0; i < sy.length(); i++) {
            toplam+= Integer.parseInt(sy.substring(i,i+1));

        }
        System.out.println("rakamlar toplami : "+toplam);


    }

    private static void basamaklarToplami1(int sayi) {
        int birlerB=0;
        int toplam =0;
        while (sayi>0){
            birlerB = sayi%10;
            toplam+=birlerB;
            sayi=sayi/10;


        }
        System.out.println("rakamlar toplami : "+toplam);

    }
}
