package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari.Level_1;

import java.util.Scanner;

public class T14 {
    /* karekökü tamsayı olana sayılara Tam kare denir,
    verilen sayının tam kare olup olmadığını bulan bir code yazınız
    input  : 50  , output : 50 "Tam kare değildir"
    input  : 36  , output : 36 "Tam karedir"

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        double num = scanner.nextDouble(); // normalde burası int, double çözüm için ekledik
        int karekok = (int) Math.sqrt(num);
        if (num == karekok * karekok) System.out.println("tam karedir");
        else System.out.println("tam kare değildir");
      //cozum rasit bey

        if (Math.sqrt(num)==(int) Math.sqrt(num)) System.out.println("Tam karedir");
        else System.out.println("Tam kare degildir");
        // double cozersek
        double kkok = Math.sqrt(num);
        System.out.println(kkok);
        if (num == kkok * kkok) System.out.println("tam karedir");
        else System.out.println("tam kare değildir");

    }

}
