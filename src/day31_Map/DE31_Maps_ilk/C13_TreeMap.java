package day31_Map.DE31_Maps_ilk;

import java.util.TreeMap;

public class C13_TreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> hm = new TreeMap<>();//bos hm tanımlandı
        //Alfabetik siraya göre cikti verir
        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "");
        System.out.println(hm);

        for (String key : hm.keySet()){
            System.out.println(key+", "+ hm.get(key));
        }

    }
}
