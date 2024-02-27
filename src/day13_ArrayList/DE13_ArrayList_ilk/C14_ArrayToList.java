package day13_ArrayList.DE13_ArrayList_ilk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C14_ArrayToList {
    public static void main(String[] args) {
        String[] ulkeArr ={"Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"};

        List<String> ulkeList= Arrays.asList(ulkeArr);//ulkeArr elemanları ulkelist'e atandı
        List<String> ulkeList2=List.of(ulkeArr); // aynı işi yapar
        System.out.println(ulkeList);
        System.out.println(ulkeList2);


        //====================ÖNEMLI============

        List<Integer> list = new ArrayList<Integer>();
        Integer[] arr = {2, 10, 3};
        //  list = Arrays.asList(arr);//Arrays.asList(arr) bu şekilde yeni bir liste oluşturduğumuz zaman listenin elemanlarında değişiklik yapamayız!!
        list.addAll(List.of(arr));  //bununla yapinca sorun olmuyor
        list.set(0, 3);
        System.out.println(list);// 2,10,3   -- 3,10,3
        list.add(1);
        System.out.println(list);// 3,10,3,1 ---  2,10,3,1











    }
}
