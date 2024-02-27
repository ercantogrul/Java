package day13_ArrayList.DE13_ArrayList_ilk.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_arraylist2_sayilarin_toplami {

      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        getSum(arrayList);

    }

    private static void getSum(ArrayList<Integer> arrayList) {
        int toplam = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            toplam+= arrayList.get(i);

        }
        System.out.println(toplam);
    }


}
