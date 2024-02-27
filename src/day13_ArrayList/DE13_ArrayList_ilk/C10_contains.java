package day13_ArrayList.DE13_ArrayList_ilk;

import java.util.ArrayList;
import java.util.Arrays;

public class C10_contains {
    public static void main(String[] args) {
        //contains()-> list'te istenen elamnın varlığını control eder true/false return eder
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Almanya", "Güba", "Polya", "ingiltere", "Amerka"));

        if (ulkelist.contains("Güba")) System.out.println("vardır");
        else System.out.println("yoktur");
        // varsa sil
        System.out.println(ulkelist.remove("Güba"));
        System.out.println(ulkelist.remove("Güba"));

    }
}
