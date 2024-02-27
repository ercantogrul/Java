package day03_ScannerClassAndType_Casting.DE03_ScannerClassAndTypeCasting_ilk.tasks;

import java.util.Scanner;

public class Task11_charToAscii {
    public static void main(String[] args) {


        /* Task->
         * Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * Ornek : Input  : a
         *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
         * // char c = scan.next().charAt(0); --o ilk karakter in ascii degerini yazar.
         *     ornegin; "merhaba" kelimesi icin
         * // char c = scan.next().charAt(2); --2 deyince 3. siradaki e harfinin  ascii degerini yazar.
         *
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("bir karakter giriniz: ");
        char ch = scan.next().charAt(0);

        System.out.println(ch); // A
        System.out.println("Ascii degeri: "+ (int) ch); //dogru yolu bu
        System.out.println(ch+0);// informel yolu BU










    }


}
