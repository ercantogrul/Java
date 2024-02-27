package Faruk_hoca_yeni_ilk5gun.DE07zIlk7dersDegerlendirmeSorulari_meine_lösung.Level_2;

import java.util.Scanner;

public class Q01_iki_sayiya_4_islemden_birini_yaptirmak {
    public static void main(String[] args) {
        /* klavyeden sıra ile  1.sayı, işlem( +, -, *, / ) ve 2. sayı giriliyor ,
        işlemi yapıp ekrana yazdırınız (switch - case kullanılacak
        input
        3
        +
        5
        output 8

         */
        Scanner scan = new Scanner(System.in);
        System.out.print("iki adet sayi giriniz: ");
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        System.out.println("istediginiz islemi  \"+, \"-, \"*, \"/\" giriniz ");
        String islem = scan.next();


        switch (islem) {
            case "+": System.out.println(s1+s2);break;
            case "-": System.out.println(s1-s2);break;
            case "*": System.out.println(s1*s2);break;
            case "/": System.out.println(s1/s2);break;
            default:
                System.out.println("hatali giris yaptiniz");

        }
    }
}
