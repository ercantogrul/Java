package day31_Map;

import java.util.HashMap;
import java.util.Map;

public class C08_GetOrDefoult {
    public static void main(String[] args) {

        HashMap<String,String> hm = new HashMap<>();
        hm.put("Amazon","296 Euro");
        hm.put("Saturn","200 Euro");
        hm.put("Apple","111 Euro");
        hm.put("Teknosa","333 Euro");
        hm.put("Media Markt","444 Euro");
        System.out.println(hm.getOrDefault("Amazon", "500 Euro"));//296 Euro
        System.out.println(hm.getOrDefault("amazon", "500 Euro")); //500 Euro
        // eger key, map icerisinde varsa o key e ait value alir. yok ise
       // sizin verdiginiz default degeri alir


    }
}
