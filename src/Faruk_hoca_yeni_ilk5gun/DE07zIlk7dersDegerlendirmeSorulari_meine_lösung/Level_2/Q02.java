package Faruk_hoca_yeni_ilk5gun.DE07zIlk7dersDegerlendirmeSorulari_meine_lösung.Level_2;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        // Klavyeden girilen 4 sayının en büyüğünü
        // Aşağıdaki yöntemlerden en az 2 tanesi ile çözünüz
        // Task 04.1 : if kullanarak bulunuz (ternary, wrapper,Math kullanılmayacak)
        // Task 04.2 : ternary kullanarak bulunuz (if, wrapper,Math kullanılmayacak)
        // Task 04.3 : Matt class kullanarak bulunuz (if, ternary, wrapper,kullanılmayacak)
        // Task 04.4 : Wrapper class kullanarak bulunuz (if, ternary, math,kullanılmayacak)
        // Task 04.5 : Math class içinde ternary kullanarak bulunuz (if,wrapper,kullanılmayacak)
        // Task 04.6 : Ternary içinde Math class kullanarak bulunuz (if,wrapper,kullanılmayacak)

        Scanner scan = new Scanner(System.in);
        System.out.print("dört sayi giriniz : ");
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        int s3 = scan.nextInt();
        int s4 = scan.nextInt();

        int enB = Math.max(Math.max(Math.max(s1,s2),s3),s4);
        int ennB = Math.max(Math.max(s1,s2),Math.max(s3,s4));
        //====================
        if (s1>s2 && s1>s3 && s1>s4) {
            System.out.println("enB :" +s1);
        } else if (s2>s1 && s2>s3 && s2>s4) {
            System.out.println("enB : "+s2);

        } else if (s3>s1 && s3>s2 &&s3>s4 ) {
            System.out.println("enB :"+s3);

        }else System.out.println("enB: "+s4);
        //=========================

       int max = Integer.max(Integer.max(Integer.max(s1,s2),s3),s4);
        System.out.println(max);


    }
}
