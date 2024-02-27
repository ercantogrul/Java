package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_1;

public class T05 {
    public static void main(String[] args) {
        // Bir string dizisinde 20 kişilik bir sınıfın doüum günleri (""pazartesi", "salı" ...
        // her bir günde doğan kaç kişi vardır yazdırınız
        String[] dogumGunleri = {"Pazartesi", "Cuma", "Salı", "Cuma", "Salı", "Salı", "Cuma",
                "Çarşamba", "Pazartesi", "Cuma", "Pazartesi", "Cuma", "Çarşamba", "Cuma",
                "Salı", "Çarşamba", "Cuma", "Salı", "Cuma"};


        PazartesiDoganlarinSayisi(dogumGunleri);
        SaliDoganlarinSayisi(dogumGunleri);
        CarsambaDoganlarinSayisi(dogumGunleri);
        PersembeDoganlarinSayisi(dogumGunleri);
        CumaDoganlarinSayisi(dogumGunleri);
        CumartesiDoganlarinSayisi(dogumGunleri);
        PazarDoganlarinSayisi(dogumGunleri);

    }

    private static void PazarDoganlarinSayisi(String[] dogumGunleri) {
        int counter = 0;
        for (int i = 0; i < dogumGunleri.length; i++) {
            if (dogumGunleri[i].equals("Pazar")) counter++;
        }
        System.out.println("Pazar günü doganlarin sayisi : " + counter);
    }

    private static void CumartesiDoganlarinSayisi(String[] dogumGunleri) {
        int counter = 0;
        for (int i = 0; i < dogumGunleri.length; i++) {
            if (dogumGunleri[i].equals("Cumartesi")) counter++;
        }
        System.out.println("Cumartesi günü doganlarin sayisi : " + counter);
    }

    private static void CumaDoganlarinSayisi(String[] dogumGunleri) {
        int counter = 0;
        for (int i = 0; i < dogumGunleri.length; i++) {
            if (dogumGunleri[i].equals("Cuma")) counter++;
        }
        System.out.println("Cuma günü doganlarin sayisi : " + counter);
    }

    private static void PersembeDoganlarinSayisi(String[] dogumGunleri) {
        int counter = 0;
        for (int i = 0; i < dogumGunleri.length; i++) {
            if (dogumGunleri[i].equals("Persembe")) counter++;
        }
        System.out.println("Persembe günü doganlarin sayisi : " + counter);
    }

    private static void CarsambaDoganlarinSayisi(String[] dogumGunleri) {
        int counter = 0;
        for (int i = 0; i < dogumGunleri.length; i++) {
            if (dogumGunleri[i].equals("Çarşamba")) counter++;
        }
        System.out.println("Çarşamba günü doganlarin sayisi : " + counter);
    }

    private static void SaliDoganlarinSayisi(String[] dogumGunleri) {
        int counter = 0;
        for (int i = 0; i < dogumGunleri.length; i++) {
            if (dogumGunleri[i].equals("Salı")) counter++;
        }
        System.out.println("Sali günü doganlarin sayisi : " + counter);
    }

    private static void PazartesiDoganlarinSayisi(String[] dogumGunleri) {
        int counter = 0;
        for (int i = 0; i < dogumGunleri.length; i++) {
            if (dogumGunleri[i].equals("Pazartesi")) counter++;
        }
        System.out.println("Pazartesi günü doganlarin sayisi : " + counter);
    }





}
