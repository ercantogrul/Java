package day13_ArrayList.DE13_ArrayList_son.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _08_arraylist8 {

    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(5, 3, 4, 6, 7, 7));

        int ikinciBuyuk = secondMax(arrayList);
        System.out.println(ikinciBuyuk);

    }

    private static int secondMax(ArrayList<Integer> arrayList) {
        int ikinciB=arrayList.getFirst();
        int enBuyuk = arrayList.getFirst();
        for (int i = 1; i <arrayList.size() ; i++) {
            if (arrayList.get(i)>enBuyuk) enBuyuk = arrayList.get(i);
        }
        for (int i = 1; i <arrayList.size() ; i++) {
            if (arrayList.get(i)!=enBuyuk && arrayList.get(i)>ikinciB)
                ikinciB = arrayList.get(i);
        }

        return ikinciB;
    }


}

