package day13_ArrayList.DE13_ArrayList_ilk;

import java.util.ArrayList;
import java.util.List;

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
        list.add("ahmet");//[Ankara, Mersin, Hatay, Trabzon, İzmir, Samsun, ahmet] son yazilani sona ekler
        list.add(2,"Hatay");// 2. sıraya Hatay'ı ekler, ve diğerlerini ileri kaydırı
        System.out.println(list);
        list.add(0,"Berlin");
        System.out.println(list);

        // Java JDK 21
        list.addFirst("Frankfurt"); //  = list.add(0,"Frankfurt"); //en Basa ekle
        list.addLast("Espoo"); // = list.add("Espoo")  //sona ekle
        System.out.println(list);


        //=========================================

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(0);
        list1.add(new Integer(2));
        list1.add(new Integer(3));
        //  list1.remove(1);
        System.out.println(list1);  //[0, 2, 3]






    }
}
