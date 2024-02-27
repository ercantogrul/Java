package day13_ArrayList.DE13_ArrayList_ilk.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_arraylist1___str_list_te_varmi {

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

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Orange", "Kiwi", "Peach", "Banana", "Orange"));
        String str = "Orange";

        int sayi = getCount(arrayList,str);
        System.out.println(sayi);

    }

    private static int getCount(ArrayList<String> arrayList, String str) {
        int count=0;
        for (int i = 0; i <arrayList.size() ; i++) {
            if (arrayList.get(i).equals(str)) count++;
        }
        return count;
    }


}
