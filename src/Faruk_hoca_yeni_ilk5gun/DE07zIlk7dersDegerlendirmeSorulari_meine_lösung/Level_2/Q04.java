package Faruk_hoca_yeni_ilk5gun.DE07zIlk7dersDegerlendirmeSorulari_meine_lösung.Level_2;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Verilen bir string içerisinde kaç adet a harfi vardır ( 'a' ve 'A' dahil)
        // Örnek    input : "Merhaba Ahmet Ağa"
        //          output: 5

        Scanner scan = new Scanner(System.in);
        System.out.print("string bir veri giriniz : ");
        String str = scan.nextLine();
        int kUzunluk = str.length();

        String aharic = str.replaceAll("a","").replaceAll("A","");
        int aHaricUz = aharic.length();

        System.out.println("sonuc:"+ (kUzunluk-aHaricUz));


    }
}
