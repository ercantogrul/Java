package day03_ScannerClassAndType_Casting.DE03_ScannerClassAndTypeCasting_ilk.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("isim ve soy isminizi giriniz: ");
        String isim = scan.nextLine();                    // yukarda --Scanner scan = new Scanner(System.in);-- tanimlandigi icin sorun olusmadi.
        System.out.print("yasinizi giriniz: ");
        int yas = scan.nextInt();
        System.out.print("kilonuzu giriniz: ");
        int kilo = scan.nextInt();
        System.out.print("boyunuzu giriniz: ");
        double boy = scan.nextDouble();
        System.out.print("salona kac ay devam edeceginizi giriniz: ");
        int ay = scan.nextInt();

        System.out.println("ödemeniz gereken ucret: "+ (ay*20)+ " dolar");




    }
}
