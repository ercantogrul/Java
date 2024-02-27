package asya_hoca_.sorular20_09;

import java.util.Scanner;

public class s7_Ternary {
    public static void main(String[] args) {
        /* Task->
         * Girilen double fiyat için
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * print eden code create ediniz
         */

        Scanner scan =new Scanner(System.in);
        System.out.print("fiyat giriniz : ");
        double i = scan.nextDouble();

        String sonuc = i<10? "ucuz" : i>=10&&i<20? "normal" : "pahali";
        System.out.println(sonuc);



    }
}
