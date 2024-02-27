package day04_OperatorsAndMahtClass.DE03_OperatorsAndMathClass_ilk.ComparisonOperators.tasks;

import java.util.Scanner;

public class _17_ComparisonOperators_equal_equal___ {
    public static void main(String[] args) {
        /*  Verilen iki tane int (num1, num2) ile ilgili,
            Eger num1  num2 ya  eşitse console'da true yazsın.
            Değilse false

        Scanner dp = new Scanner(System.in);
        int num1 = dp.nextInt();
        int num2 = dp.nextInt();
        */

        // Kodu aşağıya yazınız.
        Scanner scan = new Scanner(System.in);
        System.out.println("num1  giriniz: ");
        int num1 = scan.nextInt();
        System.out.println("num2  giriniz: ");
        int num2 = scan.nextInt();
        String sonuc ="true";
        System.out.println(num1==num2);


        System.out.println("----if li cozum---");
        if (num1==num2) {
            sonuc="treu";

        }else {
            sonuc="false";
        }
        System.out.println(sonuc);


    }
}
