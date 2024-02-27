package day06_SwitchCase.DE06_SwitchCase;

import java.util.Scanner;

public class C04_SwitchCase {

    public static void main(String[] args) {
        // Task-> Girilen ay numarasına göre  mevsimini print eden code create ediniz...
        Scanner input = new Scanner(System.in);
        System.out.print("Dadaş hele bir ayın sayisini gir : ");
       int ayNo = input.nextInt();
       switch (ayNo) {
           case 1 :
           case 2 :
           case 12:
               System.out.println("KIŞ");break;
           case 3 :
           case 4 :
           case 5 :
               System.out.println("ILK BAHAR");break;
           case 6 :
           case 7 :
           case 8 :
               System.out.println("YAZ");break;
           case 9 :
           case 10:
           case 11:
               System.out.println("SonBAHAR");break;
           default:
               System.out.println("1 ila 12 arasında bir sayı girişi yapmalısınız");
       }



    }
}
