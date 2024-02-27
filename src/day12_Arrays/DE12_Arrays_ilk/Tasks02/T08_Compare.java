package day12_Arrays.DE12_Arrays_ilk.Tasks02;

import java.util.Arrays;

public class T08_Compare {
    // 2 dizi var, compare kullanarak ,
    // diziler eşit ise true değilse false dönderen bir method yazınız
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, };

        boolean sonuc= compare(arr1, arr2);
        System.out.println("diziler esit mi : "+sonuc);

    }

    private static boolean compare(int[] arr1, int[] arr2) {
        boolean compare = true;

        if (Arrays.compare(arr1, arr2) == 0){
            compare=true;
        }else compare=false;
        return compare;

    }


}
