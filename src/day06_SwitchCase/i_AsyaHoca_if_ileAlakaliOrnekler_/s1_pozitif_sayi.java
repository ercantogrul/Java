package day06_SwitchCase.i_AsyaHoca_if_ileAlakaliOrnekler_;

import java.util.Scanner;

public class s1_pozitif_sayi {
    public static void main(String[] args) {
        ////Kulanıcıdan girilen sayının  positif olup olmadığını kontrol etsin

        //==Ternary ile cözmek================
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();
        String durum = sayi >= 1 ? "pozitiv" : "negativ";
        System.out.println(durum);


        ///=============boolean deger üretip cözmek==============================
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int sayi1 = scanner.nextInt();

        boolean a = sayi1 >= 0;    // boolean deger üretip cözmek daha kolay
        if (a) {
            System.out.println("Pozitif sayidir.");
        }else System.out.println("negativdir");


      //===========if li cozüm===//====================

        if (sayi1>0) {
            System.out.println("Pozitif sayidir. ");
        }else System.out.println("negativdir ");



    }
}