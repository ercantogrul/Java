package day31_Map.DE31_Maps_ilk;

import java.util.HashMap;
import java.util.Map;

public class C03_Get {
    public static void main(String[] args) {

      //mapismi.get(key) : Girilen key map’de varsa, o key’e ait value’yu, girilen key map’de yoksa null döndürür.

        Map<String,String> map = new HashMap<>();
        map.put("Germany","Berlin");
        map.put("Holand","Amsterdam");
        map.put("Belgium","Brussels");
        map.put("Ranska","Paris");

        System.out.println(map.get("Holand")); //Amsterdam
        System.out.println(map.get("Turkiye"));//null

    }
}
