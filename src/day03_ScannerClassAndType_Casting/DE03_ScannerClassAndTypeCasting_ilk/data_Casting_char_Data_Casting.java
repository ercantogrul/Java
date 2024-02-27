package day03_ScannerClassAndType_Casting.DE03_ScannerClassAndTypeCasting_ilk;

import java.util.Scanner;

public class data_Casting_char_Data_Casting {
    public static void main(String[] args) {
                /*
            char data turu ozel bir data turudur her ne kadar char data turu
            '' icerisinde sayi,harf,ozel karakter alsa da  ascii tablosundaki sayisal degerleri de kullanabilir

            ayni sekilde  char data turundeki bir variable'i matematiksel islemde kullanirsaniz
           ascii tablosundaki degeri ile matematiksel isleme girer
         */

        char ch1= 'C';
        int sayi1 = ch1;

        System.out.println("ch1 : " + ch1); // C
        System.out.println("sayi1 : " + sayi1); // 67

        String str1 = "Java";
        String str2 = " ";
        String str3 = "Candir";
        System.out.println(str1+str2+str3); // Java Candir

        char ch2 = 'a';
        char ch3 = 'b';
        System.out.println(ch2 + ch3); // 97 + 98 = 195

        char ch4 = '1';
        char ch5 = '2';
        System.out.println(ch4 + ch5); // 49 + 950 = 99  // ascii tablosunda ki degerlerini toplar

        // ====ÖNEMLI===verilen int bir sayinin ascii tablosundaki char karsiligini yazdirin

        int karakter = 255;
        char asciDegeri = (char)karakter;
        System.out.println("Verilen sayinin ascii tablosundaki karsiligi : "+ asciDegeri);

        //===========================================================

        // Kullanicidan bir char isteyin girilen char'dan sonraki 3 karakteri yazdirin
        // Orn : input : a   output : b,c,d

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ascii tablosundan bir karakter giriniz");  // a
        char girilenKrk = scanner.next().charAt(0);
        // scanner.nextChar() method'u olmadigindan
        // once .next() ile String olarak alip, sonra o String'in ilk karakterini alalim

        System.out.println("Girilen karakter : " + girilenKrk);             // a
        System.out.println("Girilen karakter'den sonraki 3 karakter : " +     // b,c,d,
                (char)(girilenKrk+1) +", "+
                (char)(girilenKrk+2) +", "+
                (char)(girilenKrk+3));

        System.out.println("Girilen karakter : " + girilenKrk);             // a
        System.out.println("Girilen karakter'den sonraki 3 karakter : " +   //  parantez icinde toplama ilemi yapildigi icin
                (girilenKrk+1) +", "+                                       // ASCII degerini alir ve toplar . 98,99,100
                (girilenKrk+2) +", "+                                       //yukarda Castin yapilmistir ör:98=b dir
                (girilenKrk+3));

        System.out.println("Girilen karakter : " + girilenKrk);             // a
        System.out.println("Girilen karakter'den sonraki 3 karakter : " +   //  a1,a2,a3 olur birlesme var
                girilenKrk+1 +", "+
                girilenKrk+2 +", "+
                girilenKrk+3);





    }
}
