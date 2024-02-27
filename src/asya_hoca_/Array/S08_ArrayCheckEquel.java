package asya_hoca_.Array;

import java.util.Arrays;

public class S08_ArrayCheckEquel {
    public static void main(String[] args) {
        //Girilen iki array'ın birbirine eşit olup olmadığını bulun
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        Arrays.sort(arr2); // arr yi kücükten büyüge dogru siralar


        if (Arrays.equals(arr1, arr2)) // iki diziyi ayni index ve degerine gore kontrol eder
            System.out.println("esit");


    }
}
