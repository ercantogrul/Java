package day31_Map;

import java.util.HashMap;
import java.util.Map;

public class C07_ContainsKey_ContainsValue {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Germany", "Berlin");
        map.put("Hollanda", "Amsterdam");
        map.put("Belqium", "Brussels");
        map.put("Ranska", "Paris");
        map.put("Fransa", "Paris");
        map.put("Misir", "Kahire");

        if (!map.containsKey("Germany")) map.put("Germany", "Bonn");
        System.out.println(map);

        if (!map.containsValue(null)) System.out.println("null degeri vardir");


        //value den key lere ulasmak icin
        String value = "Paris";
        for (String key: map.keySet()) {
            if (map.get(key).equals(value)) System.out.println(key);

        }
    }
}
