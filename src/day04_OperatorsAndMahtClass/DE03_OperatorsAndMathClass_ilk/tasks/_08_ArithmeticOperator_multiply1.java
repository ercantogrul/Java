package day04_OperatorsAndMahtClass.DE03_OperatorsAndMathClass_ilk.tasks;

import java.util.Scanner;

public class _08_ArithmeticOperator_multiply1 {

    public static void main(String[] args) {

        /* Verilen 3 double hakkında, (num1 , num2, num3),
            Bu üç double'ı birbiriyle çarpın ve cevabı  sonuca eşitleyin.
            Sonucu yazdırın.  */

        Scanner dp = new Scanner(System.in);
        System.out.println("num1 giriniz :");
        double num1 = dp.nextDouble();
        System.out.println("num2 giriniz :");
        double num2 = dp.nextDouble();
        System.out.println("num3 giriniz :");
        double num3 = dp.nextDouble();

        //Kodu aşağıya yazınız.
        System.out.println("sonuc =" + (num1*num2*num3));



    }
}
