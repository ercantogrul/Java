package day10_MethodCreation.C01_Method;

import java.util.Scanner;

public class s2_main_m_okuma {
    public static void main(String[] args) {
        //soru 2: topla2 adinda bir metod yaziniz, bu method scanner class ile main methotta okuttugunuz iki double variabla parametre olarak alsin,
         // ve bunlari toplayip ekrana yazsin

        System.out.println("topla methodu");
        Scanner scan = new Scanner(System.in);
        System.out.println("bir double sayi giriniz");
        double d1 = scan.nextDouble();
        System.out.println("bir double sayi giriniz");
        double d2 = scan.nextDouble();
        topla2(d1,d2);  // parametre bu kisim oluyor

   
    }private static void topla2(double d1, double d2) {
        double sum = d1+d2;
        System.out.println(sum);
    }




}
