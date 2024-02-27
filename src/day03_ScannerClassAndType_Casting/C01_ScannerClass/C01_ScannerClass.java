package day03_ScannerClassAndType_Casting.C01_ScannerClass;

import java.util.Scanner;

public class C01_ScannerClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //once Scanner
        System.out.println("sayiyi giriniz :");// sonra sayi girilir

        int s1= scan.nextInt();  //sayiyi tanimliyoruz (burdaki scan Variable ismi)

        System.out.println("Klavyeden girdiginiz sayi : " +s1*2);

        //=======================================================



    }

}
