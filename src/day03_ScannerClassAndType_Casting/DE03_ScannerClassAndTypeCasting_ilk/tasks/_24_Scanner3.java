package day03_ScannerClassAndType_Casting.DE03_ScannerClassAndTypeCasting_ilk.tasks;

import java.util.Scanner;

public class _24_Scanner3 {

    public static void main(String[] args) {

     /*   Bir String oluşturun.
          Konsol'a sevdiğiniz bir meyveyi yazın.
          O meyveyi yazdırınız.   */

        //Kodu aşağıya  yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("sevdiginiz bir meyve ismi yaziniz: ");
        String meyve = scan.next();

        System.out.println("meyve ismi: "+meyve);


    }
}
