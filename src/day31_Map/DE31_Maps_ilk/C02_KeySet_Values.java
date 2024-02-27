package day31_Map.DE31_Maps_ilk;

import java.util.HashMap;
import java.util.Map;

public class C02_KeySet_Values {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Germany","Berlin");
        map.put("Holand","Amsterdam");
        map.put("Belgium","Brussels");
        map.put("Ranska","Paris");

        System.out.println(map.keySet());  //[Ranska, Belgium, Holand, Germany]
        System.out.println(map.values());  //[Paris, Brussels, Amsterdam, Berlin]
        System.out.println();

        for (String key : map.keySet()){
            //System.out.println(key+" "+map.get(key));
            System.out.printf("%-10s%-10s\n",key,map.get(key));
        }
        System.out.println();

        for (String val:map.values()) {

            System.out.println(val);
        }
        System.out.println("=====================");
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("Holand"));



    }
}
