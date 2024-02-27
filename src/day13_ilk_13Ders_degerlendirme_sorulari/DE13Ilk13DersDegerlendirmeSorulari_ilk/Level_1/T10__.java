package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_1;

import java.util.Scanner;

public class T10__ {
    // Klavyeden girilen bir sayının pozitif veya negatif olduğunu bulup ekrana yazdırın
    // ( 0 ise hatalı giriş yazdırın)
    // a) if kullanrak çözün
    // b) ternary kullanarak çözün ( tek ternary işlemi )
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("bir sayi gidriniz"); // 124
        int sayi = scan.nextInt();

        if (sayi>0){
            System.out.println("sayi pozitif");
        } else if (sayi<0) {
            System.out.println("sayi negatif");

        }else System.out.println("hatali giris yaptiniz");


        String sonuc = sayi>0? "Sayi pozitif" :sayi< 0? "Sayi negatif":"hatali giris yaptiniz";
        System.out.println(sonuc);


    }
}
