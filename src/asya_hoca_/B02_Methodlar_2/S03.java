package asya_hoca_.B02_Methodlar_2;

import java.util.Scanner;

public class S03 {
    public static void main(String[] args) {
         /*
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
    girilen sayı dahil(tek ise), tek olanlarin adet yazdiralim
   */
        Scanner scan =new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        int sayi =scan.nextInt();
        for (int i = 0; i <=sayi; i++) {
            if (i%2==1){
                System.out.print(i+" ");
            }
        }
    }


}
