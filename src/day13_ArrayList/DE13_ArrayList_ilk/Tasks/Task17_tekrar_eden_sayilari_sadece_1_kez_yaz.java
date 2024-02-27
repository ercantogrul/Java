package day13_ArrayList.DE13_ArrayList_ilk.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task17_tekrar_eden_sayilari_sadece_1_kez_yaz {
    public static void main(String[] args) {
        // Task->  verilen bir listede tekrar eden sayilari sadece 1 kez print eden METHOD create ediniz
        // input : [1, 3, 5, 3, 5, 6, 1, 7]
        // output [1, 3, 5, 6, 7]
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 3, 5, 6, 1, 7));


        for (int i = 0; i <list.size() ; i++) {
            int eleman = list.get(i);
            for (int j = i+1; j <list.size() ; j++) {
                if (list.get(j)==eleman) {
                    list.remove(j);
                }
            }
        }
        System.out.println(list);

    }



}
