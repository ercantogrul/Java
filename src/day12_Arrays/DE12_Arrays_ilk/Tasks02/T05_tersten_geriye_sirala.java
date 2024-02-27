package day12_Arrays.DE12_Arrays_ilk.Tasks02;

import java.util.Arrays;

public class T05_tersten_geriye_sirala {
    public static void main(String[] args) {
        // diziyi tersten geriye sıralı yazdırınız
        int[] arr = {21, 27, 46, 79, 44, 2, 1, 80};
        int n = arr.length;

        int [] yeni = new int[n];
        for (int i = n-1,j=0; i >=0 ; i--,j++) {
            yeni[j]=arr[i];

        }
        System.out.println(Arrays.toString(yeni));

    }
}
