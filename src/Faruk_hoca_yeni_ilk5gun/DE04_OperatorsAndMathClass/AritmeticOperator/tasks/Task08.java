package Faruk_hoca_yeni_ilk5gun.DE04_OperatorsAndMathClass.AritmeticOperator.tasks;

import java.util.Scanner;

public class Task08 {
    /*Task->
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("saniye değerini giriniz");
        int sny = scanner.nextInt();
        int saat = sny / 3600 ;
        int dkk  = (sny-3600*saat)/60;
        System.out.print(sny+" saniye = ");
        sny =sny%60;

        System.out.print(saat+" saat, "+dkk+" dakika, "+sny+" saniyedir");


    }
}
