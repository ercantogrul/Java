package day31_Map.DE31_Maps_ilk;

import java.util.HashMap;
import java.util.Map;

public class C06_ContainsKey_ContainsValue {
    public static void main(String[] args) {

     //mapismi.containsKey(key) : istenen key map’de varsa true, yoksa false döndürür.
     //mapismi.containsValue(value) : istenen value map’de varsa true, yoksa false döndürür.

        Map<String, String> map1 = new HashMap<>();

        map1.put("Germany", "Berlin");
        map1.put("Holand", "Amsterdam");
        map1.put("Belgium", "Brussels");
        map1.put("Ranska", "Paris");
        map1.put("Fransa", "Paris");
        map1.put("Misir", "Kahire");

        if (!map1.containsKey("Germany")) map1.put("Germany","Bonn"); // Germany yok ise "Germany","Bonn") ekle.. oldugu icin eklemiyor
        System.out.println(map1);

        if (map1.containsKey("Belgium")){
            System.out.println(map1);
        }
        if (map1.containsKey("Germany")) map1.put("Germany","Bonn"); // Germany var ise ise "Germany","Bonn") ekle.. ekledi
        System.out.println(map1);

        if (map1.containsValue(null)) System.out.println("null değer vardır");
        // value den key lere ulaşmak istersek (pek kullanılacak bir durum değil)
        String value = "Paris";
        for (String key : map1.keySet()) {
            if (map1.get(key).equals(value)) System.out.println(key);
        }

    }
}
