package day31_Map.DE31_Maps_ilk;

import java.util.HashMap;

public class C09_Replace {
    //map.replace();-> girilen  value değeri ilgili Key'de update edilip
    // oldValue(update öncesi eski value) return edilir.
    public static void main(String[] args) {
      //***********
      //mapismi.replace(key,yeniDeger) : istenen key’in degerini update edip, eski degerini döndürür.

        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı
        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");
        // key varsa value yu değiştirir ve eski value yu dönderir,
        // key yok ise, bi iş yapmaz null dönderir
        System.out.println(hm.replace("Amazon", "300 Euro"));  // key varsa value yu değiştirir ve eski value yu dönderir,
        System.out.println(hm.replace("amazon", "500 Euro"));  // key yok ise, bi iş yapmaz null dönderir

        for (String key : hm.keySet()){
            System.out.println(key+", "+ hm.get(key));
        }
        //Apple, 450 Euro
        //Saturn, 200 Euro
        //Teknosa, 333 Euro
        //Media Markt, 444 Euro
        //Amazon, 300 Euro   // amazon un value degeri 300 oldu
        //Vatan, 111 Euro

        //************//
        //mapismi.replace(key, eskiDeger, yeniDeger) : istenen key’in eski degeri yazdigimiz gibi ise update edip, true döndürür.
        //Eski value yazdigimizdan farkli ise islem yapmaz ve false döndürür.
        System.out.println(hm.replace("Vatan", "111 Euro", "222 Euro"));  //true
        for (String key: hm.keySet()) {
            System.out.println(key+", "+hm.get(key));
        }
        //Apple, 450 Euro
        //Saturn, 200 Euro
        //Teknosa, 333 Euro
        //Media Markt, 444 Euro
        //Amazon, 300 Euro
        //Vatan, 222 Euro // Vatan in value degeri 222 oldu

    }
}
