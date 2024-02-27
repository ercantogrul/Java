package day31_Map.DE31_Maps_ilk;

import java.util.HashMap;

public class C11_putIfAbsent {
    public static void main(String[] args) {
    //mapismi.putIfAbsent(key, value) : Eklenmek istenen key ve value map’de daha onceden mevcut ise ekleme yapmaz, map’de yoksa ekleme yapabilir.

        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı
        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Meknoso", "333 Euro");
        hm.put("Media Markt", "444 Euro");

        hm.putIfAbsent("A1","999 Euroa"); // yok ise ekler // ekledi
        // yani alttaki işi yapıyor
        if (!hm.containsKey("A1")) hm.put("A1","888 Euroa");
        hm.putIfAbsent("A1","777 Euroa"); //// yok ise ekler // eklemedi

        // put varsa değiştirir ( replace işini yapar) yoksa ekler ( putIfAbsent işini yapar)


        for (String key : hm.keySet()){
            System.out.println(key+", "+ hm.get(key));
        }

    }
}
