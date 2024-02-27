package day04_OperatorsAndMahtClass.DE03_OperatorsAndMathClass_ilk.tasks;

import java.util.Scanner;

public class Task08__saniyeToSaat_dk_saniye {
    /*Task->
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("kac saniye oldugunu giriniz= ");
        int saniye = scan.nextInt();

        int saat;
        saat = saniye / 3600;
        int dk;
        dk = (saniye-(saat*3600))/60;
        int saniyeK = saniye-(saat*3600+dk*60);

        System.out.println((saat)+" saat, "+(dk) +" dk, "+(saniyeK)+" saniye eder ");







    }
}
