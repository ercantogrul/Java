package day12_Arrays.DE12_Arrays_ilk.Tasks;

import java.util.Arrays;

public class _19_2d_Array_3_____ohio_to_Florida {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */
        String [][] arr = {{"new jersey","atlanta","ohio"},{"Pittsburgh" ,"ohio","new york","ohio"},{"ohio","new york"}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].equals("ohio")) arr[i][j]="Florida";
                System.out.print(arr[i][j]+", ");
            }
        }System.out.println();

        System.out.println(Arrays.deepToString(arr)); // cift boyutlu array leri yazar

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));

        }






    }
}

