package day07_StringManuplation.DE07_StringManuplation;

import java.util.Scanner;

public class C09_replace_raplaceAll {
    public static void main(String[] args) {
        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini
         * (update -set) saglar. Sonuc String'dir..
         *
         */
        String str = "Merhaba dünya";
        str = str.replace("a","*");
        System.out.println(str);
        // yukarıdaki string de kaç adet * vardır
        int strUzunluk = str.length();
        String str2=str.replace("*",""); // tüm yıldızları kaldırdık
        System.out.println(str+"  "+strUzunluk  );
        int str2Uzunluk = str2.length();
        System.out.println(str2+"   "+str2Uzunluk);
        int yildizsayisi = str.length() - str.replace("*","").length();
        System.out.println(yildizsayisi);
        yildizsayisi = strUzunluk - str2Uzunluk;
        System.out.println(yildizsayisi);

    }
}
