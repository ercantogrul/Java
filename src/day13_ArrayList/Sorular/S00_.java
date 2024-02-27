package day13_ArrayList.Sorular;

import java.util.ArrayList;
import java.util.Arrays;

public class S00_ {
    public static void main(String[] args) {
        //soru1: ilk elemani sona atin
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ankara","Mersin","Trabzon","Izmir","Samsun"));
        String str = list.remove(0); // o. elemani siler ve o elemani bize döndürür.
        System.out.println(str);  //Ankara


        list.addLast(str);
        System.out.println(list);  // [Mersin, Trabzon, Izmir, Samsun, Ankara] **NOT** 0. elemani alip sona ekledik


        list.remove(0); // ilk elemani (0.) sildik
        //list.removeFirst();  üstteki ile ayni
        System.out.println(list); //[Trabzon, Izmir, Samsun, Ankara]


        System.out.println(list.remove("trabzon")); // t kucuk (fakli kelime) oldugu icin silmez ve false döndürür
        System.out.println(list);  // silmedi [Trabzon, Izmir, Samsun, Ankara]
        System.out.println(list.remove("Trabzon")); // T büyük (ayni kelime) oldugu icin siler ve true döndürür
        System.out.println(list);  // sildi [Izmir, Samsun, Ankara]


    }

}
