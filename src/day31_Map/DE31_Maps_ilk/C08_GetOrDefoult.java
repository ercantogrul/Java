package day31_Map.DE31_Maps_ilk;

import java.util.HashMap;

public class C08_GetOrDefoult {
    public static void main(String[] args) {

    //mapismi.getOrDefault(key, defaultValue) : Girilen key map’de yoksa null degil belirledigimiz
    // bir deger(ornegin 0) döndürmesini istiyorsak bu method kullanilir.

        HashMap<String, String> hm = new HashMap<>();

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");
        System.out.println(hm.getOrDefault("Amazon","500 Euro")); // 296 Euro
        System.out.println(hm.getOrDefault("amazon","500 Euro")); // 500 Euro
        // eğer key , map içerisinde varsa o key e ait value alır, yok ise
       // sizin verdiğiniz default değeri alır

    }
}
