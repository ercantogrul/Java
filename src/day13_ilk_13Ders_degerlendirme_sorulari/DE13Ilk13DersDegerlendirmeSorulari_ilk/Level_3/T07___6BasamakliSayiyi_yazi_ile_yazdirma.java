package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_3;

import java.util.Scanner;

public class T07___6BasamakliSayiyi_yazi_ile_yazdirma {
    public static void main(String[] args) {
    /* 6 basamaklı bir in sayı veriliyor yazı ile yazdırın
        input : 234001
        output: iki yüz otuzdörtbin bir

        */

        String[] birler = new String[]{"", "bir", "iki", "üc", "dört", "bes", "alti", "yedi", "sekiz", "dokuz"};
        String[] onlar = new String[]{"", "on", "yirmi", "otuz", "kirk", "elli", "altmis", "yetmis", "seksen", "doksan"};
        String[] yuzler = new String[]{"", "yüz", "iki yüz", "üc yüz", "dört yüz", "bes yüz", "alti yüz", "yedi yüz", "sekiz yüz", "dokuz yüz"};

        int sayi = 716019;
        int yuzbinlerBasamagi = (sayi % 1000000) / 100000; //yüzbinler
        int onbinlerBasamagi  = (sayi % 100000) / 10000; //yüzbinler
        int binlerBasamagi    = (sayi % 10000) / 1000; //yüzbinler
        int yuzlerBasamagi    = (sayi % 1000) / 100; //yüzbinler
        int onlarBasamagi     = (sayi % 100) / 10; //yüzbinler
        int birlerBasamagi    = (sayi % 10) / 1; //yüzbinler

        String yazi = yuzler[yuzbinlerBasamagi]+" "+onlar[onbinlerBasamagi]+" "+birler[binlerBasamagi];
        System.out.println(yazi);
        if (sayi>999) yazi =yazi+" bin ";
        yazi = yazi+ yuzler[yuzlerBasamagi]+" "+onlar[onlarBasamagi]+" "+birler[birlerBasamagi];
        System.out.println("yazi = " + yazi);
        for (int i = 0; i < yazi.length(); i++) {
            if (yazi.substring(0,1).equals(" ")) yazi =yazi.substring(1);else break;

        }System.out.println("yazi = " + yazi);
        yazi=yazi.substring(0,1).toUpperCase()+yazi.substring(1);
        System.out.println("yazi = " + yazi);


    }


}




