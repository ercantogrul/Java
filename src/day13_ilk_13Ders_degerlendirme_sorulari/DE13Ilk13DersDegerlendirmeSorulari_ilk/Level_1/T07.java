package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_1;

import java.util.Scanner;

public class T07 {
    public static void main(String[] args) {
        // Isim ve soy isimi klavyeden okutun
        //ve baş harflerini buyuk yapıp yazdırın
        // input : "hacı hasan"
        // output : "Hacı Hasan"
        Scanner scan= new Scanner(System.in);
        System.out.println("adinizi gidriniz");
        String ad = scan.nextLine();
        System.out.println("Soyadinizi gidriniz");
        String soyad = scan.nextLine();
        String adSoyad= ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase()+" "+
                        soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
        System.out.println("ad soyad : "+ adSoyad);


    }
}
