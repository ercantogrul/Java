package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_1;

import java.util.Scanner;

public class T13 {
    public static void main(String[] args) {
        /* Klavyeden 3 basamaklı nir sayı string olarak veriliyor, rakamları toplamını bulunuz
        input  : "341"
        output : 8

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        String girilenSayi = scan.next();

        int rakamlarToplami = 0;
        for (int i = 0; i < girilenSayi.length(); i++) {
            rakamlarToplami+= Integer.parseInt(girilenSayi.substring(i,i+1));
        }
        System.out.println("girilen " + girilenSayi + "'nin rakanlar toplami : " + rakamlarToplami);


    }
}
