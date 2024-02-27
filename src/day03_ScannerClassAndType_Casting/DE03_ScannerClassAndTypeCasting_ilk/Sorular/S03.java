package day03_ScannerClassAndType_Casting.DE03_ScannerClassAndTypeCasting_ilk.Sorular;

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
