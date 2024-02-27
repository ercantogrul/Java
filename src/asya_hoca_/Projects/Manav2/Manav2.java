package asya_hoca_.Projects.Manav2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Manav2 {

    static ArrayList<String> urunListesi = new ArrayList<>(Arrays.asList("Domates", "Biber", "Marul", "Roka", "Avakado"));
    static Scanner scanner = new Scanner(System.in);
    int domatesFiyat= 30;
    int biberFiyat= 40;
    int marulFiyat= 20;
    int rokaFiyat= 30;
    int avakadoFiyat= 30;
    String secim;
    String baskaUrun;
    double kilo;
    double ucret;
    double toplamUcret;

    public void urunSecim() {

        do {
            System.out.println("\nLütfen almak istediginiz ürünü seciniz ? ");
            secim = scanner.next();

            switch (secim) {
                case "1": {
                    System.out.println("Kac kilo domates almak istiyorsunuz?");
                    kilo = scanner.nextDouble();
                    ucret=kilo*domatesFiyat;
                    toplamUcret+=ucret;
                    System.out.println("Baska ürün almak istermisiniz. Evet icin \"E\" veya  hayir icin \"H\" giriniz");
                    baskaUrun =scanner.next();
                    if (baskaUrun.equalsIgnoreCase("E")) {
                        urunSecim();
                    }else if (baskaUrun.equalsIgnoreCase("H")){
                        secim="6";
                    }else {
                        System.out.println("Hatali giris yaptiniz. Tekrar deneyiniz");
                    }
                    break;
                }
                case "2": {
                    System.out.println("Kac kilo Biber almak istiyorsunuz?");
                    kilo = scanner.nextDouble();
                    ucret=kilo*biberFiyat;
                    toplamUcret+=ucret;
                    System.out.println("Baska ürün almak istermisiniz. Evet icin \"E\" veya  hayir icin \"H\" giriniz");
                    baskaUrun =scanner.next();
                    if (baskaUrun.equalsIgnoreCase("E")) {
                        urunSecim();
                    }else if (baskaUrun.equalsIgnoreCase("H")){
                        secim="6";
                    }else {
                        System.out.println("Hatali giris yaptiniz. Tekrar deneyiniz");
                    }
                    break;
                }
                case "3": {
                    System.out.println("Kac kilo Marul almak istiyorsunuz?");
                    kilo = scanner.nextDouble();
                    ucret=kilo*marulFiyat;
                    toplamUcret+=ucret;
                    System.out.println("Baska ürün almak istermisiniz. Evet icin \"E\" veya  hayir icin \"H\" giriniz");
                    baskaUrun =scanner.next();
                    if (baskaUrun.equalsIgnoreCase("E")) {
                        urunSecim();
                    }else if (baskaUrun.equalsIgnoreCase("H")){
                        secim="6";
                    }else {
                        System.out.println("Hatali giris yaptiniz. Tekrar deneyiniz");
                    }
                    break;
                }
                case "4": {
                    System.out.println("Kac kilo Roka almak istiyorsunuz?");
                    kilo = scanner.nextDouble();
                    ucret=kilo*rokaFiyat;
                    toplamUcret+=ucret;
                    System.out.println("Baska ürün almak istermisiniz. Evet icin \"E\" veya  hayir icin \"H\" giriniz");
                    baskaUrun =scanner.next();
                    if (baskaUrun.equalsIgnoreCase("E")) {
                        urunSecim();
                    }else if (baskaUrun.equalsIgnoreCase("H")){
                        secim="6";
                    }else {
                        System.out.println("Hatali giris yaptiniz. Tekrar deneyiniz");
                    }
                    break;
                }
                case "5": {
                    System.out.println("Kac kilo Avakado almak istiyorsunuz?");
                    kilo = scanner.nextDouble();
                    ucret=kilo*avakadoFiyat;
                    toplamUcret+=ucret;
                    System.out.println("Baska ürün almak istermisiniz. Evet icin \"E\" veya  hayir icin \"H\" giriniz");
                    baskaUrun =scanner.next();
                    if (baskaUrun.equalsIgnoreCase("E")) {
                        urunSecim();
                    }else if (baskaUrun.equalsIgnoreCase("H")){

                    }else {
                        System.out.println("Hatali giris yaptiniz. Tekrar deneyiniz");
                    }
                    break;
                }
                case "6": {
                    System.out.println("Alisverisi bitirdiniz");break;

                }
                default:
                    System.out.println("Hatali giris yaptiniz lütfen tekrar deneyiniz ");break;
            }
        }while (!secim.equalsIgnoreCase("6"));

    }



    public void urunVeFiyatBilgilendirme() {
        System.out.println("***Manavimiza Hos Geldiniz***");
        System.out.println("         Kilo/Fiyat\n" +
                " 1-Domates :      30Tl\n" +
                " 2-Biber   :      40Tl\n" +
                " 3-Marul   :      20Tl\n" +
                " 4-Roka    :      40Tl\n" +
                " 5-Avakado :      30Tl\n" +
                " 6-Cikis   :      ");
    }


}
