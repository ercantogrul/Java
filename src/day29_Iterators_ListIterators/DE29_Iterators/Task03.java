package day29_Iterators_ListIterators.DE29_Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Task03 {
    public static void main(String[] args) {
        // verilen listedeki her elementi 3 artirin
        List<Integer> liste= new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        System.out.println(liste); // [5, 7, 8, 6, 9]

        /* listenin tum elementlerini bize getirmesi icin
           iterator'un hasNext() ve next() methodlarini kullanacagiz
         */

        ListIterator itr = liste.listIterator();



    }
}
