package asya_hoca_.asya_hoca_23_11_202;

import java.util.Scanner;

public class C02_amstong_sayi {
    public static void main(String[] args) {
        //Basamaklarının küpleri toplamı kendisine eşit olan sayılara Armstrong sayı denir . ...

        for (int sayi = 0; sayi <= 500; sayi++) {

            int birler = sayi % 10;
            int onlar = (sayi % 100)/ 10;
            int yuzler = sayi / 100;

            if (sayi == (Math.pow(yuzler, 3)) + (Math.pow(onlar, 3)) + (Math.pow(birler, 3))) {

                System.out.print(sayi + " ");
            }
        }




    }
}
