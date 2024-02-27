package day10_MethodCreation.DE10_MethodCreation_ilk.Tasks;

import java.util.Scanner;

public class Task25_faktoryel {
    public static void main(String[] args) {

    //task-> girilen sayını faktoriyelini print eden METHOD create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir tamsayi giriniz: ");
        int sayi = scan.nextInt();

        System.out.println(faktoryel(sayi));


    }
    private static int faktoryel (int sayi1) {
        int faktoryel = 1;
        for (int i = 1; i <= sayi1 ; i++) {
            faktoryel=faktoryel*i;

        }
        return faktoryel;
    }
}
