package asya_hoca_.sorular_19_09;

import java.util.Scanner;

public class s2_4_farkli_sebze {
    public static void main(String[] args) {

        // multi branch if statement check more than two conditions
        /*
         *4 tane  String veri tipi tanımlayınız :Tomato, potatoes,pepper, onion
         * 4 adet double price : 15.45, 16.50, 35.7, 11.25
         * Kullanıcıdan adet girişi alınız.Toplam fiyat 100 Tl'den fazla olur ise
         *  "bakiyeniz yetersiz" çıktısı alın */
        // elinizde 100 lira var. pazara gidiyorsunuz, Tomato, potatoes,pepper, onion sebzelerini almak istiyorsunuz.
        // sebzelerin fiyati sirasiyla 15.45, 16.50, 35.7, 11.25 dir.
        //pazarci sana ne almak istedigini ve kac kilo almak istedigini soruyor. sende
        // istedigin sebzeleri ve kilolari vsoyleyerek alisveris yapiyorsun.
        // alis veristen sonra kac paran kaldi.
        // ve bakiyen yeterli degise yazdir.


        Scanner scanner = new Scanner(System.in);
        String sebze1 = "Tomato";
        String sebze2 = "Potato";
        String sebze3 = "Pepper";
        String sebze4 = "Onion";
        double tomatoPrice = 15.45;
        double potatoPrice = 16.50;
        double pepperPrice = 35.7;
        double onionPrice = 11.25;

        System.out.println("Ne almak istiyorsunuz?");
        String istek = scanner.nextLine();

        System.out.println("Kac kilo almak istiyorsunuz?");
        int kilo = scanner.nextInt();
        double toplamtutar=0;

        if (istek.equalsIgnoreCase("tomato")) {
            toplamtutar = kilo * tomatoPrice;
            System.out.println(toplamtutar);
        } else if (istek.equalsIgnoreCase("potato")) {
            toplamtutar = kilo * potatoPrice;
            System.out.println(toplamtutar);
        } else if (istek.equalsIgnoreCase("pepper")) {
            toplamtutar = kilo * pepperPrice;
            System.out.println(toplamtutar);
        } else if (istek.equalsIgnoreCase("onion")) {
            toplamtutar = kilo * onionPrice;
            System.out.println(toplamtutar);
        } else {
            System.out.println("Yanlis veri girdiniz.");
        }
        if (toplamtutar > 100.0) {
            System.out.println("Bakiyeniz yetersiz");
        } else System.out.println("Kalan paraniz : " + (100 - toplamtutar));

    }
}
