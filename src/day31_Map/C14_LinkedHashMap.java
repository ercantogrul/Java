package day31_Map;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class C14_LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,String> hm = new LinkedHashMap<>(); // bos hm tanimlandi
        //Girdigimiz siraya göre cikti verir
        hm.put("Amazon","296 Euro");
        hm.put("Saturn","200 Euro");
        hm.put("Apple","111 Euro");
        hm.put("Teknosa","333 Euro");
        hm.put("Meknosa","333 Euro");
        hm.put("Media Markt","444 Euro");

        System.out.println(hm);

        for (String key:hm.keySet()  ) {
            System.out.println(key+" "+hm.get(key)); //Girdigimiz siraya göre cikti verir
        }
    }
}
