package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T17 {
    public static void main(String[] args) {
       /*  verilen arrayin işaretlerini değiştirerek arrayliste aktarın(eksiler artı, artılar eksi olsun)

        */

        int[] arr = {21, -7, 46, -9, 44, 2, 1, 80};


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]*-1);

        }
        System.out.println("list = " + list);


    }





}
