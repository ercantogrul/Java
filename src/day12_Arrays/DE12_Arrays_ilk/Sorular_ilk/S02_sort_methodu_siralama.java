package day12_Arrays.DE12_Arrays_ilk.Sorular_ilk;

import java.util.Arrays;

public class S02_sort_methodu_siralama {
    public static void main(String[] args) {
         /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

        // code start here

        int[] nums= {12, 2, 5, 15, 8};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);// küçükten büyüğe sıralmamı sağlar a'dan z'ye sıralama
        System.out.println(Arrays.toString(nums));
        int min=nums[0];// en küçük
        int max=nums[nums.length-1];//en büyük
        System.out.println("max = " + max);
        System.out.println("min = " + min);




    }
}
