package asya_hoca_.asya_hoca_25_10;

import java.util.Scanner;

public class s1__enB_enK_sayi {
    public static void main(String[] args) {

//write a code that take  numbers from user at 3 times
        //return maximum number

        //And return minumum number

        Scanner scan =new Scanner(System.in);
        System.out.println("n sayi giriniz");
        int n2 = scan.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n2; i++) {
            System.out.println(i+ ".sayi");
            int gs =scan.nextInt();
            if (gs>max) {
                max=gs;
            }
            if (gs<min) {
                min=gs;
            }
        }
        System.out.println("en kücük sayi:"+ min);
        System.out.println("en büyük sayi:"+ max);

        //============================================

        int gs,buyuks=0,kucuks=0;
        for (int i = 1; i <= n2; i++) {
            System.out.println(i+ ".sayi");
            gs =scan.nextInt();
            if (i==1) {buyuks=gs;kucuks=gs;

            } else {
                if (buyuks<gs)  buyuks=gs;
                else if (kucuks>gs)  kucuks =gs;
            }
        }
        System.out.println("en büyük sayi = "+buyuks);
        System.out.println("en kücük sayi = "+kucuks);
















    }
}
