package day13_ArrayList.DE13_ArrayList_ilk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C07_isEmpty_clear {
    public static void main(String[] args) {
        //isEmpty()-> listin boş olmasını kontrol eder true/false return eder
        // clear : listi siler
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));
        if (ulkelist.isEmpty()) System.out.println("dizi boş");
        //bunun yerine
        if (ulkelist.size()==0)  System.out.println("dizi boş");

        ulkelist.clear();
        System.out.println(ulkelist);
        // bunun yerine
        ulkelist = new ArrayList<>(); // ulkelist.clear(); nin işini yapar ( aynı şey değil, çünkü referans değişir)
        System.out.println(ulkelist);


    }
}
