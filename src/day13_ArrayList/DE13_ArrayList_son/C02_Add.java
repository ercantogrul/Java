package day13_ArrayList.DE13_ArrayList_son;

import java.util.ArrayList;

public class C02_Add {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //int[] dizi = new int[10];
        // add, ile veri ekliyoruz
        list.add("Ankara");
        list.add("Mersin");
        list.add("Trabzon");
        list.add("İzmir");
        list.add("Samsun");
        System.out.println(list);
        list.add(2,"Hatay");// 2. sıraya hatayı ekler, ve diğerlerini ileri kaydırı
        System.out.println(list);
        list.add(0,"Berlin");
        System.out.println(list);

        // Java JDK 21
        list.addFirst("Frankfurt"); //  = list.add(0,"Frankfurt");
        list.addLast("Espoo"); // = list.add("Espoo")
        System.out.println(list);

    }
}
