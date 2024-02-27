package day31_Map;

import java.util.HashMap;
import java.util.Map;

public class C06_PuttAll {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Germany", "Berlin");
        map.put("Hollanda", "Amsterdam");
        map.put("Belqium", "Brussels");
        map.put("Ranska", "Pariisi");
        Map<String,String> map2 = new HashMap<>();
        map2.put("Turkiye",null);
        map2.put("Misir",null);
        map2.put("Suriye","Domescus");
        map2.put("Iran","Tahran");

        map.putAll(map2);
        System.out.println(map);
        for (String key: map.keySet()) {
            System.out.printf("%-10s%-10s\n",key,map.get(key));

        }



    }
}
