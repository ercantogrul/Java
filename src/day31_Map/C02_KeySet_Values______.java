package day31_Map;

import java.util.HashMap;
import java.util.Map;

public class C02_KeySet_Values______ {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("Germany", "Berlin");
        map.put("Hollanda", "Amsterdam");
        map.put("Belqium", "Brussels");
        map.put("Ranska", "Pariisi");
        System.out.println(map.keySet());  // rasgele yazar  [Hollanda, Belqium, Ranska, Germany]
        System.out.println(map.values());  //[Amsterdam, Brussels, Pariisi, Berlin]
        System.out.println("================");

        for (String key: map.keySet()) {
            //System.out.println(key+" "+map.get(key));
            System.out.printf("%-10s%-10s\n",key,map.get(key));

        }
        System.out.println("_______________");
        for (String val: map.values()) {
            System.out.println(val);
        }
        System.out.println("::::::::::::::");
        for (String val: map.values()) {
        }System.out.println(map);




    }
}
