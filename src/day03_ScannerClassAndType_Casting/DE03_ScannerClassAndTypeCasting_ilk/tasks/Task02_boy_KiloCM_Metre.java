package day03_ScannerClassAndType_Casting.DE03_ScannerClassAndTypeCasting_ilk.tasks;

import java.util.Scanner;

public class Task02_boy_KiloCM_Metre {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("boyunuzu giriniz:");
        int boyCM = scan.nextInt();
        double boyMetre = (boyCM/100.0);

        System.out.println("kilonuzu giriniz: ");
        int kilo = scan.nextInt();

        double VKE = kilo/(1.0*boyMetre*boyMetre/10000);
        System.out.println(VKE);

        int VKE2 = 10000*kilo/(boyCM*boyCM);
        System.out.println("VKE ="+VKE2);


        /*

        Scanner scan = new Scanner(System.in);

        System.out.println("boyunuzu giriniz (cm):");
        int boy =scan.nextInt();

        System.out.println("kilonuzu giriniz: ");
        int kilo = scan.nextInt();

        double VKE = (kilo/(1.0*boy*boy/10000));
        System.out.println("VKE ="+VKE);

        int VKE2 =10000*kilo/(boy*boy);
        System.out.println("VKE ="+VKE2);

         */




    }
}
