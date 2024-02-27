package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_1;

import java.util.Scanner;

public class T12 {
    /*
    klavyeden 3 basamaklı bir sayı giriliyor, rakamları toplamını bulunuz
    input : 341
    output: 8
     */
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("bir sayi gidriniz"); // 124
        int girilenSayi = scan.nextInt();

       int bbasamagi = girilenSayi%10;
       int ybasamagi = girilenSayi/100;
       int obasamagi = (girilenSayi/10)%10;
        System.out.println("rakamlarin toplami : "+(bbasamagi+obasamagi+ybasamagi));


        int sayi = girilenSayi;
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        while (sayi>0){
            birlerBasamagi = sayi%10;
            rakamlarToplami += birlerBasamagi;
            sayi /= 10;
        }
        System.out.println("girilen " + girilenSayi + "'nin rakanlar toplami : " + rakamlarToplami);


    }
}
