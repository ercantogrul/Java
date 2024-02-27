package asya_hoca_.Projects.KahveMakinasi_yasinHoca;

public class KahveRunner {
    public static void main(String[] args) {
        System.out.println(Kahve.BOLD + "==========Muhtesem 7'li Kahve Dünyasina Hosgeldiniz===========");
        System.out.println("Hangi kahveyi istersiniz?");
        Kahve sec = new Kahve();
        menu();
        sec.secim();
        sec.sut();
        sec.seker();
        sec.boy();
        Kahve.kahveListesi.add(sec.kahveTuru);
        Kahve.kahveListesi.add(sec.boy);
        Kahve.kahveListesi.add(sec.sut);
        Kahve.kahveListesi.add(sec.seker);
        Kahve.kahveListesi.add(String.valueOf(sec.sekerSayisi));
        Kahve.kahveListesi.add(String.valueOf(sec.ucret));
        System.out.println(sec);
        sec.parahesapla();
        System.out.println(Kahve.c_GREEN+sec.boy+" "+ sec.sut+" "+sec.kahveTuru+" "+sec.seker+ " olarak hazir. Afiyet " +
                "olsun. Gene bekleriz.");
    }


    private static void menu() {
        System.out.println(Kahve.BOLD + "\t\t\t\t Fiyat Menüsü:\n" +
                "                    Küçük        Orta        Büyük\n" +
                "   1.Türk kahvesi   30Tl         40Tl          50Tl\n" +
                "   2.Latte          35Tl         45Tl          55Tl\n" +
                "   3.Espresso       40Tl         50Tl          60Tl\n" +
                "   4.Cikis\n" +
                "   * İlave Süt 10Tl");
    }

}
