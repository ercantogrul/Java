package day08_Loops.DE08_Loops_ilk.L02_WhileLoops.Tasks02;

import java.util.Scanner;

public class Task02_06 {
    public static void main(String[] args) {
        // ekrandan 10 adet sayı giriniz ve bunların tek sayı olanların toplamını bulunuz


        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz ");

        int toplamT =0;
        int i=1;
        while (i<=10){
            System.out.println(i+". sayi");
            int gsayi =scan.nextInt();

            if (gsayi%2!=0){
                toplamT+=gsayi;
            }
            i++;
        }
        System.out.println("tek sayilarin toplami :"+toplamT);













    }
}
