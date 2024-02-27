package day13_ArrayList.DE13_ArrayList_son;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C05_nCopies_addAll {
    public static void main(String[] args) {
        //nCopies(int n, Obj)-> n elemanlı sabit obj'den oluşan list tanımlar

        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        ArrayList<String> isimList = new ArrayList<>(List.of("Aydın", "Cihat", "Ismail", "Ceren", "Furkan", "Tugba"));//çuval
        // Collections.nCopies
        ArrayList<String> liste =  new ArrayList<>(Collections.nCopies(5,"selam"));
        System.out.println(liste);
        // addAll()
        ulkelist.addAll(ulkelist); // indez yoksa sonuna ekleri, index varsa o indexten itibaren ekler
        System.out.println(ulkelist);




    }
}
