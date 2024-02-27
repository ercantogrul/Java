package day31_Map.DE31_Maps_ilk;

import java.util.HashMap;
import java.util.Map;

public class C01_Map_put {
    /*  Map bir interface'dir. Map interface'inin 3 tane child class'i vardir

       1) HashMap: HashMap key-value yapisini kullanir. Key ve value   programci tarafindan yazilir.
                   *Key değeri benzersiz(unique) olmalı       dublicate kabul etnez
                   *Key ve value'da null degeri kullanilabilir. Key'de  1'den fazla null degeri kullanilirsa Java son kullanilan
                   null'i kabul eder. Value'da 1'den fazla null degeri kullanilabilir.
                   *HashMap console'a yazdirildiginda hem key degerleri hem de value degerleri aralarina = sembolu konularak yazdirilir
                   *HashMap'ler tanımlanırken rastgele siralama yapar
                   *HasMap map'ler arasinda en hizlisidir.
                   *HashMap'ler "thread safe" degildir.
 //mapismi.put(key,value) : istenen key ve value'ye sahip elementi map'e ekler
 //Eger eklenen key daha onceden map’de varsa, o key’e ait value yeni eklenen value olarak update edilir.
 //mapismi.putIfAbsent(key, value) : Eklenmek istenen key ve value map’de daha onceden mevcut ise ekleme yapmaz, map’de yoksa ekleme yapabilir.
        */
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Germany","Berlin");
        map.put("Holand","Amsterdam");
        map.put("Belgium","Brussels");
        map.put("Ranska","Paris");
        map.put("Ranska","PPPPP");
        System.out.println(map);  //{Ranska=PPPPP, Belgium=Brussels, Holand=Amsterdam, Germany=Berlin}

        String str = map.put("Holand","Amsterdam"); // map e ;(Holand)-key ve (Amsterdam) value ye sahip olan paris isimli elemant ekleniyor ve str ye aktariliyor
        System.out.println(str); //Paris
//
        System.out.println(map.size());  //4
        System.out.println(map.get("Germany")); //Berlin

    }
}
