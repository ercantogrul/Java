package asya_hoca_.Array;

import java.util.Arrays;
import java.util.Scanner;

public class S10_dizi_eleman_karesi {
    public static void main(String[] args) {
        /*
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 elemanli bir dizi olusturunuz");
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("dizinin elemanlarini giriniz");
            array[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(array));

        diziElemanlariKaresiniBulma(array);




    }


    private static void diziElemanlariKaresiniBulma(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] * array[i]+", ");

        }


    }
}
