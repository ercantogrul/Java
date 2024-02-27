package asya_hoca_.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class C01_Maas_max_min_ve_arttirma {
    public static void main(String[] args) {
        Map<String, Integer> muhtesem7 = new HashMap<>();
        muhtesem7.put("Beyza", 13100);
        muhtesem7.put("Raşit", 13000);
        muhtesem7.put("Ebru", 12700);
        muhtesem7.put("Yasin", 13000);
        muhtesem7.put("Nuray", 12600);
        muhtesem7.put("Mahmut", 12900);
        muhtesem7.put("Ercan", 12800);
        System.out.println(muhtesem7.values()); // return type Collection
        System.out.println(muhtesem7.keySet()); // return type Set unique

        int max = Collections.max(muhtesem7.values());
        System.out.println(max);

        int maximum = muhtesem7.get("Beyza");
        int minimum = muhtesem7.get("Beyza");
        for (Integer value : muhtesem7.values()) { /// en yüksek ve en düsük maas hesaplama
            if (maximum < value) {
                maximum = value;
            }
            if (minimum > value) {
                minimum = value;
            }
        }
        System.out.println("maximum = " + maximum);
        System.out.println("minimum = " + minimum);

        System.out.println("========kim en az maasi aliyor====ve==kim en cok maasi aliyor=================");
        int counter = 0;
        for (Map.Entry<String, Integer> entry : muhtesem7.entrySet()) {
            //System.out.println("entry = " + entry);
            if (entry.getValue() == maximum) {
                System.out.println(entry.getKey() + " 'nin aldigi maas " + entry.getValue() + " maximumdur");
            }
            if (entry.getValue() == minimum) {
                System.out.println(entry.getKey() + " 'nin aldigi maas " + entry.getValue() + " minimumdur");
            }
            if (entry.getValue() > 12700) {
                counter++;
            }

        }
        System.out.println("12700' den fazla maas alanlarin sayisi : " + counter);

        System.out.println("==============herkesin maasina 500 euro ekliyoruz=====================");
        //herkesin maasina 500 euro ekliyoruz
        for (Map.Entry<String, Integer> entry : muhtesem7.entrySet()) {
            //System.out.println(entry.getKey() + " " + muhtesem7.put(entry.getKey(), (entry.getValue() + 500)));
            muhtesem7.put(entry.getKey(), (entry.getValue() + 500)); // maasi  artirdik
            System.out.println(entry.getKey()+" 'nin Yeni maasi "+entry.getValue());

        }
        System.out.println(muhtesem7);
    }
}