package day03_ScannerClassAndType_Casting.DE03_ScannerClassAndTypeCasting_ilk.tasks;

import java.util.Scanner;

public class Task12_kdv_ifLi {
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

        /*Scanner scan = new Scanner(System.in);
        System.out.print("tutari veriniz: ");
        double fiyat = scan.nextDouble();

        double kdvsiz = fiyat/1.18;
        double kdv = fiyat-kdvsiz;

        System.out.println("Fiyat :"+fiyat);
        System.out.println("Kdv siz :"+kdvsiz);
        System.out.println("Kdv : "+kdv);
        //===================================
        //degerleri int yani tam sayi yazdirmak istersek;
        System.out.println("Fiyat :"+(int)fiyat);
        System.out.println("Kdv siz :"+(int)kdvsiz);
        System.out.println("Kdv : "+(int)kdv);
        */

        // if li olunca
        System.out.println("-----if li------");

        Scanner scan = new Scanner(System.in);
        System.out.print("tutari veriniz: ");
        double fiyat;
        fiyat = scan.nextDouble();

        double kdvsiz;
        kdvsiz = fiyat/1.18;

        double kdv;
        kdv = fiyat-kdvsiz;

        if (fiyat>1000){
            kdvsiz = fiyat/1.18;
            kdv = fiyat-kdvsiz;

        }else{
            kdvsiz = fiyat/1.18;
            kdv = fiyat-kdvsiz;
        }

        System.out.println("Fiyat :"+fiyat);
        System.out.println("Kdv siz :"+kdvsiz);
        System.out.println("Kdv : "+kdv);





    }
}
