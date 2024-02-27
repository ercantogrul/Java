package day13_ArrayList.DE13_ArrayList_ilk.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _08_arraylist8__secondMax_arrayList {

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

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(5, 3, 4, 6, 7));

        System.out.println("secondMax(arrayList) = " + secondMax(arrayList));

    }

    private static int secondMax(ArrayList<Integer> arrayList) {

        int enB = Integer.MIN_VALUE;

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > enB) {
                enB = arrayList.get(i);
            }
        }
        System.out.println("enB sayi : "+ enB);

        int ikincienB_Sayi = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if ((arrayList.get(i) != enB) && arrayList.get(i)>ikincienB_Sayi) {
                ikincienB_Sayi = arrayList.get(i);
            }
        }
        System.out.println("ikincienB_Sayi : "+ ikincienB_Sayi);

        return ikincienB_Sayi;
    }


}

