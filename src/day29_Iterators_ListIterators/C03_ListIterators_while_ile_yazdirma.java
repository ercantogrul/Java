package day29_Iterators_ListIterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C03_ListIterators_while_ile_yazdirma {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Harika","Eda","Hasan","Ceren","Tugba","Taha","Ismail","Murat","Yahya","Hale"));
        ListIterator<String> listItr = list.listIterator(list.size()); // son elemanin sonuna konumlandirir

        int index = list.indexOf("Yahya");
        System.out.println(index);



        while (listItr.hasPrevious()){ // solunda eleman varsa true yoksa false dönderir
           System.out.print(listItr.previous()+", ");  // soldakini bir oku bir geri git
       }
        System.out.println();
        System.out.println("bitti");
        System.out.println("=======");

       //pointer nerede')
       while (listItr.hasNext()){// saginda eleman varsa true yoksa false dönderir  // yukardakinin tam tersi
           System.out.print(listItr.next()+", "); // sagdakini oku bir ilieri git
       }



    }
}
