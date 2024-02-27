package day10_MethodCreation.C01_Method;

import java.util.Scanner;

public class s1_olusturulan_m_okuma {
    public static void main(String[] args) {
        // soru1: topla adinda bir metod yaziniz, bu method scanner class ile iki double variable okusun
                                          // ve bunlari toplayip ekrana yazsin

    topla();



    }public static void topla() {
        System.out.println("topla methodu");
        Scanner scan = new Scanner(System.in);
        System.out.println("bir double sayi giriniz");
        double d1 = scan.nextDouble();
        System.out.println("bir double sayi giriniz");
        double d2 = scan.nextDouble();
        System.out.println(d1+d2);
    }

}
