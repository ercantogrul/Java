package day29_Iterators_ListIterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C04_ListIterators_for_ile_yazdir {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Harika","Eda","Hasan","Ceren","Tugba","Taha","Ismail","Murat","Yahya","Hale"));
        ListIterator<String> listItr = list.listIterator(); // son elemanin sonuna konumlandirir

        for (int i = 0; listItr.hasNext(); i++) {  // sart olarak listItr.hasNext() sagda eleman varsa asagida yazdir i ile bir ileri git
            System.out.print(listItr.next()+", ");
        }
        System.out.println("===================");
        for (int i = 0; listItr.hasPrevious(); i++) {  // tersten yazdirdik
            System.out.print(listItr.previous()+", ");
        }
        System.out.println();

        int i;
        for (i = 0; listItr.hasNext(); i++) {
            System.out.print(listItr.next()+", ");
            System.out.println(i);  // eleman sayisida tespit edildi
        }


    }
}
