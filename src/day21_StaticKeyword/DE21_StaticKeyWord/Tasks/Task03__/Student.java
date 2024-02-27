package day21_StaticKeyword.DE21_StaticKeyWord.Tasks.Task03__;

import java.util.ArrayList;

public class Student {

    String adSoyad;
    int maxCredit;
    ArrayList<Lesson> dersListesi = new ArrayList<>();

    public Student() {
    }

    public Student(String name, int maxCredit) {
        this.adSoyad = name;
        this.maxCredit = maxCredit;
    }
    public int toplamKredisi(){
        int toplamKredisi =0;
        for (Lesson les : dersListesi) {
            toplamKredisi+=les.lessonCredit;

        }
        return toplamKredisi;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + adSoyad + '\'' +
                ", maxCredit=" + maxCredit +
                ", dersListesi=" + dersListesi +
                '}';
    }
}

