package day13_ArrayList.DE13_ArrayList_ilk.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _06_arraylist6_sayi_oncekindenBuyuk_sonrakindenK {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int ,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(5, 4, 6, 2, 1));


        hillNum(arrayList);

    }

    private static void hillNum(ArrayList<Integer> arrayList) {

        for (int i = 1; i < arrayList.size()-1; i++) {

            if (arrayList.get(i) > arrayList.get(i + 1) && arrayList.get(i) < arrayList.get(i - 1)) {
                System.out.println("arrayList.indexOf(i) = " + arrayList.get(i));
            }


        }

    }


}
