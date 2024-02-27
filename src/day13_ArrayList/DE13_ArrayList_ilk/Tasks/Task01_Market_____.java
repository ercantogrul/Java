package day13_ArrayList.DE13_ArrayList_ilk.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task01_Market_____ {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */

    static ArrayList<String> gunler = new ArrayList<>(Arrays.asList("p.tesi", "salı", "carşamba", "perşembe", "cuma", "c.tesi", "pazar"));//1. adım
    static ArrayList<Double> gunlukKazanclar = new ArrayList<>();//2.adım
    static Scanner sc = new Scanner(System.in);
    static double haftaCirosu = 0;

    public static void main(String[] args) {

        gunlukKazanclar(gunlukKazanclar, gunler);
        yedigunlukKazanc(gunlukKazanclar, gunler);
        int ortalamaKazanc = getOrtalamaKazanc(gunlukKazanclar);
        System.out.println("ortalamaKazanc = " + ortalamaKazanc);
        getOrtalamaninUstundeKazancGunleri(gunlukKazanclar, gunler, ortalamaKazanc);
        getOrtalamaninAltindaKazancGunleri(gunlukKazanclar, ortalamaKazanc);


    }

    private static void getOrtalamaninAltindaKazancGunleri(ArrayList<Double> gunlukKazanclar, int ortalamaKazanc) {
        ArrayList<String> gunler = new ArrayList<>(Arrays.asList("p.tesi", "salı", "carşamba", "perşembe", "cuma", "c.tesi", "pazar"));
        for (int i = 0,j=0; i < gunlukKazanclar.size(); i++,j++) {
            if (gunlukKazanclar.get(i)> ortalamaKazanc ) {
                gunler.remove(gunler.get(j));
                j--;
            }
        }
        System.out.println("getOrtalamaninAltindaKazancGunleri:::: : " + gunler);
    }

    private static void getOrtalamaninUstundeKazancGunleri(ArrayList<Double> gunlukKazanclar, ArrayList<String> gunler, int ortalamaKazanc) {
        for (int i = 0,j=0; i < gunlukKazanclar.size(); i++, j++) {
            if (gunlukKazanclar.get(i)< ortalamaKazanc  ) {
                gunler.remove(gunler.get(j));
                j--;

            }
        }
        System.out.println("getOrtalamaninUstundeKazancGunleri___ : " + gunler);
    }

    private static int getOrtalamaKazanc(ArrayList<Double> gunlukKazanclar) {
        double haftalikToplamKazanc = 0;
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            haftalikToplamKazanc += gunlukKazanclar.get(i);
        }
        int ortalamaKazanc = (int) (haftalikToplamKazanc / 7);
        return ortalamaKazanc;
    }
    private static void yedigunlukKazanc(ArrayList<Double> gunlukKazanclar, ArrayList<String> gunler) {
        double haftalikToplamKazanc = 0;
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            haftalikToplamKazanc += gunlukKazanclar.get(i);
        }
        System.out.println("haftalikToplamKazanc : " + haftalikToplamKazanc);
    }
    private static void gunlukKazanclar(ArrayList<Double> gunlukKazanclar, ArrayList<String> gunler) {
        int i = 0;
        while (i < 7) {
            System.out.println(gunler.get(i) + "günü kazanci giriniz");
            Scanner scan = new Scanner(System.in);
            int kazanc = (int) (Math.random() * 400 + 100);
            gunlukKazanclar.add(i, (double) kazanc);
            i++;
        }
        System.out.println(gunlukKazanclar);


    }


}
