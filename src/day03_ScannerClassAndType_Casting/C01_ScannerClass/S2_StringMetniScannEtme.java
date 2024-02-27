package day03_ScannerClassAndType_Casting.C01_ScannerClass;

import java.util.Scanner;

public class S2_StringMetniScannEtme {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("metni giriniz : ");
        String metin = scan.nextLine();

        System.out.println("Sayiyi giriniz : ");
        int sayi = scan.nextInt();

        System.out.println(metin+": "+sayi);








    }
}
