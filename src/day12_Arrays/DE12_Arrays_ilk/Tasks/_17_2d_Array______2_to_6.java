package day12_Arrays.DE12_Arrays_ilk.Tasks;

import java.util.Arrays;

public class _17_2d_Array______2_to_6 {

    public static void main(String[] args) {

         /*
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.
         */

        //Kodu aşağıya yazınız.
        int[][] dizi = {{2, 3, 2}, {4, 1, 5}, {7, 2, 5}};
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (dizi[i][j]==2) dizi [i][j] =6; // i nin j
                System.out.print(dizi[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(dizi[0])); // 2, 3, 2






    }
}





