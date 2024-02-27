package day31_Map;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

public class C04_EntrySet {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Germany", "Berlin");
        map.put("Hollanda", "Amsterdam");
        map.put("Belqium", "Brussels");
        map.put("Ranska", "Pariisi");
        System.out.println(map); //{Hollanda=Amsterdam, Belqium=Brussels, Ranska=Pariisi, Germany=Berlin}
        System.out.println(map.entrySet());  //[Hollanda=Amsterdam, Belqium=Brussels, Ranska=Pariisi, Germany=Berlin]
        //tüm elemanlari veriyor

        for (Map.Entry<String,String> key_val:map.entrySet()) {  // ("Germany", "Berlin"); ikisini birlikte aliyor
            System.out.println(key_val.getKey()+" --- "+key_val.getValue());
        }
        //Hollanda ---Amsterdam
        //Belqium ---Brussels
        //Ranska ---Pariisi
        //Germany ---Berlin

        System.out.println("________________");
        for (String key: map.keySet()) {
            System.out.println(key+" "+map.get(key));
        }

        System.out.println("======================");
        //veya (bad practice)
        for (Map.Entry<String,String> key_val:map.entrySet()) {  // ("Germany", "Berlin"); ikisini birlikte aliyor
            String key = key_val.getKey();
            System.out.println(key+" "+map.get(key));
        }








    }
}
