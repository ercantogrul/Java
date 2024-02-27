package Faruk_hoca_yeni_ilk5gun.DE07zIlk7dersDegerlendirmeSorulari_meine_lösung.Level_2;

public class Q05___ {
    public static void main(String[] args) {
        // random 1..1000 arsında random bir sayı üretiniz ( 1 ve 1000 dahil)
        // üretilen sayının basamak sayısını ekrana yazınız
        // iki farklı yöntem ile yapılması tercih edilir

        int sayi = (int) (Math.random()*1000+1);
        System.out.println(sayi);

        if (sayi==1000) {
            System.out.println("sayi dört basamaktir");
        } else if (sayi>99) {
            System.out.println("sayi üc basamaklidir");
        }else if (sayi>9 ){
            System.out.println("sayi iki basamaklidir");
        }else System.out.println("hatali giris yapildi");


        //===== ikinci yöntem================

        int basamakSayisi = (""+sayi).length();            // int olan sayi nin yanina "" string bir ifade ekleyince sayi String oldu.
        System.out.println("basamak sayisi :" +basamakSayisi);   //  String olunca methodlari kullanabiliriz

        // =========ucuncu yol==============================
        String str= String.valueOf(sayi);                  //String ifadeyi int e cevirdik
        System.out.println("basamakSayisi = " + str.length());



    }
}
