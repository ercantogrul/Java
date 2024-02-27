package asya_hoca_.Projects.Kitapci;

import java.util.Scanner;

public class Menuler {
    public static void menu(){
        System.out.println("HOSGELDINIZ");
        System.out.println();
        System.out.println("""
                         KITAP PROGRAMI
                         ===============
                         * 1-Kitap ekle
                         * 2-Numara ile kitap goruntule
                         * 3-Kitap ismi ile kitap bilgileri goruntule
                         * 4-Numara ile kitap sil
                         * 5-Tum kitaplari listele
                         * 6-Cikis
                """);
        System.out.println("Yapmak istediginiz islemi seciniz: ");
        islem();
    }

    private static void islem() {
        Scanner scanner = new Scanner(System.in);
        String secim;
        do {
            secim = scanner.next();
            switch (secim) {
                case "1": Islemler.KitapEkle();break;
                case "2": Islemler.NoIleKitapGoruntule();break;
                case "3": Islemler.KitapIsmiIleKitapGoruntule();break;
                case "4": Islemler.KitapSil();break;
                case "5": Islemler.TumKitapListele();break;
                case "6": System.out.println("Cikis yaptiniz. Gene bekleriz.");break;
                default:
                    System.out.println("Hatali veri girdiniz. Tekrar deneyiniz.");
            }
        } while (!secim.equals("6"));
    }
    }