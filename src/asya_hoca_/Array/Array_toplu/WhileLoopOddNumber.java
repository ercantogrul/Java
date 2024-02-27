package asya_hoca_.Array.Array_toplu;

import java.util.Scanner;

public class WhileLoopOddNumber {
    public static void main(String[] args) {
         /*
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
    girilen sayı dahil(tek ise), tek olanlarin adet yazdiralim
   */
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        while(n>0){
            System.out.println("Ekrana bir sayı giriniz:");
            int num=scanner.nextInt();
            if (num%2!=0){
                System.out.println(num+"");
            }
            n--;
        }


    }
}
