package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_1;

import java.util.Scanner;

public class T01 {
    public static void main(String[] args) {
        // 4 adet sayı üretin ve en küçüğünü bulun
    }

    public static class T09 {
        public static void main(String[] args) {
            //  Öğrencinin 2 vize bir final notu veriliyor, vize ortalamasının %40, finalin %60 ı
            //  50 ve üzerinde ise başılıdır,  proğramı yazınız"
            Scanner scan = new Scanner(System.in);
            System.out.println("birinci vize notunu giriniz");
            double vize1 = scan.nextDouble();
            System.out.println("ikinci vize notunu giriniz");
            double vize2 = scan.nextDouble();
            System.out.println("finalsinavi vize notunu giriniz");
            double finalSinavi = scan.nextDouble();


            notHesaplama(vize1, vize2, finalSinavi);

        }

        private static void notHesaplama(double vize1, double vize2, double fsinavi) {
            double vort=((vize1 + vize2) / 2);
            double notOrtalamasi = (vort * 0.4)+(fsinavi*0.6);
            if (notOrtalamasi>=50){
                System.out.println("basarilidir");
            }else System.out.println("basarili degildir");
        }


    }
}
