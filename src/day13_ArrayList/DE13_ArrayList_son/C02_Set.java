package day13_ArrayList.DE13_ArrayList_son;

import java.util.ArrayList;
import java.util.Arrays;

public class C02_Set {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>
                (Arrays.asList("Ankara","Mersin","Trabzon","İzmir","Samsun"));
        //String[] dizi = new String[10];
        // add, ile veri ekliyoruz
        System.out.println(list);
        list.set(2,"Trabzon61");  // dizi[2] = "Trabzon61"; // trabzon teine trabzon61 yazdık
        System.out.println(list);
        // son elemanı "ŞUrfa" yapın
        list.set(list.size()-1,"ŞUrfa" );
        System.out.println(list);
    }
}
