package day31_Map;

import java.util.HashMap;

public class C11_putIfAbsent___ {
    public static void main(String[] args) {

    //mapismi.putIfAbsent(key, value) : Eklenmek istenen key ve value map’de daha onceden mevcut ise ekleme yapmaz, map’de yoksa ekleme yapabilir.

        HashMap<String,String> hm = new HashMap<>(); // bos hm tanimlandi
        hm.put("Amazon","296 Euro");
        hm.put("Saturn","200 Euro");
        hm.put("Apple","111 Euro");
        hm.put("Teknosa","333 Euro");
        hm.put("Meknosa","333 Euro");
        hm.put("Media Markt","444 Euro");

        hm.putIfAbsent("Amazon", "999 Euro");  //bu key yoksa ekler.// key var eklemedi
        hm.putIfAbsent("imazon", "999 Euro");  //bu key yoksa ekler //ekledi
        // yani alttaki isi yapiyor
        if (!hm.containsKey("Amazon")) hm.put("Amazon", "999 Euro");  //key var eklemedi
        if (!hm.containsKey("Zmazon")) hm.put("Zmazon", "999 Euro");  //ekledi
        if (!hm.containsKey("imazon")) hm.put("imazon", "888 Euro");  //key var eklemedi

        // put varsa değiştirir ( replace işini yapar) yoksa ekler ( putIfAbsent işini yapar)

        for (String key:hm.keySet()  ) {
            System.out.println(key+" "+hm.get(key)); //Amazon 300 Euro
        }


    }
}
