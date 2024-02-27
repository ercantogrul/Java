package asya_hoca_.Array;

import java.util.Arrays;

public class S10_ {
    public static void main(String[] args) {
            /*
       given an int array and find the squares of the elements
       (Verilen bir int dizisi icin elemanlarin karelerini bulun )
       Example:{2,6,4,5,8,9}
       output:{4,36,16,25,64,81}
       */


        int[] arr = {2, 6, 4, 5, 8, 9};

        elemanlarinKaresi(arr);
    }

    private static void elemanlarinKaresi(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(arr[i], 2);

        }
        System.out.println("arr = " + Arrays.toString(arr));
    }

}





