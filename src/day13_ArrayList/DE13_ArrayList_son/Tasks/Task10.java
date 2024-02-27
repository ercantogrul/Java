package day13_ArrayList.DE13_ArrayList_son.Tasks;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */



        int[] arr = {1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1};
        List<Integer> liste = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) liste.add(arr[i]);


        for (int i = 0; i <liste.size() ; i++) {
            int eleman = liste.get(i);
            for (int j = i+1; j <liste.size() ; j++) {
                if (liste.get(j)==eleman) {
                    liste.remove(j);
                }
            }
        }
        System.out.println(liste);

        arr = Arrays.copyOf(arr,liste.size());
        for (int i = 0; i <liste.size() ; i++) {
            arr[i] = liste.get(i);
        }
        System.out.println(Arrays.toString(arr));

    }

}
