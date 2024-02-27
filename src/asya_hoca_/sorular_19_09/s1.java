package asya_hoca_.sorular_19_09;

import java.util.Scanner;

public class s1 {
    public static void main(String[] args) {
        /*

        Kullanıcıdan girilen harf sayısı bir ise a---aaa
        harf sayısı iki ise ab--- abab
        harr sayısı 3 ve üzeri tek sayısı ise ortadaki harf asa---s
        harf sayısı 3 ve üzeri çift sayı ise ortadaki iki harf masa--as

        */

        Scanner scan = new Scanner(System.in);
        System.out.print(" veri giriniz: ");
        String str = scan.nextLine();
        int kS = str.length();

        if (kS==1){
            System.out.println(str.repeat(3) );
        } else if (kS==2) {
            System.out.println(str.repeat(2));

        } else if (kS>=3 && kS%2!=0) {
            System.out.println(str.substring(kS/2,kS+1));

        } else if (kS>=3 && kS%2==0) {
            System.out.println(str.substring(kS/2-1,kS+1));
        }else System.out.println("gecersiz giris");


    }
}
