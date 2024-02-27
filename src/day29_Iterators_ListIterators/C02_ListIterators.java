package day29_Iterators_ListIterators;

import java.util.*;

public class C02_ListIterators {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Harika","Eda","Hasan","Ceren","Tugba","Taha","Ismail","Murat","Yahya","Hale"));
        ListIterator <String> listItr = list.listIterator(3); // 3. elemanin basina konumlandirir
        listItr = list.listIterator(list.size()); // en sona konumlandirir

        System.out.println(listItr.previous());
        listItr.set("yeni");
        System.out.println(list);
        System.out.println(listItr.previous());
        listItr.add("adding");
        System.out.println(list);
        System.out.println(listItr.next());


        List<Integer> listInt = new ArrayList<>(Arrays.asList(4,2,6,11,7,43,2,8));
        ListIterator<Integer> listItrI = listInt.listIterator();
    }
}
