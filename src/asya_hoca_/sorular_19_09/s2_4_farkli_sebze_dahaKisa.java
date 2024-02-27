package asya_hoca_.sorular_19_09;

import java.util.Scanner;

public class s2_4_farkli_sebze_dahaKisa {
    public static void main(String[] args) {
        // multi branch if statement check more than two conditions
        /*
         *4 tane  String veri tipi tanımlayınız :Tomato, potatoes,pepper, onion
         * 4 adet double price : 15.45, 16.50, 35.7, 11.25
         * Kullanıcıdan adet girişi alınız.Toplam fiyat 100 Tl'den fazla olur ise
         *  "bakiyeniz yetersiz" çıktısı alın */



        Scanner scan = new Scanner(System.in);
        System.out.println("sebze ismi giriniz");
        String sebze = scan.next();  // dört tane ayri ayri tanimlamaya gerek yok. esitleme yaptigimiz icin bu yeterli

        double tP =15.45, pap =16.50, pep =35.7, op = 11.25;
        System.out.println("kac kilo almak istiyorsunuz");
        int kilo = scan.nextInt();
        double toplamtutar = 0;     // baslangicta hic bir sey almadigimiz icin toplamtutar=0 dir
                                    // ilk tomat soruyor-aliyor- toplamtutar hesplaniyor-en altta ikinci bir if ile bakiye yeterli mi_ kalan bakiye sorulur
                                    // bu islem else if ile (eger domates degil de patato aliyorsa) her biri icin ayri alinir.
        if (sebze.equalsIgnoreCase("tomato")) {
            toplamtutar = tP*kilo;
            System.out.println("toplam tutar: " + toplamtutar);
        } else if (sebze.equalsIgnoreCase("potato")) {
            toplamtutar = pap*kilo;
            System.out.println("toplam tutar: " + toplamtutar);
        } else if (sebze.equalsIgnoreCase("pepper")) {
            toplamtutar =pep*kilo;
            System.out.println("toplam tutar: " + toplamtutar );
        } else if (sebze.equalsIgnoreCase("onion")) {
            toplamtutar =op*kilo;
            System.out.println("toplam tutar: " + toplamtutar);
        }else
            System.out.println("yanlis veri girdiniz");
        if (toplamtutar>100 ) {
            System.out.println("bakiyeniz yetersiz");
        }else System.out.println("kalan bakiyeniz: "+ (100-toplamtutar));

    }
}
