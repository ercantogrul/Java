package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_1;

import java.util.Scanner;

public class T09 {
    public static void main(String[] args) {
        // Klavyeden grilen bir stringin içerisinde kaç adet "a" herfi geçmektedir, yazdırınız

        Scanner scan= new Scanner(System.in);
        System.out.println("bir metin gidriniz"); // ankaradan
        String str = scan.nextLine();

        String yeni = str.replaceAll("[^a]","");
        int a_Sayisi = yeni.length();
        System.out.println("metindeki a harfi sayisi : "+a_Sayisi);


    }
}
