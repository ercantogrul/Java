package day04_OperatorsAndMahtClass.DE03_OperatorsAndMathClass_ilk.tasks;

import java.util.Scanner;

public class _13_ArithmeticOperator_reminder3 {

    public static void main(String[] args) {

        /* Verilen iki int hakkında,
            num1'in num2'ye bölümünden kalanı yazdırınız.  */

        Scanner dp = new Scanner(System.in);
        System.out.println("num1 giriniz :");

        int num1 = dp.nextInt();
        System.out.println("num2 giriniz :");
        int num2 = dp.nextInt();

        //Kodu aşağıya yazınız.
        System.out.println("kalan ="+ (num1%num2));



    }
}
