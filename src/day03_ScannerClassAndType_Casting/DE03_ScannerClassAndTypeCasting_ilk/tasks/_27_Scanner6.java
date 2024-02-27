package day03_ScannerClassAndType_Casting.DE03_ScannerClassAndTypeCasting_ilk.tasks;

import java.util.Scanner;

public class _27_Scanner6 {

    public static void main(String[] args) {

    /*    Bir string oluşturunuz.
          Doğum gününüzü konsola giriniz.
          String'i yazdırınız.  */

        //kodu aşağıya yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("dogum gununuzu giriniz: ");
        String gun = scan.next();                       //string bir data tanimlandigi icin tarihide strin olarak okur

        System.out.println("dogum gunum: "+gun);  // dogum gunum: 13.04.1978



    }
}
