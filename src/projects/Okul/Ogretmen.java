package projects.Okul;

import java.util.Map;
import java.util.Scanner;

public class Ogretmen {

    public static void OgretmenIslemleri() {

        Scanner scanner = new Scanner(System.in);
        String secim;
        do {
            ogretmenMenu();
            secim = scanner.next().toUpperCase().substring(0, 1);
            switch (secim) {
                case "1": ekleme();break;
                case "2": arama();break;  // kimlik no dan arama yapilabilir
                case "3": listeleme();break;
                case "4": silme();break; // kimlik no dan silme  yapilabilir
                case "5": Runner.menu();break;
                case "Q": System.out.println("Cikis yaptiniz");break;
                default:
                    System.out.println("Hatali giris yaptiniz. Tekrar giris yapiniz:");break;
            }
        } while (!secim.equalsIgnoreCase("Q"));

    }

    private static void ekleme() {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Kimlik numaranizi giriniz :");
        int kimlikNo = scan1.nextInt();
        System.out.println("Adinizi ve Soyadinizi giriniz :");
        Scanner scan = new Scanner(System.in);
        String adSoyad = scan.nextLine();
        System.out.println("Yasinizi giriniz :");
        String yas = scan1.next();
        System.out.println("Bölümünüzü giriniz :");
        String bolum = scan1.next();
        System.out.println("Sicilinizi giriniz :");
        String sicilNo = scan1.next();

        OgretmenKisiler kisi = new OgretmenKisiler(kimlikNo, adSoyad, yas, bolum, sicilNo);
        Runner.ogretmenListe.put(kimlikNo, kisi);

        System.out.println(Runner.ogretmenListe);

    }

    private static void arama() {

        if (Runner.ogretmenListe.isEmpty()) {
            System.out.println("Listede kayitli ögretmen bulunamadi \n");
        } else {
            listeleme();
            System.out.println("Aramak istediginiz Ogretmen TC.No yu giriniz");
            Scanner scanner = new Scanner(System.in);
            int kimlikNo = scanner.nextInt();
            if (Runner.ogretmenListe.containsKey(kimlikNo)) {
                for (Map.Entry<Integer, OgrenciKisiler> entry : Runner.ogrenciListe.entrySet()) {
                    if (entry.getKey() == kimlikNo) {
                        System.out.println(entry.getKey() + " " + entry.getValue());
                    }
                }
            } else {
                System.out.println("Aramak istediginiz ögretmen listede bulunmamaktadir");
            }
        }
    }

    private static void listeleme() {
        if (Runner.ogretmenListe.isEmpty()) {
            System.out.println("Listede kayitli Ogretmen yoktur\n");
        } else {
            System.out.println("Aramak istediginiz Ogretmen TC.No yu giriniz");
            Scanner scanner = new Scanner(System.in);
            int kimlikNo = scanner.nextInt();
            if (Runner.ogretmenListe.containsKey(kimlikNo)) {
                for (Map.Entry<Integer, OgretmenKisiler> entry : Runner.ogretmenListe.entrySet()) {
                    System.out.println("Kimlik No: " + entry.getKey() + " " + entry.getValue());
                }
            } else {
                System.out.println("Listelemek istediginiz ögretmen listede bulunmamaktadir");
            }
        }
    }

    private static void silme() {
        if (Runner.ogretmenListe.isEmpty()) {
            System.out.println("Listede Kayitli Ögretmen yoktur\n");
        } else {
            System.out.println("Silmek stediginiz Ogretmen TC.No yu giriniz");
            Scanner scanner = new Scanner(System.in);
            int kimlikNo = scanner.nextInt();
            if (Runner.ogretmenListe.containsKey(kimlikNo)) {
                Runner.ogretmenListe.remove((kimlikNo));
            } else {
                System.out.println("Silmek istediginiz ögrenci listede bulunmamaktadir");
            }
        }
    }

    public static void ogretmenMenu() {
        System.out.println(" =========ÖGRETMEN İŞLEMLERI ==========\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         Q-ÇIKIŞ\n" +
                "    SEÇİMİNİZ:");
    }
}
