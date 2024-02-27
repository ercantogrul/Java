package day21_StaticKeyword.DE21_StaticKeyWord.Tasks.Task03;

import java.util.ArrayList;

public class Ogrenciler {

    String adSoyad;
    int maxCredit;



    ArrayList<Student> ogrencilers = new ArrayList<>();

    public Ogrenciler() {
    }


    public Ogrenciler(String adSoyad, int maxCredi) {
        this.adSoyad = adSoyad;
        this.maxCredit = maxCredi;
    }

    @Override
    public String toString() {
        return "Ogrenciler{" +
                "adSoyad='" + adSoyad + '\'' +
                ", maxCredi=" + maxCredit +
                ", ogrencilers=" + ogrencilers +
                '}';
    }
}
