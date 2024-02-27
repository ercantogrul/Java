package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T06_siniftaki_ogrencilerin_DOGUM_GUNLER {
    public static void main(String[] args) {
        // Bir string dizisinde 20 kişilik bir sınıfın doüum günleri (""pazartesi", "salı" ...
        // her bir günde doğan kaç kişi vardır yazdırınız

        // 5. soru ile ayni

        birinciyontem();
        ikinciyontem();


    }

    private static void ikinciyontem() {
        String[] dogumGunleri = {"Pazartesi", "Cuma", "Sali", "Cuma", "Sali", "Sali", "Cuma",
                "Çarşamba", "Pazartesi", "Cuma", "Pazartesi", "Cuma", "Çarşamba", "Cuma",
                "Sali", "Çarşamba", "Cuma", "Sali", "Cuma", "Sali"};

        List<String> list = Arrays.asList(dogumGunleri);
        System.out.println("list = " + list);

        for (int i = 0; i < list.size(); i++) {
            int count = 1;// kendisini de dahil etmeliyiz
            // Aynı günü bir daha işleme almamak için kontrol ekle
            if (!list.get(i).equals("x")) {
                for (int j = i+1; j < list.size(); j++) {
                    if (list.get(i).equals(list.get(j))) {
                        count++;

                        list.set(j, "x"); // Ayni satira bir daha bakmamasi icin x ile isaretledik
                    }
                }
                System.out.println(dogumGunleri[i] + " günü doğan " + count + " öğrenci vardır");
            }
        }
    }

    private static void birinciyontem() {

        ArrayList<String> dogumGunleri = new ArrayList<>(Arrays.asList("Pazartesi", "Cuma",
                "Salı", "Cuma", "Salı", "Salı", "Cuma", "Çarşamba", "Pazartesi", "Cuma", "Pazartesi",
                "Cuma", "Çarşamba", "Cuma", "Salı", "Çarşamba", "Cuma", "Salı", "Cuma"));
        int pazartesi=0,sali=0,carsamba=0,persembe=0,cuma=0,cumartesi=0,pazar=0;

        for (int i = 0; i <dogumGunleri.size() ; i++) {
            switch (dogumGunleri.get(i).toLowerCase()) {
                case "pazartesi": pazartesi++;  break;
                case "salı"     : sali++;       break;
                case "çarşamba" : carsamba++;   break;
                case "perşembe" : persembe++;   break;
                case "cuma"     : cuma++;       break;
                case "cumartesi": cumartesi++;  break;
                case "pazar"    : pazar++;      break;
            }
        }
        System.out.println("pazartesi   = " + pazartesi);
        System.out.println("sali        = " + sali);
        System.out.println("carsamba    = " + carsamba);
        System.out.println("persembe    = " + persembe);
        System.out.println("cuma        = " + cuma);
        System.out.println("cumartesi   = " + cumartesi);
        System.out.println("pazar       = " + pazar);


    }
}
