package asya_hoca_.Projects.Kitapci.rasitHoca;

import java.util.Map;
import java.util.Scanner;

public class Rechner {
    static Scanner scannerNl = new Scanner(System.in);
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


    }

    public static void kitapEkle() {
        Buch buch = new Buch();

        System.out.print("Kitap ismi : ");
        buch.buchName = scannerNl.nextLine().toUpperCase();
        System.out.print("Yazar ismi : ");
        buch.autorName = scannerNl.nextLine().toUpperCase();
        System.out.print("Kitap Fiyati : ");
        buch.preis = scanner.nextDouble();
        buch.buchNummer = Runner.BUCHNUMMER++;
        kitapTuru(buch);
        Runner.mapBuch.put(buch.buchNummer, buch);
        System.out.println("Kitap ekleme isleminiz basariyla yapilmistir");
    }

    private static void kitapTuru(Buch buch) {
        Scanner scanner = new Scanner(System.in);
        String wahl;

        System.out.println("""
                Kitap turunu seciniz :\s
                     \t * 1-ROMAN
                \t\t * 2-MARSCHEN                           
                \t\t * 3-GESCHICHTE
                \t\t * 4-GEDICHT
                \t\t * 5-KUNST
                \t\t * 6-AUSGANG""");
        System.out.print("Secim : ");
        wahl = scanner.next().substring(0, 1);
        switch (wahl) {
            case "1" -> buch.buchArt = BuchArt.ROMAN;
            case "2" -> buch.buchArt = BuchArt.MARSCHEN;
            case "3" -> buch.buchArt = BuchArt.GESCHICHTE;
            case "4" -> buch.buchArt = BuchArt.GEDISCHT;
            case "5" -> buch.buchArt = BuchArt.KUNST;
            case "6" -> System.out.println("Cikis yapiliyor....");

        }

    }

    public static void numaraIleKitapGoruntule() {
        if (Runner.mapBuch.isEmpty()) {
            System.out.println("Kitap listeniz bos...");
            Runner.menu();
        }
        System.out.print("Gormek istediginiz kitap numarasini giriniz : ");
        int kitapNoAL = scanner.nextInt();
        if (Runner.mapBuch.containsKey(kitapNoAL)) {
            System.out.println(Runner.mapBuch.get(kitapNoAL));
        } else {
            System.out.println("Aradiginiz kitap numarasina ait kitap bulunamamistir");
            numaraIleKitapGoruntule();
        }
    }


    public static void kitapAdiIleGoruntule() {

        if (Runner.mapBuch.isEmpty()) {
            System.out.println("Kitap listeniz bos...");
            Runner.menu();
        }
        System.out.print("Gormek istediginiz kitap ismini giriniz : ");
        String kitapIsmiAL = scanner.nextLine();// asya hanima soralim neden next line da hata var
        int gosterilecekKitapNo = 0;
        for (Map.Entry<Integer, Buch> entry : Runner.mapBuch.entrySet()) {
            if (entry.getValue().buchName.equalsIgnoreCase(kitapIsmiAL)) {
                gosterilecekKitapNo = entry.getKey();
            }
        }
        if (gosterilecekKitapNo == 0) System.out.println("Kitap bulunamamistir");
        else System.out.println(Runner.mapBuch.get(gosterilecekKitapNo));

    }

    public static void kitapSil() {
        if (Runner.mapBuch.isEmpty()) {
            System.out.println("Kitap listeniz bos...");
            Runner.menu();
        }
        System.out.print("Silmek istediginiz kitap numarasini giriniz");
        int kitapNoAL = scanner.nextInt();
        if (Runner.mapBuch.containsKey(kitapNoAL)) {
            Runner.mapBuch.remove(kitapNoAL);
            System.out.println("Kitap silme islemi basariyla gerceklestirimistir");
        } else {
            System.out.println("Aradiginiz kitap numarasina ait kitap bulunamamistir");
            kitapSil();
        }


    }

    public static void kitapListe() {
        if (Runner.mapBuch.isEmpty()) {
            System.out.println("Kitap listeniz bos...");
            Runner.menu();
        }
        System.out.println("Kitap listesi : ");
        for (Map.Entry<Integer, Buch> entry : Runner.mapBuch.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
