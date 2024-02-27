package Faruk_hoca_yeni_ilk5gun.DE03_ScannerClassAndTypeCasting.tasks;


import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */

        //Kodu aşağıya yazınız.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Banka hesabınız var mı ? : ");
        String str = scanner.next();

        boolean hesapVarMi=scanner.nextBoolean();
        System.out.println(hesapVarMi);

    }
}
