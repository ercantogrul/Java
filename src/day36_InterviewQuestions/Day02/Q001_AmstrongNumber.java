package day36_InterviewQuestions.Day02;

import java.util.Scanner;

public class Q001_AmstrongNumber {
     /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami
         o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          Soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının
          amstrong sayı olup olmadıgını gösteren program yazınız */
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Bir sayi giriniz :");
         int sayi = scan.nextInt();
         int bb = sayi%10;
         int ob = (sayi%100)/10;
         int yb = (sayi%1000)/100;

         if (Math.pow(bb, 3) + Math.pow(ob, 3) + Math.pow(yb, 3)== sayi) {
             System.out.println("sayi Armstrong sayidir");
         } else {
             System.out.println("sayi Armstrong sayi degildir");
         }

         amstronSayi(sayi);


     }

    private static void amstronSayi(int sayi) {

        int bSayisi = (sayi+"").length();
        int kuvTop=0;
        int ilkSayi=sayi;
        while (sayi>0){
            int basamak = sayi%10;
            kuvTop+= (int) Math.pow(basamak,bSayisi);
            sayi=sayi/10;
        }
        if (kuvTop==ilkSayi){
            System.out.println("sayi Armstrong sayidir");
        } else {
            System.out.println("sayi Armstrong sayi degildir");
        }





    }
// 153



}
