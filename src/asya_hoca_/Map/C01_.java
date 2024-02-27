package asya_hoca_.Map;

import java.util.HashMap;
import java.util.Map;

public class C01_ {
    public static void main(String[] args) {
        Map<String, Integer> muhtesem7 = new HashMap<>();
        muhtesem7.put("Beyza", 13100);
        muhtesem7.put("Raşit", 13000);
        muhtesem7.put("Ebru", 12700);
        muhtesem7.put("Yasin", 13000);
        muhtesem7.put("Nuray", 12600);
        muhtesem7.put("Mahmut", 12900);
        muhtesem7.put("Ercan", 12800);
        System.out.println(muhtesem7);
        System.out.println(muhtesem7.values());
        System.out.println(muhtesem7.keySet());

        Integer enb =muhtesem7.get("Yasin");
        Integer enK =muhtesem7.get("Yasin");

        for (String key: muhtesem7.keySet()) {
            if (muhtesem7.get(key)>enb) {
                enb=muhtesem7.get(key);
            }
            if (muhtesem7.get(key)<enK) {
                enK=muhtesem7.get(key);
            }
        }
        System.out.println("enb = " + enb);
        System.out.println("enK = " + enK);


    }
}
