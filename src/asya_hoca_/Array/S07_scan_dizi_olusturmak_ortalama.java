package asya_hoca_.Array;

import java.util.Arrays;
import java.util.Scanner;

public class S07_scan_dizi_olusturmak_ortalama {
    public static void main(String[] args) {
        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan buyuk olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output1 : 4
         * Output2 : 5,6,7
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen olusturmak istediginiz dizi eleman sayisi giriniz");
        int n = scan.nextInt();
        int [] array = new int[n];

        for (int i = 0; i <array.length ; i++) {
            System.out.println("dizinin elemanlarini giriniz");
            array [i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(array));

        average(array);
        bigger(array,average(array));

    }

    private static void bigger(int[] array, int ort) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]>ort){
                System.out.println(array[i]+" ");
            }
        }
    }

    private static int average(int[] array) {
        int sum =0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        System.out.println(sum/array.length);

        return sum/array.length; // dizinin ort aldik
    }


}
