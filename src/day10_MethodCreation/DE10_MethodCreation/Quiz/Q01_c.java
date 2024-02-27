package day10_MethodCreation.DE10_MethodCreation.Quiz;

import java.util.Scanner;

public class Q01_c {
    public static void main(String[] args) {
         /* Ekrandan   nextLine ile bir string okutun ve bu stringin, ilk kelimesinin
        uzunluğunu ekrana yazdırın.
        a) bir metot çağırın ve her şeyi metot ta yapın
        b) String okuma işini main de yapın, hesaplama ve yazdırma metot ta olsun
        c) hesaplama metotta , okuma ve yazma işleri main de olsun
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz: ");
        String str = scan.nextLine();

        System.out.println("kelimenin uzunlugu) = " + method3(str));


    }

    private static int method3(String str) {
        String ilkKelime = str.substring(0,str.indexOf(" "));
        int klmnUzunlugu = ilkKelime.length();

        return klmnUzunlugu;
    }
}
