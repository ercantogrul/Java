package day31_Map;

import java.util.HashMap;
import java.util.Map;

public class C01_Map_put {
    public static void main(String[] args) {

        //mapismi.put(key,value) : istenen key ve value'ye sahip elementi map'e ekler
        //Eger eklenen key daha onceden map’de varsa, o key’e ait value yeni eklenen value olarak update edilir.
        //mapismi.putIfAbsent(key, value) : Eklenmek istenen key ve value map’de daha onceden mevcut ise ekleme yapmaz, map’de yoksa ekleme yapabilir.

        Map <String,String> map = new HashMap<>();
        map.put("Germany", "Berlin");
        map.put("Hollanda", "Amsterdam");
        map.put("Belqium", "Brussels");
        map.put("Ranska", "Parisli");

        String str = map.put("Ranska", "Paris"); // map e ;(Ranska)-key ve (Paris) value ye sahip olan paris isimli elemant ekleniyor ve str ye aktariliyor
        System.out.println(str);  //Paris

        for (String val: map.values()) {
            System.out.println(val);
        }

        System.out.println(map.size());  //4
        System.out.println(map.get("Germany")); //Berlin







    }
}
