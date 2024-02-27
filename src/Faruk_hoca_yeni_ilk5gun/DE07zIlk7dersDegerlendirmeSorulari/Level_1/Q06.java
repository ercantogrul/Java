package Faruk_hoca_yeni_ilk5gun.DE07zIlk7dersDegerlendirmeSorulari.Level_1;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        // Verilen bir stringing, ilk ve son karekterini ekrana yazdırın
        // Örnek    input  : "Selamlar"
        //          Output : "Sr"
        Scanner scanner = new Scanner(System.in);
        System.out.print("Metni girin : ");
        String ad = scanner.nextLine();
        System.out.println(""+ad.charAt(0)+ad.charAt(ad.length()-1));

        // =====ikinci yol================================

        int sonK = ad.length()-1;            // son ikarakterin index i int bir degerdir. yani bulundugu sirayi ifade eder
        System.out.println(ad.substring(0,1)+ad.substring(sonK));  // ilk ve son karakteri kopar getir


    }
}
