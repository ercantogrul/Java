package day06_SwitchCase.DE06_SwitchCase_ilk.tasks;

import java.util.Scanner;

public class Task01__rakami_ascii_harfeCevirmek {
    public static void main(String[] args) {
        //Task->  Girilen bir tamsayının onlar basamağının
        // harf karakteri ile  print eden code create ediniz.
        //  176  onlar basamağı nasıl bulunuz ?
        // önce 10 bölüerim int bölme olduğundan elimde 17 kalır ben 7 ye ulaşmak istiyorum
        // sonra çıkan sonucu %10 yaptığımda 10 bölümden kalanı yani son rakamı verir 7 yi


        Scanner oku = new Scanner(System.in);
        System.out.print("en az iki basamakli bir Sayi giriniz = ");
        int sayi = oku.nextInt();

        int ilkikiB = sayi/10;
        int onlarB = ilkikiB%10;
        System.out.println("sayinin onlar basamagi : "+ onlarB);


              switch (onlarB) {
                  case 1: System.out.println("onlar basamagi: Bir dir");break;
                  case 2: System.out.println("onlar basamagi: Iki dir");break;
                  case 3: System.out.println("onlar basamagi: Üc dür");break;
                  case 4: System.out.println("onlar basamagi: Dört dür");break;
                  case 5: System.out.println("onlar basamagi: Bes dir");break;
                  case 6: System.out.println("onlar basamagi: Alti dir");break;
                  case 7: System.out.println("onlar basamagi: yedi dir");break;
                  case 8: System.out.println("onlar basamagi: Sekiz dir");break;
                  case 9: System.out.println("onlar basamagi: Dokuz dur");break;
                  default:
                      System.out.println("hatali ");
              }





        /*
        System.out.println("sayinin Ascii de ki harf karsiligi nedir");
         int karakter =onlarB;
        char asciDegeri = (char)karakter;

        System.out.println("cikan sayinin ascii degeri : "+ asciDegeri);
         */




    }
}
