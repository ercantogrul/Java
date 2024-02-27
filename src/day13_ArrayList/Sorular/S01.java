package day13_ArrayList.Sorular;

import java.util.ArrayList;

public class S01 {
    public static void main(String[] args) {
        // bir arraylisti -5,+5 arasibnda sayilar ile doldurun sonra ,
        // eksileri basa alin sifirlar ortada kalsin

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 11 - 5));
        }
        System.out.println(list);  // list olustu.

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                list.addLast(list.remove(i));
            }
        }
        System.out.println(list);  // sifirlar saga atildi

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                list.addLast(list.remove(i));
            }
        }System.out.println(list); // sifir dan büyük rakkamlar saga atildi.
    }
}