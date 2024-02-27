package day36_InterviewQuestions.DE40InterviewQuestions__.Day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01_UniqeArray {
    /*
     * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array haline getiren bir program yaziniz.
     *
     * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
     * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
     */
    public static void main(String[] args) {
        int [] arr = {7,9,7,3,7,4,2,-2,7,6,8,7,5,6,-2,7,3,10};
        List<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().toList());
        List<Integer> list2 = new ArrayList<>(Arrays.stream(arr).boxed().toList());
        System.out.println(list);
        arr = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(arr));

        // yontem 2

        for (int i = 0; i < list.size() ; i++) {
            int siradakiEleman = list.get(i);
        //    System.out.println(list);
            list.removeIf(p->p==siradakiEleman) ; // ilk eleman dahil hepsini sildi
       //     System.out.println(list);
            list.add(i,siradakiEleman); // ilk elemanı yerine koydu
       //     System.out.println(list);
      //      System.out.println("---------");
        }
        System.out.println(list);

        // yondem 3
        List<Integer> listYeni = new ArrayList<>();
        for (int i = 0; i < list2.size() ; i++) {
            if (!listYeni.contains(list2.get(i))) listYeni.add(list2.get(i));
        }
        System.out.println(listYeni);

    }

}
