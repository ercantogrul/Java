package Faruk_hoca_yeni_ilk5gun.DE07zIlk7dersDegerlendirmeSorulari.Level_2;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Verilen bir string içerisinde kaç adet a harfi vardır ( 'a' ve 'A' dahil)
        // Örnek    input : "Merhaba Ahmet Ağa"
        //          output: 5
        Scanner scanner = new Scanner(System.in);
        System.out.print("Metni giriniz : ");
        String str = scanner.nextLine();

        String str2= str.toLowerCase().replace("a",""); // tum a ları sildik

        System.out.println("str  = " + str);
        System.out.println("str2 = " + str2);

        int aSayisi = str.length() - str2.length();
        System.out.println("a Sayisi = " + aSayisi);


    }
}
