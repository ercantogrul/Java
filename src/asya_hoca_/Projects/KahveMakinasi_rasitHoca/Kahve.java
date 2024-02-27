package asya_hoca_.Projects.KahveMakinasi_rasitHoca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Kahve {

    static ArrayList<String> kahveListesi = new ArrayList<>(Arrays.asList("Türk Kahvesi", "Latte", "Espresso"));
    static String c_RED = "\u001B[31m";
    static String BOLD = "\033[0;1m";
    static String c_PURPLE = "\u001B[35m";
    static String c_GREEN = "\u001B[32m";
    int kahveSecimi;
    int kahveFiyat;
    int kahveBoy;
    String sutEklensinMi;
    String sekerEklensinMi;
    int kacSeker;
    int paraGirisi;
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("""
                     Fiyat Menüsü:
                                    Küçük        Orta        Büyük
                   1.Türk kahvesi   30Tl         40Tl          50Tl
                   2.Filtre         35Tl         45Tl          55Tl
                   3.Espresso       40Tl         50Tl          60Tl
                   * İlave Süt 10Tl\
                """);

        System.out.println("""
                 Hangi Kahveyi İstersiniz?
                  1.Türk kahvesi
                  2.Filtre Kahve
                  3.Espresso\
                """);
        try {
            Scanner scanner = new Scanner(System.in);
            kahveSecimi = scanner.nextInt();
            if (kahveSecimi == 1) {
                kahveFiyat = 30;
            } else if (kahveSecimi == 2) {
                kahveFiyat = 35;
            } else if (kahveSecimi == 3) {
                kahveFiyat = 40;
            } else if (kahveSecimi == 4) {
                System.out.println("Cikis yaptiniz");
                System.exit(0);
            } else {
                System.out.println("Hatali giris yaptiniz");
                menu();
            }
        } catch (Exception e) {
            System.out.println("Hatali giris yaptiniz");
            menu();
        }
        kahveBoy();
    }

    public void kahveBoy() {
        System.out.println("Hangi boy kahve alirsiniz?" +
                "         \n1. Kucuk" +
                "         \n2. Orta" +
                "         \n3. Buyuk " +
                "         \n4. Cikis  ");
        try {
            kahveBoy = scanner.nextInt();

            if (kahveBoy == 1) {
                System.out.println("Kucuk boy " + kahveListesi.get(kahveSecimi - 1) + " hazirlaniyor");
            } else if (kahveBoy == 2) {
                kahveFiyat += 10;
                System.out.println("Orta boy " + kahveListesi.get(kahveSecimi - 1) + " hazirlaniyor");
            } else if (kahveBoy == 3) {
                kahveFiyat += 20;
                System.out.println("Buyuk boy " + kahveListesi.get(kahveSecimi - 1) + " hazirlaniyor");
            } else if (kahveBoy == 4) {
                System.out.println("Cikis yaptiniz");
                System.exit(0);
            } else {
                System.out.println("Hatali giris yaptiniz");
                menu();
            }
        } catch (Exception e) {
            System.out.println("Hatali giris yaptiniz");
            menu();
        }
        sutVeSekerEkleme();
    }

    public void sutVeSekerEkleme() {
        System.out.println();
        System.out.print("Sut eklemek istiyor musunuz?\n(Evet veya Hayır olarak cevaplayınız):");
        sutEklensinMi = scanner.next();
        if (sutEklensinMi.substring(0, 1).equalsIgnoreCase("e")) {
            sutEklensinMi = "Sütlü";
            kahveFiyat += 10;
            System.out.println("Kahvenize süt ekleniyor");
        } else {
            sutEklensinMi = "Sütsüz";
            System.out.println("Süt eklenmiyor");
        }

        System.out.println();

        System.out.print("Seker eklemek istiyor musunuz?\n(Evet veya Hayır olarak cevaplayınız):");
        sekerEklensinMi = scanner.next();
        if (sekerEklensinMi.substring(0, 1).equalsIgnoreCase("e")) {
            sekerEklensinMi = "Sekerli";
            System.out.println();
            System.out.print("Kac seker istersiniz : ");
            kacSeker = scanner.nextInt();
            System.out.println("Kahvenize " + kacSeker + " seker ekleniyor");
        } else {
            sekerEklensinMi = "Sekerli";
            System.out.println("Seker eklenmiyor");
        }
        ucretMetodu();
    }

    public void ucretMetodu() {
        System.out.println();
        System.out.println("Kahve ücreti " + kahveFiyat + " liradir");
        System.out.println("Ucreti \"5-10-20-50'lik banknotlar olarak giriniz");
        paraGirisi = scanner.nextInt();
        while (!(paraGirisi == kahveFiyat)) {
            if (paraGirisi > kahveFiyat){
                System.out.println(Math.abs(kahveFiyat - paraGirisi) + " para üstünü aliniz");break;
            }
            System.out.println(kahveFiyat - paraGirisi + " lira eksik giris yaptiniz. Lütfen kalan tutari tamamlayiniz");
            paraGirisi += scanner.nextInt();

        }
        System.out.println(sutEklensinMi+" "+sekerEklensinMi+" "+
                Kahve.kahveListesi.get(kahveSecimi-1)+" hazirlanmisitir");
        System.out.println();

    }

    @Override
    public String toString() {
        return "Kahve{" +
                "kahveSecimi=" + kahveListesi.get(kahveSecimi-1)+
                ", kahveFiyat=" + kahveFiyat +
                ", kahveBoy=" + kahveBoy +
                ", sutEklensinMi='" + sutEklensinMi + '\'' +
                ", sekerEklensinMi='" + sekerEklensinMi + '\'' +
                ", kacSeker=" + kacSeker +
                ", paraGirisi=" + paraGirisi +
                ", scanner=" + scanner +
                '}';
    }
}
