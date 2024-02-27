package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_1;

import java.util.Scanner;

public class T14_Tam_Kare {
    /* karekökü tamsayı olana sayılara Tam kare denir,
    verilen sayının tam kare olup olmadığını bulan bir code yazınız
    input  : 50  , output : 50 "Tam kare değildir"
    input  : 36  , output : 36 "Tam karedir"

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();

        int karK = (int) Math.sqrt(sayi);
        if (sayi == karK * karK) System.out.println(sayi + " tam karedir");
        else System.out.println(sayi + " tam kare degildir");

        //ikinci yol
        int karekok = 1;
        for (int i = 1; i < sayi; i++) {
            if (sayi == i * i)
                karekok = i;
        }
        if (sayi == karekok * karekok) System.out.println(sayi + " tam karedir");
        else System.out.println(sayi + " tam kare degildir");


    }
}
