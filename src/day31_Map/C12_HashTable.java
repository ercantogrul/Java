package day31_Map;

import java.util.HashMap;
import java.util.Hashtable;

public class C12_HashTable {
    public static void main(String[] args) {
        Hashtable<String,String> hm = new Hashtable<>(); // bos hm tanimlandi
        hm.put("Amazon","296 Euro");
        hm.put("Saturn","200 Euro");
        hm.put("Apple","111 Euro");
        hm.put("Teknosa","333 Euro");
        hm.put("Meknosa","333 Euro");
        hm.put("Media Markt","444 Euro");

        System.out.println(hm);

        for (String key:hm.keySet()  ) {
            System.out.println(key+" "+hm.get(key)); //Amazon 300 Euro
        }

    }
}
