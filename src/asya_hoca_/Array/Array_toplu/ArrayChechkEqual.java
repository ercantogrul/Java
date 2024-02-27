package asya_hoca_.Array.Array_toplu;

import java.util.Arrays;

public class ArrayChechkEqual {
    public static void main(String[] args) {
        //Girilen iki array'ın birbirine eşit olup olmadığını bulun

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 1, 3};
        Arrays.sort(arr2);//Küçükten büyüyeğe doğru sıralar
        if (Arrays.equals(arr1, arr2)) {//İki dizinin aynı index ve değerine göre kontrol eder.
            System.out.println("eşit");
        }

    }
}
