package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_1;

import java.util.Scanner;

public class T15 { /* Verilen 2 asyının toplamı bulan metot create ediniz
    paremetler sayılar, return ise toplam,


     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();

        System.out.println("toplam (sayi1,sayi2) = " + toplam(sayi1, sayi2));

    }

    private static int toplam(int sayi1, int sayi2) {
        int toplam = sayi1+sayi2;
        return toplam;


    }
}
