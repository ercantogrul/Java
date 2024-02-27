package day10_MethodCreation.DE10_MethodCreation_ilk.Tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

    /*
    Task-> girilen iki String'den ikincisi, birincisinin son harflerine eşitse, true, diğer durumda false return eden METHOD create ediniz

    Örnekler:
   ("abc", "bc") ➞ true
   ("abc", "d") ➞ false
   ("samurai", "zi") ➞ false
   ("feminine", "nine") ➞ true
   ("convention", "tio") ➞ false
    */
        Scanner input = new Scanner(System.in);
        System.out.print("lütfen bir ifade giriniz : ");
        String str1 = input.nextLine();
        System.out.print("lütfen bir ifade daha giriniz : ");
        String str2 = input.nextLine();

        System.out.println(ifadeKapsiyormu(str1,str2));

    }

    private static boolean ifadeKapsiyormu (String s1, String s2) {
       boolean yeni = s1.endsWith(s2);
       return yeni;
    }





    }
