package day13_ArrayList;

import java.util.ArrayList;

public class C01_Add {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        //int [] dizi = new int[10];

        // **** add **** ile sirayla veri ekliyoruz
        list.add("Ankara");
        list.add("Mersin");
        list.add("Trabzon");
        list.add("Izmir");
        list.add("Samsun");
        System.out.println(list); //[Ankara, Mersin, Trabzon, Izmir, Samsun]

        // araya ekleme yöntemi
        list.add(2,"Hatay");  // 2. siraya Hatayi ekler,ve digerlerini saga (ileri) kaydirir. eleman sayisi 6 oldu
        System.out.println(list); //[Ankara, Mersin, Hatay, Trabzon, Izmir, Samsun]
        list.add(0,"Berlin"); // 0. indexe Berlini ekledik

       // Java JDK 21

        list.addFirst("Frankfurt"); // 0. indexe Frankfurt eklendi
        list.addLast("Espoo"); // son indexe Espoo eklendi (list.size-1)







    }
}
