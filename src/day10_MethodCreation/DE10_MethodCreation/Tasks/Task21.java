package day10_MethodCreation.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        /*
    task-> girilen bir tamsayının basamak sayısını print eden METHOD create ediniz.
    */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        int sayi= scanner.nextInt();
        basamakSayisiYazdir(sayi);

    }

    private static void basamakSayisiYazdir(int sayi) {
        System.out.println((""+sayi).length());
    }
}
