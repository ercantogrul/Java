package asya_hoca_.Projects.Kitapci;

import java.util.Map;
import java.util.Scanner;

public class Islemler {

    public static void KitapEkle() {
        BilgiPojo bilgi = new BilgiPojo();

        bilgi.kitapNo = Runner.count++;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Girmek istediginiz kitap ismini yaziniz: ");
        bilgi.kitapAdi = scanner.nextLine();
        System.out.println("Girmek istediginiz kitap yazar adini giriniz: ");
        bilgi.yazarAdi = scanner.nextLine();
        System.out.println("Girmek istediginiz kitabin fiyatini giriniz: ");
        bilgi.KitapFiyati = scanner.nextDouble();
        bilgi.tur = kitaptur();

        Runner.kitapMap.put(bilgi.kitapNo, bilgi);
        Runner.kitapList.add(bilgi);
        Menuler.menu();
    }

    private static KitapTurleri kitaptur() {
        Scanner scanner = new Scanner(System.in);
        String secim;
        System.out.println("Girmek istediginiz kitabin turunu giriniz: ");

        System.out.println("""
                1. Hikaye
                2. Roman
                3. Biyografi
                """);
        secim = scanner.next();
        switch (secim) {
            case "1": return KitapTurleri.HIKAYE;
            case "2": return KitapTurleri.ROMAN;
            case "3": return KitapTurleri.BIYOGRAFI;
        }
        return null;
    }

    public static void NoIleKitapGoruntule() {
        if (Runner.kitapMap.isEmpty()) {
            System.out.println("Kitap listeniz bos...");
            Menuler.menu();
        }

        System.out.println(Runner.kitapMap);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Goruntulemek istediginiz kitap numarasini giriniz:");
        int kitapNo = scanner.nextInt();
//        for (Map.Entry<Integer, BilgiPojo> val : Runner.kitapMap.entrySet()) {
        if (Runner.kitapMap.containsKey(kitapNo)) {
            System.out.println(Runner.kitapMap.get(kitapNo));
        } else {
            System.out.println("Aradiginiz kitap numarasina ait kitap bulunamamistir");
            NoIleKitapGoruntule();
        }

        Menuler.menu();
    }

    public static void KitapIsmiIleKitapGoruntule() {
        if (Runner.kitapMap.isEmpty()) {
            System.out.println("Kitap listeniz bos...");
            Menuler.menu();
        }

        System.out.println(Runner.kitapMap);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Goruntulemek istediginiz kitap adini giriniz:");
        String kitapAd = scanner.nextLine();
        int gosterilecekKitapNo = 0;
        for (Map.Entry<Integer, BilgiPojo> val : Runner.kitapMap.entrySet()) {
            if (val.getValue().kitapAdi.contains(kitapAd)) {
                gosterilecekKitapNo=val.getKey();
            }
        }
        if (gosterilecekKitapNo == 0) System.out.println("Kitap bulunamamistir");
        else System.out.println(Runner.kitapMap.get(gosterilecekKitapNo));

        Menuler.menu();
    }

    public static void KitapSil() {
        if (Runner.kitapMap.isEmpty()) {
            System.out.println("Kitap listeniz bos...");
            Menuler.menu();
        }

        System.out.println(Runner.kitapMap);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Silmek istediginiz kitabin numarasini giriniz:");
        int kitapNo = scanner.nextInt();
        for (Map.Entry<Integer, BilgiPojo> val : Runner.kitapMap.entrySet()) {
            if (val.getKey() == kitapNo) {
                System.out.println("Silmek istediginiz kitap bilgileri asagidadir" +
                        "Silmek istediginizden emin misiniz? E/H seciniz ");
                System.out.println(val.getValue());
                String secim = scanner.next();
                if (secim.equalsIgnoreCase("e")) {
                    Runner.kitapMap.remove(val.getKey());
                    break;
                } else if (secim.equalsIgnoreCase("h")) {
                    continue;
                } else {
                    KitapSil();
                }
            }
        }
        System.out.println(Runner.kitapMap);
        Menuler.menu();
    }

    public static void TumKitapListele() {
        if (Runner.kitapMap.isEmpty()) {
            System.out.println("Kitap listeniz bos...");
            Menuler.menu();
        }
        System.out.println("Listenizde bulunan bütün kitaplarin listesi : ");
        for (Map.Entry<Integer, BilgiPojo> val : Runner.kitapMap.entrySet()) {
            System.out.print(val.getValue());
        }
        System.out.println();
        Menuler.menu();
    }
}
