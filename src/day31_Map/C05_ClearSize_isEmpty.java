package day31_Map;

import java.util.HashMap;
import java.util.Map;

public class C05_ClearSize_isEmpty {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("Germany", "Berlin");
        map.put("Hollanda", "Amsterdam");
        map.put("Belqium", "Brussels");
        map.put("Ranska", "Pariisi");

        System.out.println("map.size() = " + map.size());   //4
        System.out.println("map.isEmpty() = " + map.isEmpty());//false
        map.clear(); // sildik
        System.out.println("map.size() = "+map.size()); //0
        System.out.println("map.isEmpty() = " + map.isEmpty()); //true



    }
}
