package day10_MethodCreation.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task04 {//amale köyden ırgat çağıran şeher
    /*
        Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
         ATM app. code create ediniz
         */



    public static void main(String[] args) {
        int bakiye = 1000;
        String secim;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n\n  İşlemi Seçiniz");
            System.out.println("1- Bakiye Sorgulama");
            System.out.println("2- Para Yatırma");
            System.out.println("3- Para Çekme");
            System.out.println("x- Çıkış");
            secim= scanner.next().substring(0,1);
            switch (secim){
                case "1" : bakiyeGoster(bakiye); break;
                case "2" : bakiye = paraYatir(bakiye); break;
                case "3" : bakiye = paraCekme(bakiye); break;
            }
        } while (!secim.equals("x"));
    }//main dışı

    private static int paraCekme(int bakiye) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Çekilecek miktar ? ");
        int cekilenMiktar=scanner.nextInt();
        if (bakiye>= cekilenMiktar)
            bakiye = bakiye - cekilenMiktar;
        else System.out.println("Yetersiz bakiye....");
        bakiyeGoster(bakiye);
        return bakiye;
    }

    private static int paraYatir(int bakiye) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yatacak miktar ? ");
        int yatanMiktar=scanner.nextInt();
        bakiye = bakiye + yatanMiktar;
        bakiyeGoster(bakiye);
        return bakiye;
    }

    private static void bakiyeGoster(int bakiye) {
        System.out.println("Mevcut bakiyeniz "+bakiye+" TRL dir");
    }


}
