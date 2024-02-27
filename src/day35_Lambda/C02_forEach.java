package day35_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_forEach {
    public static void main(String[] args) {

        List<Integer>list = new ArrayList<>(Arrays.asList(11,12,7,32,7,32,41,41,32,68,41,12,7,41,43,24,32));
        list.forEach(p-> {
            System.out.print(p+" ");  // list i yazdik
        });
        System.out.println();
    //============================================================================

        list.stream(); // Integer bir Stream a cevirdik
        list.forEach(p-> System.out.print(p+" ")); // **** yazdik bu tercih edilir
        System.out.println();
        list.stream().forEach(System.out::print);    // yazdik
        System.out.println("\n==========");

    //===============================================================
        // true ise al stream'e false ise alma..(elde bir stream var) forEAch ile sadece cift elemanlari verir
        list.stream().filter(p->p%2==0).forEach(p-> System.out.print(p+" "));
        System.out.println("\n"+list);  // listi tekrar yazdik

       // list=list.stream().filter(p->p%2==0).toList(); // süzülen haliyle stream i tekrar liste aktardik
       // System.out.println("\n"+list); // cift olanlari liste aktardik
    //===============================================================
        System.out.println("\n___________________________");
        list=list.stream().filter(p->p>30).toList(); //30 dan büyük olanlari liste aktardi
        System.out.println(list); //onlari list olarak yazdik
        list.stream().filter(p->p>30).forEach(p-> System.out.print(p+" ")); //30 dan büyük olanlari stream olarak yazdik


    }
    public static boolean method (int p){
        return p%2==0; //sayi cift ise true gönder
    }
    public static boolean method2 (int p){
        return true; // true gönder
    }
}
