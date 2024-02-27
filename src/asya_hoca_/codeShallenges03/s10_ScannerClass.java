package asya_hoca_.codeShallenges03;

import java.util.Scanner;

public class s10_ScannerClass {
    public static void main(String[] args) {
           /*
   girilen iki tam sayının toplamının karesi,farkının karekökü ve ortalamasını, print eden code create ediniz.
   */


        Scanner scan = new Scanner(System.in);
        System.out.println("ilk tam sayi giriniz");
        int s1 = scan.nextInt();
        System.out.println("ikinci tam sayi giriniz");
        int s2 = scan.nextInt();
        int toplam = s1+s2;
        int farki = s1-s2;

        double toplamKaresi = Math.pow(toplam,2);
        int farkKarekok = (int) Math.sqrt(Math.abs(farki));  // farkin mutlak degeri alindi sonra karekök alindi

        System.out.println("iki tam sayının toplamının karesi: "+ (toplamKaresi));
        System.out.println("iki tam sayının farkının karekökü: "+ (farkKarekok));
        System.out.println("iki tam sayının ortalamasi: "+ ((s1+s2)/2));



    }
}
