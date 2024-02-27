package day12_Arrays.DE12_Arrays_ilk.Tasks;

import java.util.Arrays;

public class Task01_buyukten_kucuge_siralama {
    public static void main(String[] args) {
        //Task-> girilen bir int array elemanlarını buyukten kucuge   print eden code create ediniz.

        int[] array = {23, 45, 67, 12, 78};
        Arrays.sort(array);  // 12,23,45,67,78
        int[] yeniarr = new int[5];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            yeniarr[j] = array[i];

        }
        System.out.print(Arrays.toString(yeniarr));


    }
}
