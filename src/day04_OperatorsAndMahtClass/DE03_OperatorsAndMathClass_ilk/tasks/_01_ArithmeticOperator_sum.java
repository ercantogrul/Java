package day04_OperatorsAndMahtClass.DE03_OperatorsAndMathClass_ilk.tasks;

import java.util.Scanner;

public class _01_ArithmeticOperator_sum {
    public static void main(String[] args) {

    /*   Verilen iki tane int  (num1 , num2),
        Bu iki Integer'in toplamını yazdırın. */

       /* Scanner dp = new Scanner(System.in);
        int num1 = dp.nextInt();
        int num2 = dp.nextInt();

        //Kodu aşağıya yazınız.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("int olan num1 giriniz : ");
        int num1 = scan.nextInt();
        System.out.println("int olan num2 giriniz : ");
        int num2 = scan.nextInt();
        System.out.println("sonuc :" + (num1+num2));


    }
}
