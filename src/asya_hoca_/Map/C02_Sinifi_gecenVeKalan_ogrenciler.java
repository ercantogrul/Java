package asya_hoca_.Map;

import java.util.HashMap;
import java.util.Map;

public class C02_Sinifi_gecenVeKalan_ogrenciler {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 90);
        students.put("Ali",25);
        students.put("Alex",40);
        students.put("Ozan",99);
        students.put("Serkan",30);
        students.put("Andriy",98);

        // 50 ve üzeri not alanlar sınıfı geçmiştir.
        //Geçenleri ve kalanları ayrı bir map üzerinde yazdırınız...
        Map<String, Integer> sGecenOgrenciler = new HashMap<>();
        Map<String, Integer> sKalanOgrenciler = new HashMap<>();

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            if (entry.getValue()>=50){
                System.out.println(entry.getKey()+" ---- "+entry.getValue()+" sinifi gectiniz");
                sGecenOgrenciler.put(entry.getKey(), entry.getValue());

            }else {
                System.out.println(entry.getKey()+" ----  "+entry.getValue()+" sinifi gecemediniz");
                sKalanOgrenciler.put(entry.getKey(), entry.getValue());
            }

        }
        System.out.println("sGecenOgrenciler = " + sGecenOgrenciler);
        System.out.println("sKalanOgrenciler = " + sKalanOgrenciler);


    }
}
