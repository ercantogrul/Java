package Faruk_hoca_yeni_ilk5gun.DE04zIlk4dersDegerlendirmeSorulari;

public class C07_Math03 {
    public static void main(String[] args) {

        // verilen 3 double sayıdan ortanca olanı ekrana yazdırın
        // enBuyuk , enKucuk , Toplamı
        // toplamdan (en buyuk ve en kucuğu) cıkartın
        // tek satırda yazın
        double d1 = 10;
        double d2 = 20;
        double d3 = 12;

        double enB = Math.max(d1,Double.max(d2,d3));
        double enK = Math.min(d1,Double.min(d2,d3));
        double ortanca = (d1+d2+d3) - enB - enK;
        System.out.println(ortanca);


    }
}
