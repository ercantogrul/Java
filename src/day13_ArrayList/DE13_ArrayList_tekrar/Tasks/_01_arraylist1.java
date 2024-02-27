package day13_ArrayList.DE13_ArrayList_tekrar.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_arraylist1 {

    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("Orange" , "Kiwi" , "Peach" , "Banana" , "Orange"));

        String str ="Orange";
        int sonuc = getCount(arr,str);
        System.out.println("sonuc = " + sonuc);

    }

    private static int getCount(ArrayList<String> arr, String str) {

        int counter =0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equalsIgnoreCase(str)){
                counter++;
            }
        }
        return counter;
    }

}
