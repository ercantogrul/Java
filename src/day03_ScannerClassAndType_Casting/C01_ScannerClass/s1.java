package day03_ScannerClassAndType_Casting.C01_ScannerClass;

import java.util.Scanner;

public class s1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("isim ve soyisim giriniz: ");
        String isim = scan.nextLine();

        System.out.println("yasinizi giriniz: "); // ln silinirse veri direk ayni satirda istenir.
        int yas = scan.nextInt();

        scan.nextLine(); //bunu 'scan.nextLine();' buraya ekleyince diller variable celisti.
        System.out.println("bildiginiz diller: ");
        String diller = scan.nextLine(); //not 1:scan.nextLine() yazica ("bildiginiz diller:") sorusuna veri girilmeden alt konsola digerleri yaziliyordu.
                                          //not2:scan.next() yazica ("bildiginiz diller:") sorusuna cevap yaziliyor. veya
                                          //not3:scan.nextLine() yazica ust tarafina ekstra scan.nextLine() yazilinca sorun gideriliyor.
                                          // *** nextLine enter bilgisi tutmadigi icin bu sorun cikiyor.
        System.out.println("isim soy isim: " + isim + ", " + "yasi: " + yas + ", " + "diller: " + diller);
        //===============================================================================



    }
}
