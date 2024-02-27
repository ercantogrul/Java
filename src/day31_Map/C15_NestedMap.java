package day31_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C15_NestedMap {
    public static void main(String[] args) {

        HashMap<String,String> il = new HashMap<>();
        HashMap<Integer,HashMap<String,String>> iller = new HashMap<>();

        il.put("isim","Sanliurfa");
        il.put("nufus","1200000");
        il.put("ilce","12");
        il.put("bölge","Güney Dogu");
        iller.put(63,il);

        il = new HashMap<>();
        il.put("isim","Trabzon");
        il.put("nufus","750000");
        il.put("ilce","9");
        il.put("bölge","Karadeniz");
        iller.put(61,il);

        il = new HashMap<>();
        il.put("isim","Izmir");
        il.put("nufus","3900000");
        il.put("ilce","15");
        il.put("bölge","Ege");
        iller.put(35,il);

        System.out.println(iller);
        System.out.println(iller.entrySet());

        for (Map.Entry<Integer,HashMap<String,String>> val : iller.entrySet()){
            //System.out.println(iller.keySet());  //[35, 61, 63] key leri verir
            //System.out.println(iller.values());   // volue verir
            System.out.println(val);
            for (String ilKey:val.getValue().keySet()){
                System.out.println(val.getKey()+"--- "+ilKey+"-- "+val.getValue().get(ilKey));
            }
        }
        System.out.println("ikinci cözüm===============================");
        for (Map.Entry<Integer,HashMap<String,String>> val : iller.entrySet()){
            System.out.println(val);
            for (Map.Entry<String,String> ilVal : val.getValue().entrySet()){
                System.out.println(val.getKey()+" "+ilVal.getKey()+" "+ilVal.getValue());
            }

        }


    }
}
