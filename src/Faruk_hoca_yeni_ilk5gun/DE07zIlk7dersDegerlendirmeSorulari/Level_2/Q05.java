package Faruk_hoca_yeni_ilk5gun.DE07zIlk7dersDegerlendirmeSorulari.Level_2;

public class Q05 {
    public static void main(String[] args) {
        // random 1..1000 arsında random bir sayı üretiniz ( 1 ve 1000 dahil)
        // üretilen sayının basamak sayısını ekrana yazınız
        // iki farklı yöntem ile yapılması tercih edilir
        int sayi = (int) (Math.random()*1000+1);
        System.out.println(sayi);

        int basamakSayisi = (""+sayi).length();
        System.out.println("basamakSayisi = " + basamakSayisi);

        // yol 2
        String str= String.valueOf(sayi);
        System.out.println("basamakSayisi = " + str.length());

        //yol3
        if (sayi==1000) basamakSayisi=4;
        else {
            if (sayi > 99) basamakSayisi = 3;
            else {
                if (sayi > 9) basamakSayisi = 2;
                else basamakSayisi=1;
            }
        }

        System.out.println("basamakSayisi = " + basamakSayisi);
    }
}
