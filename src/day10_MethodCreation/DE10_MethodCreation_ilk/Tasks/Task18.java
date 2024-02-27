package day10_MethodCreation.DE10_MethodCreation_ilk.Tasks;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {

       /* task-> girilen üç tamsaynın
        bir dik üçgenin kenar uzunlukları olamsını kontrol eden METHOD create ediniz.
        (Trick->: a b c kenarları için  a2+b2=c2 pisagor  şartı sağlanmalı)

        birinci kenarı giriniz: 3
        ikinci kenarı giriniz 4
        üçüncü kenarı giriniz: 5
         dik üçgendir
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        dik üçgen değildir.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("bir tamsayi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("ikinci tamsayiyi giriniz");
        int sayi2 = scan.nextInt();
        System.out.println("ucuncu tamsayiyi giriniz");
        int sayi3 = scan.nextInt();



        boolean ucgenMi= check(sayi1,sayi2,sayi3);
        if (ucgenMi) System.out.println("evet dik ucgendir");
        else System.out.println("hayir dik ucgen degildir");


    }
    private static boolean check (int a, int b, int c){
        //int hipotenus= Math.max(k1,Integer.max(k2,k3));
       // int digerKenarKareToplami = k1*k1 + k2*k2 + k3*k3 - hipotenus*hipotenus;
        return (a*a==b*b+c*c || a*a+b*b==c*c || b*b==a*a+c*c);
    }




}
