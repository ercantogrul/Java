package day03_ScannerClassAndType_Casting.DE03_ScannerClassAndTypeCasting_ilk.tasks;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */

        //Kodu aşağıya yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir banka hesabiniz var mi? : ");
        boolean bHesabi = scan.nextBoolean();

        System.out.println("bankada hesabim:" + bHesabi);


    }
}
