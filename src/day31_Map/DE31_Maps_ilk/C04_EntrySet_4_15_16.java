package day31_Map.DE31_Maps_ilk;

import java.util.HashMap;
import java.util.Map;

public class C04_EntrySet_4_15_16 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Germany","Berlin");
        map.put("Holand","Amsterdam");
        map.put("Belgium","Brussels");
        map.put("Ranska","Paris");
        System.out.println(map); //{Hollanda=Amsterdam, Belqium=Brussels, Ranska=Pariisi, Germany=Berlin}
        System.out.println(map.entrySet());  //[Hollanda=Amsterdam, Belqium=Brussels, Ranska=Pariisi, Germany=Berlin]
        //tüm elemanlari veriyor

        for(Map.Entry<String,String> key_val:map.entrySet() ){ // ("Germany", "Berlin"); ikisini birlikte aliyor
            System.out.println(key_val.getKey()+" --- "+key_val.getValue());
        }
        //Hollanda ---Amsterdam
        //Belqium ---Brussels
        //Ranska ---Pariisi
        //Germany ---Berlin

        System.out.println("============");
        // veya
        for (String key : map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
        System.out.println();
        // veya (bad practice)
        for(Map.Entry<String,String> key_val:map.entrySet() ){
            String key = key_val.getKey();
            System.out.println(key+" "+map.get(key));
        }

    }
}
