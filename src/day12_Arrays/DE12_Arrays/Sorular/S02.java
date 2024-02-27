package day12_Arrays.DE12_Arrays.Sorular;

import java.util.Arrays;

public class S02 {
    public static void main(String[] args) {
        int[] arr = {3,6,1,3,5};
        int[] arr2= {5,1,11,4,6};
        // soru 6 arr ve arr2 nin elemanlarını toplayın
        // arr = {3, 6, 1, 3, 5};
        // arr2= {5, 1,11, 4, 6};
        // arrT=  8, 7,12, 7,11 şeklinde oluşmalı

        int[] arrT = new int[arr.length];
        for (int i = 0; i < arrT.length ; i++) {
            arrT[i] = arr[i]+arr2[i];
        }
        System.out.println(Arrays.toString(arrT));

    }
}
