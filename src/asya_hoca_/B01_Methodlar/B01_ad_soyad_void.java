package asya_hoca_.B01_Methodlar;

import java.util.Scanner;

public class B01_ad_soyad_void {
    public static void main(String[] args) {
        /*
        writeInfo() isimli bit method void ve parametresiz
        isim ve soy isim bilgisini ekrana yazsın
        writeAdress() isimli bir  method oluşturun adres ve kişi bilgilerini yazdırsın
         */

        writeAdress();

    }

    private static void writeAdress() {
        writeInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("adresinizi giriniz");
        String adres = scanner.nextLine();

        System.out.println("adres = " + adres);

    }

    private static void writeInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("adinizi giriniz");
        String ad = scanner.nextLine();
        System.out.println("soyadinizi giriniz");
        String soyad = scanner.nextLine();
        System.out.println("ad ve soyad: "+ad+" "+soyad);
    }
}
