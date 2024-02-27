package day36_InterviewQuestions.DE40InterviewQuestions__.Day02;

import java.util.Scanner;

public class Q002_AmstrongNumber_4Digits {
     /*
    Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407, 1634)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
        1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634

        5 basamakli : 54748 = 5*5*5*5*5 + 4*4*4*4*4 + 7*7*7*7*7 + ...

      */
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.print("Bir sayi giriniz :");
         String strSayi = scan.next();
         int sayi = Integer.parseInt(strSayi);
         amstrongSayi(sayi);
// 5372

     }

    private static void amstrongSayi(int sayi) {
         int bSayisi=(sayi+"").length();
         int kuvTop=0;
         int ilksayi=sayi;
         while (sayi>0){
             int basamak = sayi%10;
             kuvTop += (int) Math.pow(basamak,bSayisi);
             sayi /=10;
         }
         if (kuvTop == ilksayi) System.out.println(ilksayi+" amstrong sayıdır");
         else System.out.println(ilksayi+" amstrong sayı değildir");
    }


}
