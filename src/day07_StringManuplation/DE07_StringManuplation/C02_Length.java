package day07_StringManuplation.DE07_StringManuplation;

import java.util.Locale;

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

        String str = "mer"; // str nin son karekteri = str.length()-1;
        int uzunluk = str.length();
        System.out.println(uzunluk);
        int uz2 = "selam".length();
        System.out.println(uz2);




    }
}
