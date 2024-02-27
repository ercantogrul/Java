package asya_hoca_.Projects.Market;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class yasinHoca {
    public static void main(String[] args) {
        /*     TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları teker teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *            ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *            ortalama kazançtan aşağıysa o günleri return yap.*/

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"));
        ArrayList<Double> gunlukKazanclar = new ArrayList<>();
        for (String gun : gunler) {
            System.out.println(gun + " gununun kazancini giriniz: ");
            double gunlukKazanc = scanner.nextDouble();
            gunlukKazanclar.add(gunlukKazanc);
        }
        System.out.println("Gunluk kazanclariniz : " + gunlukKazanclar);
        double ortalamaKazanc = haftaOrtaKazanc(gunlukKazanclar);
        System.out.println("Haftalik ortalama kazanciniz = " + ortalamaKazanc);
        System.out.println("Ortalamanin ustunde kazanilan gunler: " + ortaUstuGunler(gunler, gunlukKazanclar, ortalamaKazanc));
        System.out.println("Ortalamanin altinda kazanilan gunler: " + ortaAltiGunler(gunler, gunlukKazanclar, ortalamaKazanc));

    }

    private static ArrayList ortaAltiGunler(ArrayList<String> gunler, ArrayList<Double> gunlukKazanclar, double ortalamaKazanc) {
        ArrayList<String> ortalamaAltiGunler = new ArrayList<>();
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) < ortalamaKazanc) {
                ortalamaAltiGunler.add(gunler.get(i));
            }
        }
        return ortalamaAltiGunler;
    }

    private static ArrayList ortaUstuGunler(ArrayList<String> gunler, ArrayList<Double> gunlukKazanclar, double ortalamaKazanc) {
        ArrayList<String> ortalamaUstuGunler = new ArrayList<>();
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) > ortalamaKazanc) {
                ortalamaUstuGunler.add(gunler.get(i));
            }
        }
        return ortalamaUstuGunler;
    }

    private static double haftaOrtaKazanc(ArrayList<Double> gunlukKazanclar) {
        double toplam = 0;
        for (Double kazanc : gunlukKazanclar) {
            toplam += kazanc;
        }
        return toplam / gunlukKazanclar.size();
    }
}

