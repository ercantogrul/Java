package day13_ArrayList.DE13_ArrayList_son;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C12_reverse_sort {
    //Collections.sort():-> list elelmanlarını NATUREL sıralama yapar
    // Collections.reverse() method list elemanlarını index sırasına göre ters sıralar..
    public static void main(String[] args) {
        ArrayList<String> iller = new ArrayList<>(Arrays.asList("Mardin","Urfa","Trabzon","Rize","Van","Urfa"));
        System.out.println(iller);
        Collections.sort(iller);
        System.out.println(iller);
        Collections.reverse(iller);
        System.out.println(iller);

    }

}
