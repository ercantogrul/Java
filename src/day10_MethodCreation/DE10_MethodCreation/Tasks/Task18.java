package day10_MethodCreation.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {

       /* task-> girilen üç tamsaynın
        bir dik üçgenin kenar uzunlukları olmasını kontrol eden METHOD create ediniz.
        (Trick->: a b c kenarları için  a2+b2=c2 pisagor  şartı sağlanmalı)

        birinci kenarı giriniz: 3
        ikinci kenarı giriniz 4
        üçüncü kenarı giriniz: 5
         dik üçgendir
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        dik üçgen değildir.*/
        int a = 20;
        int b = 20;
        int c = 20;
        boolean ucgenMi = check(a,b,c);
        if (ucgenMi) System.out.println("evet dik ucgendir");
        else System.out.println("hayır dik ucken değildir");

    }

    private static boolean check(int a, int b, int c) {
//        int hipotenus = Math.max(k1,Integer.max(k2,k3));
//        int digerKenarlarKareToplami = k1*k1 + k2*k2 + k3*k3 - hipotenus*hipotenus;
//        // usteki işlemin sonucunda, k1 hipotenus ise k2 karesi+k3 karesi

        return (a*a == b*b+c*c || a*a+b*b == c*c  || b*b == a*a+c*c);
    }
}
