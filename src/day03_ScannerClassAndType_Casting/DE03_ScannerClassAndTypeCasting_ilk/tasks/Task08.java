package day03_ScannerClassAndType_Casting.DE03_ScannerClassAndTypeCasting_ilk.tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*Task->
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("vize1 notunu giriniz: ");
        double vize1 = scan.nextDouble();
        System.out.print("vize2 notunu giriniz: ");
        double vize2 = scan.nextDouble();
        System.out.print("Final notunu giriniz: ");
        double Final = scan.nextDouble(); //"not ortalamasi = "+

        System.out.println("not ortalamasi= " + (((vize1 + vize2) / 2 * 0.3) + (Final * 0.7)));


    }
}
