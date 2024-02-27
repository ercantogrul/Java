package day31_Map.DE31_Maps;

import java.util.HashMap;
import java.util.Map;

public class C03_Get {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Germany","Berlin");
        map.put("Holand","Amsterdam");
        map.put("Belgium","Brussels");
        map.put("Ranska","Paris");

        System.out.println(map.get("Holand"));

    }
}
