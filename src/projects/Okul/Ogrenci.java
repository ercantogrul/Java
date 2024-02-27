package projects.Okul;

import java.util.Map;
import java.util.Scanner;

public class Ogrenci {
    public static void ogrenciIslemleri() {

        Scanner scanner = new Scanner(System.in);
        String secim;
        do {
            ogrenciMenu();
            secim = scanner.next().toUpperCase().substring(0, 1);
            switch (secim) {
                case "1": ekleme();break;
                case "2": arama();break; // kimlik no dan arama yapilabilir
                case "3": listeleme();break;
                case "4": silme();break; // kimlik no dan silme yapilabilir
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
        System.out.println("Numaranizi giriniz :");
        String bolum = scan1.next();
        System.out.println("Sinifinizi giriniz :");
        String sicilNo = scan1.next();

        OgrenciKisiler kisi = new OgrenciKisiler(kimlikNo, adSoyad, yas, bolum, sicilNo);
        Runner.ogrenciListe.put(kimlikNo, kisi);

        System.out.println(Runner.ogrenciListe);

    }

    private static void arama() {
        if (Runner.ogrenciListe.isEmpty()) {
            System.out.println("Listede kayitli ögrenci bulunamadi\n ");
        } else {
            System.out.println("Aramak istediginiz ögrencinin Kimlik Numarasini giriniz");
            Scanner scanner = new Scanner(System.in);
            int kimlikNo = scanner.nextInt();
            if (Runner.ogrenciListe.containsKey(kimlikNo)) {
                for (Map.Entry<Integer, OgrenciKisiler> entry : Runner.ogrenciListe.entrySet()) {
                    if (entry.getKey().equals(kimlikNo)) {
                        System.out.println(entry.getKey() + " " + entry.getValue());
                    }
                }
            } else {
                System.out.println("Aramak istediginiz ögrenci listede bulunmamaktadir");
            }
        }
    }

    private static void listeleme() {
        if (Runner.ogrenciListe.isEmpty()) {
            System.out.println("Listede kayitli ögrenci yoktur\n");
        } else {

            System.out.println("Listelemek istediginiz ögrenci Kimlik Numarasini giriniz");
            Scanner scanner = new Scanner(System.in);
            int kimlikNo = scanner.nextInt();
            if (Runner.ogrenciListe.containsKey(kimlikNo)) {
                for (Map.Entry<Integer, OgrenciKisiler> entry : Runner.ogrenciListe.entrySet()) {
                    System.out.println("Kimlik No: " + entry.getKey() + " " + entry.getValue());
                }
            } else {
                System.out.println("Listelemek istediginiz ögrenci listede bulunmamaktadir");
            }

        }
    }

    private static void silme() {
        if (Runner.ogrenciListe.isEmpty()) {
            System.out.println("Listede kayitli ögrenci yoktur\n");
        } else {
            System.out.println("Silmek stediginiz ögrenci Kimlik Numarasini giriniz");
            Scanner scanner = new Scanner(System.in);
            int kimlikNo = scanner.nextInt();
            if (Runner.ogrenciListe.containsKey(kimlikNo)) {
                Runner.ogrenciListe.remove((kimlikNo));
                System.out.println("Ögrenci bilgileri silinmistir");
            } else {
                System.out.println("Silmek istediginiz ögrenci listede bulunmamaktadir");
            }


        }
    }

    public static void ogrenciMenu() {
        System.out.println(" =========ÖGRENCI İŞLEMLERI ==========\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         Q-ÇIKIŞ\n" +
                "    SEÇİMİNİZ:");
    }

}
