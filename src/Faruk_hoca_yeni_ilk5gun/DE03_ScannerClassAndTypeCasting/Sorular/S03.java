package Faruk_hoca_yeni_ilk5gun.DE03_ScannerClassAndTypeCasting.Sorular;

import java.util.Scanner;

public class S03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "Merhabalar hasan"; // String bir char dizisidir

      //  System.out.println(str.charAt(1)); // index

        char ch = scan.next().charAt(0);
        System.out.println(ch);
    }
}
