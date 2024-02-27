package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_2;

import java.util.Scanner;

public class T14_ikisayinin_toplami_overloading {
    /* Verilen 2 asyının toplamı bulan metot create ediniz
    paremetler sayılar, return ise toplam,
    ancak, sayılardan herhangi birisi double olabilir, (overloading)

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        int sayi1 = scan.nextInt();
        double sayi2 = scan.nextDouble();

        System.out.println("toplam(sayi1,sayi2) = " + toplam(sayi1, sayi2));
        System.out.println("toplam(sayi1,sayi2) = " + toplam(sayi1, sayi2));

    }
    private static double toplam(int sayi1, double sayi2) {
        double toplam = sayi1+sayi2;
        return toplam;
    }
    private static int toplam(int sayi1, int sayi2) {
        int toplam = sayi1+sayi2;
        return toplam;
    }
}

