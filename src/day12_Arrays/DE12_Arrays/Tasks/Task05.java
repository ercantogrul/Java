package day12_Arrays.DE12_Arrays.Tasks;

import java.util.Arrays;

public class Task05 {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.
        int sayi = 1874083;
        String[] dizi = (""+sayi).split("");
        System.out.println(sayi);
        for (int i = dizi.length-1; i >=0 ; i--) {
            System.out.print(dizi[i]);
        }
        System.out.println();
        String str = ""+sayi;
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }


    }

}
