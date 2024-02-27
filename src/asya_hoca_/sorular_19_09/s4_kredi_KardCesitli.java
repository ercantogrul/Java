package asya_hoca_.sorular_19_09;

import java.util.Scanner;

public class s4_kredi_KardCesitli {
    public static void main(String[] args) {
        //Kullanıcıdan alınan bilgilere göre kredi kartı veren banka uygulaması
        //Eğer vatandaş kimliği yoksa  kredi kartı verilemez
        //Vatandaşı ve 30.000 Tl'den fazla geliri varsa verilebilir
        //Çalışma yılı 3 yıldan fazla ve geliri 50.000 Tl 'den fazla ise gold credit card
        //Çalışma yılı 3 yıldan az ve geliri 50.000'Tl'den fazla ise silver credit card
        //Diğerleri credit card
        // ilk kontrol vatandaş mı ve geliri 30.000'den fazla mı değil mi?if-else
        //gold: year>3 and salary>50.000
        //silver:year <3 and salary >50.000
        //credit:otherwise

        Scanner scan = new Scanner(System.in);
        System.out.println("vatandasmisiniz? evet veya hayir giriniz");
        String vat = scan.next();
        System.out.println("gelirinizi giriniz");
        double gelir = scan.nextDouble();
        System.out.println("calisma yilinizi giriniz");
        int yil = scan.nextInt();

        if (vat.equalsIgnoreCase("Evet") && gelir >= 30000) {
            System.out.println("kredi karti alabilirsiniz");
             if (yil >= 3 && gelir >= 50000) {
               System.out.println("gold credit card");
             } else if (yil < 3 && gelir >= 50000) {
               System.out.println("silver credit card");
             } else
                 System.out.println("Diğerleri credit card ");
        }else {
            System.out.println("kredi kartı verilemez");   // en son da kredi karti verilemez sartindan dolayi
        }                                                  // yukarda ic ice if kullanildi.




    }
}
