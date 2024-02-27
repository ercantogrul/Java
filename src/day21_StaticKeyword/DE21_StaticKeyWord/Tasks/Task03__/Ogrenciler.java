package day21_StaticKeyword.DE21_StaticKeyWord.Tasks.Task03__;

import java.util.ArrayList;

public class Ogrenciler {

    String adSoyad;
    int maxCredit;

    ArrayList<Lesson> dersListesi = new ArrayList<>();
    public int toplamKredisi(){
        int toplamKredisi =0;
        for (Lesson les : dersListesi) {
            toplamKredisi+=les.lessonCredit;

        }
        return toplamKredisi;
    }


    ArrayList<Lesson> ogrencilers = new ArrayList<>();

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
