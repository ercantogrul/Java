package day13_ArrayList.DE13_ArrayList_ilk.Tasks;

import java.util.*;

public class Task12_Manav__toplam_fiyat {

    static List<String> urunListesi = new ArrayList<>(Arrays.asList("domat - urun kodu : 1", "elma - urun kodu : 2", "muz - urun kodu : 3",
            "biber - urun kodu : 4", "balcan - urun kodu : 5"));//urunlerin atanacagi bos list
    static List<Double> urunFiyatlari = new ArrayList<>(Arrays.asList(5.0, 7.5, 1.3, 8.7, 9.2));//urun fiyatlarinin atanacagi bos list
    static double toplamOdenecekTutar;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */

        System.out.println(urunListesi);

        Scanner scan = new Scanner(System.in);
        System.out.println("hangi ürünü istiyorsunuz?");
        String urun = scan.nextLine();

        double toplamfiyat=0;
        int kilo;

        do{
            System.out.println("kac kilo istiyorsunuz");
            kilo = scan.nextInt();
            switch (urun){
                case "1" : toplamfiyat +=kilo*5.0; break;
                case "2" : toplamfiyat +=kilo*7.5; break;
                case "3" : toplamfiyat +=kilo*1.3; break;
                case "4" : toplamfiyat +=kilo*8.7; break;
                case "5" : toplamfiyat +=kilo*9.2; break;
                default:
                    System.out.println("hatali giris yaptiniz");
            }
            System.out.println("toplamfiyat: "+toplamfiyat);

            System.out.println("baska ürün istiyormusunuz?");
            urun = scan.next();
            if (urun.equals("hayir")) break;

        }while (!urun.equals("hayir"));
        System.out.println("toplamfiyat: "+toplamfiyat);




    }



}

