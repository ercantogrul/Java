package day13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class remove {
    public static void main(String[] args) {
        List<String > list1=new ArrayList<>();
        list1.add("ali");
        list1.add("mehmet");
        list1.add("ayse");
        list1.add("ahmet");
        System.out.println(list1);

        List<Integer >list2=new ArrayList<>();
        list2.add(1);
        list2.add(15);
        list2.add(5);
        list2.add(7);
        System.out.println(list2);

        System.out.println(list1.remove(1));  // ildex 1 deki veriyi siliyor // mehmet silindi
        System.out.println(list1.remove("ayse"));//indeks değerini siler //true
        // önemli not: bunu sadece Stringlerde yapabiliriz
        System.out.println(list1); // [ali, ahmet]

        System.out.println(list2.remove(1));// indekste silinen değeri gösterir // 15 silindi
        System.out.println(list2); //[1, 5, 7]

    }
}
