package day12_Arrays.DE12_Arrays.Tasks02;

import java.util.Arrays;

class Dizi {
    public static boolean contains(int[] dizi, int sayi) {
        boolean result = false;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == sayi) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean compare(int[] arr1, int[] arr2) {

        int snc = Arrays.compare(arr1, arr2);
        if (snc == 0) return true;
        else return false;

    }
}
