package day13_ArrayList.DE13_ArrayList_ilk.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _07_arraylist7______ {

    /*
        common_values() isminde bir method oluşturun.
        Parametre olarak 2 tane Integer ArrayList
        Return tipi integer ArrayList olmalı
         İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
        Örneğin;
        ArrayList 1:    3 , 2 , 5 , 6
        ArrayList 2:     5 , 8 , 9
        return  5 olmalı

        Örneğin;
        ArrayList 1: 8,7,9,6,7
        ArrayList 2: 6,7,12,3,1
        return 6 ve 7 olmalı
     */

    public static void main(String[] args) {

        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(3, 2, 5, 6));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(5, 8,2,12, 9));

        System.out.println("common_values(arrayList1,arrayList2) = " + common_values(arrayList1, arrayList2)); //1.yol

        System.out.println("ikiniyol(arrayList1,arrayList2) = " + ikiniyol(arrayList1, arrayList2));  //ikinci yol


    }

    private static ArrayList<Integer> ikiniyol(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {
        ArrayList<Integer> rlist3 = new ArrayList<>();
        for (int i = 0; i < arrayList2.size(); i++) {
            int eleman = arrayList2.get(i);
            if (arrayList1.contains(eleman)){
                if (!rlist3.contains(eleman)) rlist3.add(eleman);


            }

        }return rlist3;

    }

    private static ArrayList<Integer> common_values(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {

        ArrayList<Integer> arrayList3 = new ArrayList<>();

        for (int i = 0; i < arrayList1.size(); i++) {
            int eleman= arrayList1.get(i);
            for (int j = 0; j < arrayList2.size(); j++) {
                if (arrayList2.get(j).equals(eleman)){
                    arrayList3.add(eleman);
                }
            }
        }
        return  arrayList3;



    }


}
