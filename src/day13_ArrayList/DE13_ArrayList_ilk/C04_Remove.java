package day13_ArrayList.DE13_ArrayList_ilk;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_Remove {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>
                (Arrays.asList("Ankara","Mersin","Trabzon","İzmir","Samsun"));
        //String[] dizi = new String[10];
        System.out.println(list);
        // Soru 1 - ilk elamanı en sona atın
        String str = list.remove(0);// 0.elemanı siler ve o elemanı bize dönderir
        list.addLast(str);
        list.remove(0); // list.removeFirst(0)
        System.out.println(list);
        System.out.println(list.remove("trabzon")); // sierse true, silemez ise false dönderir
        System.out.println(list);
        System.out.println(list.size());
        list.clear();
    }
}
