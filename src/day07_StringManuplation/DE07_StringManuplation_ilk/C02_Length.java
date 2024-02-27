package day07_StringManuplation.DE07_StringManuplation_ilk;

import java.util.Scanner;

public class C02_Length {
    public static void main(String[] args) {
/*
        length() methodu girilrn string'in uzunluğunu:içinde buluna karakter sayısını return eder
        butun karakterleri(boşluk vs) sayıp adedini verir
         */

        /*
        Trick-> null atanan String'ler herhangi bir method call etmez çalışmaz
    null -> case sensitive Null NULL !=null
    null-> bir değer değil(dutluk) sadece hiçliği gösteren bir bir pointer(işaretçi)
         */

       // length stringin uzunlugunu verir yani kac tane karakter oldugunu verir. sayraken 1-2-3 diye sayariz
        String str = "mer"; // str nin son karekteri = str.length()-1; n 3 karekterdir  ama index 0-1-2 diye numaralandirilir.
        int uzunluk = str.length();    // yani son karakter = str.length()-1 dir
        System.out.println(uzunluk);

        int uz2 = "selam".length();
        System.out.println(uz2);

        String abc = "yalan dünya";   //11  metnin karekter n sayisini int e cevirdi.
        int uzun_luk = abc.length();
        System.out.println( uzun_luk);

        //=================================
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi yaziniz");
        String girilenIsim = scanner.nextLine();

        int n = girilenIsim.length();
        if (n % 2 == 0){ // n ciftse
            System.out.println("Uzunluk cift, ortadaki iki harf : " +
                    girilenIsim.charAt(n/2 -1)+
                    girilenIsim.charAt(n/2));

        }else { // n tekse
            System.out.println("Uzunluk tek, ortadaki harf : " + girilenIsim.charAt((n - 1) / 2));
        }





    }
}
