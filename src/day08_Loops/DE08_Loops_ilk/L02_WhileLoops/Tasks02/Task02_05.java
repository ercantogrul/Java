package day08_Loops.DE08_Loops_ilk.L02_WhileLoops.Tasks02;

import java.util.Scanner;

public class Task02_05 {
    public static void main(String[] args) {
        // ekrandan 10 adet sayı giriniz ve bunların toplamını bulunuz

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz ");

        int toplam =0;
        int i=1;
        while (i<=10){
            System.out.println(i+ " . sayi ");
            int sayi =scan.nextInt();
            toplam+=sayi;
            i++;
        }
        System.out.println("girilen sayilarin toplami : "+toplam);

    }
}
