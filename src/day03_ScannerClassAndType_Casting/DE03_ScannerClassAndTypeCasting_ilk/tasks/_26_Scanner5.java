package day03_ScannerClassAndType_Casting.DE03_ScannerClassAndTypeCasting_ilk.tasks;

import java.util.Scanner;

public class _26_Scanner5 {

    public static void main(String[] args) {

    /*    Bir String oluştur.
          Konsol'a 10 sene önceki yaşadığın şehri yazın.
          Bu String'i yazdırın.   */

        //Kodu aşağıya  yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("on sene once yasadigin sehr in adini giriniz: ");
        String sehir = scan.next();

        System.out.println("on sene once: "+sehir+"'da yasiyordum");



    }
}
