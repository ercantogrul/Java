package day13_ArrayList.DE13_ArrayList_son;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class C15_NestedArrayList {
    public static void main(String[] args) {
        List<Integer> dizi = new ArrayList<>(Arrays.asList(4,5,7,2,5,8,0,8,7,4));
        List<Integer> dizi2 = new ArrayList<>(Arrays.asList(1,4,5,7,2));
        List<Integer> dizi3 = new ArrayList<>(Arrays.asList(3,1,7,2));
        List<String> dizi4 = new ArrayList<>(Arrays.asList("Has","Yas","Ast"));
        List<List<Integer>>  diziler = new ArrayList<>();
        diziler.add(dizi);
        diziler.add(dizi2);
        diziler.add(0,dizi3);
        System.out.println(diziler.size()); // 3 verir
        System.out.println(diziler.getFirst().size());
    }
}
