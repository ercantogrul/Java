package Faruk_hoca_yeni_ilk5gun.DE03_ScannerClassAndTypeCasting.tasks;

import java.util.Scanner;

public class Task12 {
    /*
    Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
    (Not : KDV tutarını 18% olarak alın)
    KDV'siz Fiyat = 10;
    KDV'li Fiyat = 11.8;
    KDV tutarı = 1.8;
    Ödev
    Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
     */

    public static void main(String[] args) {
        System.out.print("Tutarı veriniz : ");
        Scanner scanner = new Scanner(System.in);
        double fiyat =  scanner.nextDouble();
        double kdvsiz,kdv;

        if (fiyat<1000) {
            kdvsiz= fiyat/1.18;
            kdv = fiyat-kdvsiz;
        } else {
            kdvsiz= fiyat/1.08;
            kdv = fiyat-kdvsiz;
        }

        System.out.println("Fiyat   : "+fiyat);
        System.out.println("Kdv'siz : "+kdvsiz);
        System.out.println("Kdv     : "+kdv);



    }
}
