package day12_Arrays.DE12_Arrays_ilk.Tasks02;

import java.util.Arrays;

public class T06 {
    public static void main(String[] args) {
        // Diziyi büyükten küçüğe sıralayınız (kendi içinde)
        int[] arr = {21, 27, 46, 79, 44, 2, 1, 80};
        int n = arr.length;

        Arrays.sort(arr); //kucukten buyuge
        int temp = arr[0];

        for (int i = 0; i < n; i++) {
            arr[i] = arr[(n - 1) - i];
        }
        arr[n - 1] = temp;
        System.out.println(Arrays.toString(arr));

    }
}
