package Faruk_hoca_yeni_ilk5gun.DE07zIlk7dersDegerlendirmeSorulari_meine_lösung.Level_1;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        // Verilen bir stringing, ilk ve son karekterini ekrana yazdırın
        // Örnek    input  : "Selamlar"
        //          Output : "Sr"


        Scanner scan = new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String str = scan.nextLine();
        int sonKarekter = str.length()-1;


        System.out.println(""+str.charAt(0)+str.charAt(str.length()-1));
        System.out.println(str.substring(0,1)+str.substring(sonKarekter));




    }
}
