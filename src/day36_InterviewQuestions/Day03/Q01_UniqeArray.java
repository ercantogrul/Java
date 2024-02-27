package day36_InterviewQuestions.Day03;

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
        int [] arr = {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10};

        ArrayList<Integer> list= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
           list.add(arr[i]); //Array, list'e aktarildi
        }System.out.println(list);


      // ilk yöntem
        ArrayList<Integer> list2= new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!list2.contains(list.get(i))){
                list2.add(list.get(i));
            }
        } System.out.println(list2);


        // ikinci yöntem
        System.out.println("-----ikinci yöntem-----------");
        arr= Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(arr));

        // ücüncü yöntem
        System.out.println("-----ücüncü yöntem-----------");
        List<Integer> list3 = new ArrayList<>(Arrays.stream(arr).boxed().toList());
        for (int i = 0; i < list3.size() ; i++) {
            int siradakiEleman = list.get(i);
            //    System.out.println(list);
            list.removeIf(p->p==siradakiEleman) ; // ilk eleman dahil hepsini sildi
            //     System.out.println(list);
            list.add(i,siradakiEleman); // ilk elemanı yerine koydu
            //     System.out.println(list);
            //      System.out.println("---------");
        }
        System.out.println(list3);

    }

}
