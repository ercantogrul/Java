package asya_hoca_.B01_Methodlar;

import java.util.Scanner;

public class B02_ad_soyad_return_parametresiz {
    public static void main(String[] args) {
           /*
        writeInfo() isimli bit method void ve parametresiz
        isim ve soy isim bilgisini ekrana yazsın
        writeAdress() isimli bir  method oluşturun adres ve kişi bilgilerini yazdırsın
         */
        writeAdress2();

    }

    private static String writeAdress2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("adresinizi giriniz");
        String adres = scanner.nextLine();

        String info = writeInfo()+" "+adres;
        System.out.println( "ad soyad ve adres: "+info);

        return info;
    }


    private static String writeInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("adinizi giriniz");
        String ad = scanner.nextLine();
        System.out.println("soyadinizi giriniz");
        String soyad = scanner.nextLine();
        String sonuc =ad+" "+soyad;

        return sonuc;
    }


}
