package day12_Arrays.DE12_Arrays.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task19 {
    public static void main(String[] args) {
        //Task-> Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
        // elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
        //  ve arr2 = { {7,8,9}, {10,11}, {12}, arr1= { {1,2}, {3,4,5}, {6} }}
        // {
        int[][] dizi1 = {{7,8,9,6,7}, {10,11}, {12} };
        int[][] dizi2 = { {1,2}, {3,4,5}, {6} };
        int[][] tplam = new int[dizi1.length][0];
        for (int i = 0; i <dizi1.length ; i++) { // burada boyutları uzun olana göre ayarlıyoruz
            int boyut = Math.max(dizi1[i].length,dizi2[i].length);
            dizi1[i] = Arrays.copyOf(dizi1[i],boyut);
            dizi2[i] = Arrays.copyOf(dizi2[i],boyut);
            tplam[i] = Arrays.copyOf(tplam[i],boyut);
        }

        for (int i = 0; i < dizi1.length ; i++) { // topluyoruz
            for (int j = 0; j <dizi1[i].length ; j++) {
                tplam[i][j] = dizi1[i][j] + dizi2[i][j];
            }
        }


        for (int i = 0; i < tplam.length ; i++) { // yazdırıyoruz
            System.out.println(Arrays.toString(tplam[i]));
        }





    }
}
