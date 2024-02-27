package day12_Arrays.DE12_Arrays_ilk.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task05_terstenprint__ {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.

        int[] array = {2,3,4,5};

        method1(array);



    }
    private static void method1(int[] array) {
        int [] yeniarr = new int[array.length];
        for (int i = array.length-1,j=0; i>=0 ; i--,j++) {
            yeniarr[j] = array[i];

        }
        System.out.println("cozum1 ; "+Arrays.toString(yeniarr));

    }

}
