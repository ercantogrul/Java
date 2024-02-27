package day04_OperatorsAndMahtClass.DE03_OperatorsAndMathClass_ilk.tasks;

import java.util.Scanner;

public class _09_ArithmeticOperator_multiply2 {

    public static void main(String[] args) {

    /*    Oluşturulmuş olan double'lar hakkında,
        Bu 4 doubleyi  birbiriyle çarpın ve sonuca  eşitleyin.
        Double sonucu yazdırın.   */

        Scanner dp = new Scanner(System.in);
        System.out.println("num1 giriniz :");
        double num1 = dp.nextDouble();
        System.out.println("num2 giriniz :");
        double num2 = dp.nextDouble();
        System.out.println("num3 giriniz :");
        double num3 = dp.nextDouble();
        System.out.println("num4 giriniz :");
        double num4 = dp.nextDouble();

        //Kodu aşağıya yazınız.
        System.out.println("sonuc = "+ (num1*num2*num3*num4));


    }
}
