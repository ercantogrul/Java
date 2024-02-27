package Faruk_hoca_yeni_ilk5gun.DE07zIlk7dersDegerlendirmeSorulari_meine_lösung.Level_3;

import java.util.Scanner;

public class Q01_ {
    public static void main(String[] args) {
        // verilen int bir sayının pozitif, yada negatif olma durumunu ekrana yazdıran bir code yazınız
        // ( if ve ternary kullanılmayacak, switch-case ile çözülecek ( ip ucu: Math.abs )
        // input : -12 , output: negatiftir
        // input :  32 , output: pozitiftir
        // (sıfır olma durumu göz artı edilmiştir)

        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayi giriniz : ");
        int sayi = scan.nextInt();
        int mutlakD = Math.abs(sayi);
        int deger = sayi/mutlakD;               // sayi pozitif ise deger =1
                                                // sayi negatif ise deger =-1
        switch (deger){
            case  1 : System.out.println("sayi pozitifdir");break;
            case -1 : System.out.println("sayi negatifdir"); break;
            default:
                System.out.println("hatali giris yaptiniz");
        }

     //=====ikinci yöntem===================

        if (sayi>0) {
            System.out.println("sayi pozitifdir");
        }else System.out.println("sayi negatifdir");








    }
}
