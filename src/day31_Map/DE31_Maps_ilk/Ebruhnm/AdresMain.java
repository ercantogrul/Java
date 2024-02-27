package day31_Map.DE31_Maps_ilk.Ebruhnm;

import java.util.HashMap;
import java.util.Map;

public class AdresMain {
    static int id =1;
    public static void main(String[] args) {
        Map<Integer,AdresMap> hMap=new HashMap<>();
        AdresMap adr =new AdresMap("a mah","a cad",id++);
        hMap.put(adr.getId(),adr);
        adr=new AdresMap(" b mah","b cad",id++);
        hMap.put(adr.getId(), adr);
        adr=new AdresMap("c mah","c cad",id++);
        hMap.put(adr.getId(), adr);
        for (Map.Entry<Integer,AdresMap> val : hMap.entrySet()) {
            System.out.println(val.getKey()+" "+val.getValue());
        }
        int dKey=2;
        adr=new AdresMap();
        adr=hMap.get(dKey);
        adr.setCadde("YENI CADDE");
        hMap.put(dKey,adr);
        System.out.println();
        for (Map.Entry<Integer,AdresMap> val1:hMap.entrySet()) {
            System.out.println(val1.getKey()+" "+val1.getValue());
        }
    }
}