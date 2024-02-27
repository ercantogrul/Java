package day35_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_i_Array_a_Cevir {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(58,7,54,41,59,33,38,13,65,61,46,45,25,16));
        System.out.println(list);

        //*****************Listi Array a cevirdik********************her data türü icin gecerli
        int [] arr2 = list.stream().mapToInt(p->p).toArray();
        System.out.println(Arrays.toString(arr2));

        /*
        veya ayni data türü Integer ise
        Integer [] arr = new Integer[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int) (Math.random()*99+1);
        } System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr)); //array liste cevirme
        System.out.println(list);

        List<Integer> list1 = Arrays.stream(arr).toList(); // stream ile array liste cevirme
        System.out.println(list1+"__");
         */

        //******************** Array'i List e cevirme******************
        List<Integer> list2 = Arrays.stream(arr2).boxed().toList();
        System.out.println(list2);


        //Array in toplamini bulduk
        int [] arr = {1,5,2,7,3,5};
        int arrToplam = Arrays.stream(arr).sum();
        System.out.println(arrToplam);



    }
}
