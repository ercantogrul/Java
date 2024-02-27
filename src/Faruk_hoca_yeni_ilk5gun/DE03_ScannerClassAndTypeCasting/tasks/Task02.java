package Faruk_hoca_yeni_ilk5gun.DE03_ScannerClassAndTypeCasting.tasks;

import java.util.Scanner;

public class Task02 {
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Boyu veriniz (cm) : ");
        int boy= scanner.nextInt();
        double boyM = boy/100.0;
        System.out.print("Kilo giriniz : ");
        int kilo= scanner.nextInt();

        double vke = kilo / (boyM*boyM);
        System.out.println(vke);

        int vke2 = 10000*kilo/(boy*boy);
        System.out.println(vke2);

    }
}
