package day13_ArrayList.DE13_ArrayList_ilk;

import java.util.ArrayList;
import java.util.Arrays;

public class C16_clear {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>
                (Arrays.asList("Ankara","Mersin","Trabzon","İzmir","Samsun"));
        //String[] dizi = new String[10];
        System.out.println(list); //[Ankara, Mersin, Trabzon, İzmir, Samsun]

        list.clear();
        System.out.println(list);  //[]
    }
}
