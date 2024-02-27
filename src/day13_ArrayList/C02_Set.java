package day13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C02_Set {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ankara","Mersin","Trabzon","Izmir","Samsun"));
        //String [] dizi =new String[10];

        System.out.println(list); //[Ankara, Mersin, Trabzon, Izmir, Samsun]

        // *** Set *** istenilen index in üzerine yazdirir
        list.set(2,"Trabzon61");
        System.out.println(list); //[Ankara, Mersin, Trabzon61, Izmir, Samsun]

        // son elemani "SUrfa" yapin
        list.set(list.size()-1,"SUrfa");
        System.out.println(list);  //[Ankara, Mersin, Trabzon61, Izmir, SUrfa]





    }
}
