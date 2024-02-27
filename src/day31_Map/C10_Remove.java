package day31_Map;

import java.util.HashMap;

public class C10_Remove {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>(); // bos hm tanimlandi
        hm.put("Amazon","296 Euro");
        hm.put("Saturn","200 Euro");
        hm.put("Apple","111 Euro");
        hm.put("Teknosa","333 Euro");
        hm.put("Meknosa","333 Euro");
        hm.put("Media Markt","444 Euro");

        System.out.println(hm.remove("Saturn"));  // key varsa sil----Saturn silindi
        //alttakiler hem key hemde value eslesirse sil
        System.out.println(hm.remove("Teknosa","300 Euro"));  // iki kosulda saglamadigi icin // false
        System.out.println(hm.remove("Teknosa","333 Euro"));  // iki kosulda sagladi //true  teknosa silindi

        for (String key:hm.keySet()  ) {
            System.out.println(key+" "+hm.get(key)); //Amazon 300 Euro
        }





    }
}
