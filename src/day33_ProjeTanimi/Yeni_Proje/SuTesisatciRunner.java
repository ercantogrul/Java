package day33_ProjeTanimi.Yeni_Proje;

import day33_ProjeTanimi.Proje_FarukHoca.IslemKisiler;
import day33_ProjeTanimi.Proje_FarukHoca.Runner;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SuTesisatciRunner {
    static Map<Integer, Hizmetler> islemListe = new HashMap<>();
    static int SatisSonID=0;
    public static void main(String[] args) {
      FileHizmetler veri = new FileHizmetler();
      veri.dosyadanOku();

      IslemKisiler.veriOku();

       AnaMenu();

    }

    private static void AnaMenu() {
        String secim = "";
        do {
        System.out.println(RenkFormat.BOLD+RenkFormat.c_GREEN+" =========SU TESISATCI MODÜLÜNE HOSGELDINIZ===========\n" +
                "    Hangi işlemi yapmak istiyorsunuz?\n" +
                "    1. Müşteri Kayıt Modülü  \n" +
                "    2. Yapılan Hizmet Modülü\n" +
                "    3. Çıkış\n" +RenkFormat.c_BLACK+RenkFormat.BOLD+
                "    ");
            Scanner scanner = new Scanner(System.in);
            secim = scanner.next();
            switch (secim) {
                case "1": Runner.menu();break;
                case "2": menu();break;
                case "3": System.out.println("Menüden çıkış yaptiniz.");break;
                default: {System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz.");break;
                }
            }
        } while (!secim.equals("3")) ;

    }

    public static void menu() {
        String secim = "";
        do {
            System.out.println(" ================ISLEMLER MODÜLÜNE HOSGELDINIZ=================\n" +
                    "                    Hangi işlemi yapmak istiyorsunuz?\n" +
                    "                    1. Yeni Işlem giriniz \n" +
                    "                    2. Seçilen müşterinin borç / alacak durumu\n" +
                    "                    3. Sucu ustanın toplam satış miktarı\n" +
                    "                    4. Sucu ustanın toplam alacağı tutar\n" +
                    "                    5. Yapilan islemlerin Listesi \n" +
                    "                    6. Müsteriler Bakiye raporu \n" +
                    "                    7. Ana Menü\n" +
                    "                     ");

            Scanner scanner = new Scanner(System.in);
            secim = scanner.next();
            switch (secim) {
                case "1": IslemHizmet.YeniIslem();break;
                case "2": IslemHizmet.Borc_AlacakDurumu();break;
                case "3": IslemHizmet.toplamSatisMiktari();break;
                case "4": IslemHizmet.toplamAlacakTutar();break;
                case "5": IslemHizmet.islemListele();break;
                case "6": IslemHizmet.bakiyeRaporu();break;
                case "7": System.out.println("Ana Menü");break;
                default: {System.out.println("Yanlış seçm yaptınız. Tekrar deneyiniz.");break;
                }
            }
        } while (!secim.equals("7")) ;
    }

}
