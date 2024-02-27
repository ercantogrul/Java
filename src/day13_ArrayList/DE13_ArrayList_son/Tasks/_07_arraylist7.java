package day13_ArrayList.DE13_ArrayList_son.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _07_arraylist7 {

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

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(3, 2, 5, 6 ,8, 8, 8));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5, 8, 9,8,7,3,1));
        System.out.println(list1);
        System.out.println(list2);
        ArrayList<Integer> resultList = common_values(list1,list2);
        System.out.println(resultList);

    }

    private static ArrayList<Integer> common_values(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> rList = new ArrayList<>();
        for (int i = 0; i <list2.size() ; i++) {
            int eleman = list2.get(i);
            if (list1.contains(eleman)) {
                if (!rList.contains(eleman)) rList.add(eleman);
            }

        }
        return rList;
    }


}
