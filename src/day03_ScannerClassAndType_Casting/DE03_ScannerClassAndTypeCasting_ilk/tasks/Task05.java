package day03_ScannerClassAndType_Casting.DE03_ScannerClassAndTypeCasting_ilk.tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {


        // Task-> kullanicidan 2 tam sayinın  dort islem sonucunu print eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz:");
        int s1 = scan.nextInt();
        System.out.println("ikinci bir sayi giriniz: ");
        int s2 = scan.nextInt();
        System.out.println(s1*s2+s2/s1);



    }

}
