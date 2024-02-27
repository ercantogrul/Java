package day08_Loops.DE08_Loops_ilk.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // task-> Girilen sayıların toplamı 333'ü geçtiğinde girilen sayı adetini ve toplamını print eden code create edinz

        Scanner sc = new Scanner(System.in);
       // System.out.println("bir sayi giriniz: ");
       // int sayi = sc.nextInt();

        /*
        int toplam=0;
        int sayac=0;
            for (int i = 1; i <=333; i++) {
            System.out.println(i+" .inci sayi");
            int gs =sc.nextInt();
            sayac++;
            toplam=toplam+gs;
            if (toplam>=333){
              System.out.println("girilen sayi sayisi:"+ sayac);break;
                }

            }

         */


        //===while ile cozum==========================


        int toplam1=0;
        int sayac1=0;

        int sayi;
        while (toplam1<333){
            System.out.println("sayi giriniz:");
            sayi=sc.nextInt();
            toplam1 = toplam1+sayi;
            sayac1++;

            toplam1=toplam1+sayi;

        }
        System.out.println("girilen sayilarin toplami"+toplam1);
        System.out.println("girlen sayi adedi"+sayac1);














    }
}
