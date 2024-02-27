package day13_ArrayList.DE13_ArrayList_son;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_subList {
    public static void main(String[] args) {
        //sublist() -> listini istenen list parcasını return eder
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Almanya", "Güba", "Polya", "ingiltere", "Amerka"));
        List<String> liste =  ulkelist.subList(1,3);
        System.out.println(liste);
       //  List<String> list = new List<>(); sağ taraf class olmak zorunda List class değil ınterface dir

    }
}
