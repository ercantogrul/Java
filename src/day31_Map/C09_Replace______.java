package day31_Map;

import java.util.HashMap;

public class C09_Replace______ {
    public static void main(String[] args) {

        HashMap<String,String> hm = new HashMap<>(); // bos hm tanimlandi
        hm.put("Amazon","296 Euro");
        hm.put("Saturn","200 Euro");
        hm.put("Apple","111 Euro");
        hm.put("Teknosa","333 Euro");
        hm.put("Media Markt","444 Euro");


        // key varsa value yu degistirir ve eski value yu verir
        //key yoksa bir is yapmaz value yu degistirmez ve yeni value yu verir
        System.out.println(hm.replace("Amazon", "300 Euro"));  // altValue veriyor 296 Euro
        System.out.println(hm.replace("Amazon", "300 Euro"));   // yeni value verir 300 Euro

        for (String key:hm.keySet()  ) {
            System.out.println(key+" "+hm.get(key)); //Amazon 300 Euro
        }
        //Apple 111 Euro
        //Saturn 200 Euro
        //Teknosa 333 Euro
        //Media Markt 444 Euro
        //Amazon 300 Euro        //key oldugu icin Set deki Amazon key Value(degeri ) degisti 300 Euro oldu



    }
}
