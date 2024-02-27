package asya_hoca_.sorular_19_09;

import java.util.Scanner;

public class S10_cent_dolar {
    public static void main(String[] args) {
        //Verilen String cent miktarını 123 1$ dolar 23 cent şeklinde yazdırın


        Scanner scan =new Scanner(System.in);
        System.out.print("Cent miktarini giriniz : ");
        int cent= scan.nextInt();
        int dolar = (cent/100);
        int cent2 = cent%100;

        System.out.println(dolar+" dolar "+cent2+ " Cent");










    }
}
