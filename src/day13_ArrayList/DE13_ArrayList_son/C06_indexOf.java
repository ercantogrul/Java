package day13_ArrayList.DE13_ArrayList_son;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C06_indexOf {
    public static void main(String[] args) {
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        ulkelist.addAll(ulkelist); // indez yoksa sonuna ekleri, index varsa o indexten itibaren ekler
        int ilkIndex = ulkelist.indexOf("Güba");
        int lstIndex = ulkelist.lastIndexOf("Güba");
        System.out.println(ulkelist);
        System.out.println("ilkIndex = " + ilkIndex);
        System.out.println("lstIndex = " + lstIndex);
    }
}
