package day33_ProjeTanimi.Yeni_Proje;

import day33_ProjeTanimi.Proje_FarukHoca.FileKisiler;
import day33_ProjeTanimi.Proje_FarukHoca.IslemKisiler;
import day33_ProjeTanimi.Proje_FarukHoca.Kisiler;
import day33_ProjeTanimi.Proje_FarukHoca.Runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IslemHizmet {
    public static void YeniIslem() {
        int satisID = ++SuTesisatciRunner.SatisSonID;
        Scanner scan = new Scanner(System.in);
        System.out.print("Müsteri ID giriniz : \n");
        IslemKisiler.veriList();
        int musteriID = scan.nextInt();
        if (!Runner.liste.containsKey(musteriID)) {
            System.out.println(musteriID + " numara ID li müsteriniz bulunmamaktadir. Kontrol ederek tekrar deneyiniz ");
            System.out.print("Müsteri ID giriniz : ");
            musteriID = scan.nextInt();
        }
        LocalDate bugun = LocalDate.now();
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        String tarih = dtf1.format(bugun);
        System.out.print("Yapilan islemi giriniz : ");
        Scanner scanner = new Scanner(System.in);
        String yapilanislem = scanner.nextLine();
        System.out.print("Islem tutarini giriniz : ");
        int tutar = scan.nextInt();
        System.out.print("Yapilan tahsilat tutarini giriniz : ");
        int tahsilat = scan.nextInt();
        boolean statu = true;

        Hizmetler islem = new Hizmetler(satisID, musteriID, tarih, yapilanislem, tutar, tahsilat, statu);
        SuTesisatciRunner.islemListe.put(islem.getSatisID(), islem); //map e eklendi

        FileHizmetler fHizmetler = new FileHizmetler();
        fHizmetler.dosyayaYaz();// dosya yaz methodu cegrildi

    }

    public static void Borc_AlacakDurumu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Borc alacak durumunu kontrol etmek istediginiz musteriID giriniz :");
        IslemKisiler.veriList();

        int secilenMusteriID = scan.nextInt();
        sablon();

        alacak_verecekHesapla(secilenMusteriID);

    }

    private static void alacak_verecekHesapla(int secilenMusteriID) {
        int toplamTutar = 0;
        int toplamTahsilat = 0;
        for (Map.Entry<Integer, Hizmetler> entry : SuTesisatciRunner.islemListe.entrySet()) {
            if (secilenMusteriID == entry.getValue().getMusteriID()) {
                System.out.println(entry.getValue());
                toplamTutar += entry.getValue().getTutar();
                toplamTahsilat += entry.getValue().getTahsilat();
            }
        }
        System.out.println("\n*Yapilan Islemlerin Toplam Tutari= " + toplamTutar + " Euro");
        System.out.println("*Yapilan Toplam Tahsilat Tutari  = " + toplamTahsilat + " Euro");

        if (!SuTesisatciRunner.islemListe.containsKey(secilenMusteriID)) {
            System.out.println(secilenMusteriID + " numara ID'li bir müsteriniz bulunmamaktadir");
        } else {
            if (toplamTutar >= toplamTahsilat) {
                if (toplamTutar > toplamTahsilat)
                    System.out.println(secilenMusteriID + " nolu Müsterinin Borcu : " + (toplamTutar - toplamTahsilat) + " Euro");
                if (toplamTutar == toplamTahsilat)
                    System.out.println(secilenMusteriID + " nolu Müsterinin Borcu yoktur. ");
            } else {
                System.out.println(secilenMusteriID + " nolu Müsterinin alacagi : " + (toplamTahsilat - toplamTutar) + " Euro");
            }
        }
        System.out.println();
    }

    public static void bakiyeRaporu() {
        String cizgi = "";
        String baslik = "";
        baslik = String.format("%10s", "müsteriID");
        baslik = baslik + String.format("%15s", "Ad Soyad");
        baslik = baslik + String.format("%15s", "Borc Durumu");
        cizgi = String.format("%10s", "==========");
        cizgi = cizgi + String.format("%15s", "============");
        cizgi = cizgi + String.format("%15s", "==========");
        System.out.println(RenkFormat.BOLD + RenkFormat.c_BLACK+ baslik);
        System.out.println(cizgi);

        int bakiye = 0;
        String kisi1 = "";
        for (Map.Entry<Integer, Kisiler> kisi : Runner.liste.entrySet()) {
            bakiye = 0;
            for (Map.Entry<Integer, Hizmetler> hizmet : SuTesisatciRunner.islemListe.entrySet()) {
                if (kisi.getValue().getId() == hizmet.getValue().getMusteriID()) {
                    bakiye += hizmet.getValue().getTutar() - hizmet.getValue().getTahsilat();
                    kisi.getValue().setBakiye(bakiye);
                }
            }
            int id = kisi.getValue().getId();
            String adSoyad = kisi.getValue().getAdSoyad();
            int bakiye1 = kisi.getValue().getBakiye();

            kisi1 = String.format("%5s", id);
            kisi1 = kisi1 + String.format("%20s", adSoyad);
            kisi1 = kisi1 + String.format("%10s", bakiye1);
            System.out.println(kisi1);

        }
        System.out.println();


    }


        /*
        for (Map.Entry<Integer, Kisiler> entry : Runner.liste.entrySet()) {
            int tutar = alacak_verecekHesapla(entry.getValue().getId());
            entry.getValue().setBakiye(tutar);
            Runner.liste.put(entry.getKey(),entry.getValue());
        }
         */


    public static void toplamAlacakTutar() {
        int topSatisMiktari = 0;
        int toptahsilat = 0;
        for (Map.Entry<Integer, Hizmetler> entry : SuTesisatciRunner.islemListe.entrySet()) {
            topSatisMiktari += entry.getValue().getTutar();
            toptahsilat += entry.getValue().getTahsilat();
        }
        System.out.println("Toplam alacak miktari = " + (topSatisMiktari - toptahsilat) + " Euro");
    }

    public static void toplamSatisMiktari() {
        int topSatisMiktari = 0;
        for (Map.Entry<Integer, Hizmetler> entry : SuTesisatciRunner.islemListe.entrySet()) {
            topSatisMiktari += entry.getValue().getTutar();
        }
        System.out.println("Toplam satis miktari = " + topSatisMiktari + " Euro");
    }

    public static void islemListele() {
        // verileri ekrana yaz ama durum  = true olanları
        System.out.println("====YAPILAN ISLEMLERIN LISTESI====");
        String baslik = String.format("%8s", "  satisID ");
        baslik = baslik + String.format("%14s", "  musteriID ");
        baslik = baslik + String.format("%19s", "  tarih ");
        baslik = baslik + String.format("%20s", "  islem ");
        baslik = baslik + String.format("%20s", "  tutar ");
        baslik = baslik + String.format("%20s", "  tahsilat ");
        baslik = baslik + String.format("%20s", " durum ");
        System.out.println(baslik);
        String cizgi = String.format("%10s", "=======");
        cizgi = cizgi + String.format("%14s", "=======");
        cizgi = cizgi + String.format("%22s", "===========");
        cizgi = cizgi + String.format("%20s", "===========");
        cizgi = cizgi + String.format("%20s", "===========");
        cizgi = cizgi + String.format("%20s", "===========");
        cizgi = cizgi + String.format("%20s", "===========");
        System.out.println(cizgi);

        FileHizmetler veri = new FileHizmetler();
        veri.dosyadanOku();
        for (Map.Entry<Integer, Hizmetler> val : SuTesisatciRunner.islemListe.entrySet()) {
            System.out.println(val.getValue());
        }
        System.out.println();

    }

    public static void sablon() {
        // verileri ekrana yaz ama durum  = true olanları
        String baslik = String.format("%2s", "  satisID ");
        baslik = baslik + String.format("%14s", "  musteriID ");
        baslik = baslik + String.format("%19s", "  tarih ");
        baslik = baslik + String.format("%20s", "  islem ");
        baslik = baslik + String.format("%21s", "  tutar ");
        baslik = baslik + String.format("%20s", "  tahsilat ");
        baslik = baslik + String.format("%20s", " durum ");
        System.out.println(baslik);
        String cizgi = String.format("%7s", "========");
        cizgi = cizgi + String.format("%14s", "========");
        cizgi = cizgi + String.format("%22s", "============");
        cizgi = cizgi + String.format("%20s", "==========");
        cizgi = cizgi + String.format("%20s", "=======");
        cizgi = cizgi + String.format("%20s", "=======");
        cizgi = cizgi + String.format("%20s", "=======");
        System.out.println(cizgi);
    }
}
