package day12_Arrays.DE12_Arrays_ilk.Tasks;

import java.util.Arrays;

public class Task19_IcArraydekilerdenAyniIndexliOlanlariToplama____ {
    public static void main(String[] args) {
        //Task-> Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
        // elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
        // arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }  // 3 e 3 lük bir dizi yani iki boyutlu

        int[][] arr1 = {{1, 2, 0}, {3, 4, 5}, {6, 0, 0}};// bos olan yerlere toplamin sonucu degismeyecegi icin 0 atadim:))
        int[][] arr2 = {{7, 8, 9}, {10, 11,0}, {12,0,0}};
       // int[][] dizi = new int[Math.max(arr1.length, arr2.length)][Math.max(arr1.length, arr2.length)];
        //System.out.println(Arrays.toString(dizi));

        int [][] toplam = new int[arr1.length][0];

        for (int i = 0; i < arr1.length; i++) {
            int boyut = Math.max(arr1[i].length,arr2[i].length);
            arr1[i] = Arrays.copyOf(arr1[i],boyut);
            arr2[i] = Arrays.copyOf(arr2[i],boyut);
            toplam [i] = Arrays.copyOf(toplam[i],boyut);
        }
        for (int i = 0; i < toplam.length; i++) {
            System.out.println(Arrays.toString(toplam[i]));

        }
        for (int i = 0; i < toplam.length; i++) {
            for (int j = 0; j < toplam[i].length; j++) {
                toplam[i][j]=arr1[i][j] + arr2[i][j];

            }

        }System.out.println("newArr = " + Arrays.deepToString(toplam));




    }

}
