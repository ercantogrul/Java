package projects.Gemüsehändler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Manav1 {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> urunList = new ArrayList<>(Arrays.asList("Domates", "Biber", "Marul", "Roka", "Avakado"));
    static ArrayList<Integer> urunFiyati = new ArrayList<>(Arrays.asList(30, 40, 20, 40, 30));
    static String BOLD = "\033[0;1m";
    int urunSecimi;
    int kilo;
    int toplamFiyat;
    int secim;
    String tekrarAlmakIstermisiniz;

    public void brosur() {
        System.out.println(BOLD + "***Manavimiza hos geldiniz*** ");
        System.out.println("    Kilo/Fiyat\n" +
                " Domates :      30Tl\n" +
                " Biber   :      40Tl\n" +
                " Marul   :      20Tl\n" +
                " Roka    :      40Tl\n" +
                " Avakado :      30Tl");
        System.out.println();
    }

    public void urunSecimi() {

        System.out.println("Lütfen almak istediginiz ürünü seciniz : \n1-Domates \n2-Biber \n3-Marul \n4-Roka \n5-Avakado \n6-Cikis");
        do {

            Scanner scanner = new Scanner(System.in);
            try {
                urunSecimi = scanner.nextInt();
                if (urunSecimi < 0 || urunSecimi > 6){
                    System.out.println("hatali giris yaptiniz tekrar deneyiniz:::");
                    urunSecimi();
                }
                if (urunSecimi > 0 && urunSecimi < 5) {
                    System.out.println("Kac kilo " + urunList.get(urunSecimi - 1) + " almak istersiniz");
                    kilo = scanner.nextInt();
                }else if (urunSecimi ==6){
                    System.out.println("Cikis yaptiniz.");
                    System.exit(0);
                }else {
                    System.out.println("Hatali giris yaptiniz");
                }
            }catch (Exception e){
                System.out.println("Hatali giris yaptiniz tekrar deneyiniz___");
                urunSecimi();
            }

            System.out.println(kilo + " kilo " + urunList.get(urunSecimi - 1) + " : " + urunFiyati.get(urunSecimi - 1) * kilo + " liradir");
            System.out.println("toplam ücreti :" + (toplamFiyat += (urunFiyati.get(urunSecimi - 1) * kilo)) + " liradir");

            System.out.println("\nBaska bir ürün almak istermisiniz. \n(Evet icin \"E\"  veya  Hayir icin \"H\" giriniz) :");
            tekrarAlmakIstermisiniz = scanner.next();
            if (tekrarAlmakIstermisiniz.substring(0, 1).equalsIgnoreCase("E")) {
                urunSecimi();
            } else if (tekrarAlmakIstermisiniz.substring(0, 1).equalsIgnoreCase("H")) {
                System.out.println("Toplam ödenesi gereken tutar : " + toplamFiyat + " liradir");
                System.exit(0);
            } else {
                System.out.println("\nHatali giris yaptiniz tekrar secim yapiniz");
                urunSecimi();
            }

        } while (secim != 6);


    }
    public static void main(String[] args) {
        Manav1 sec = new Manav1();
        sec.brosur();
        sec.urunSecimi();
    }


}
