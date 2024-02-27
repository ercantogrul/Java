package day20_Constructor.DE20_Constructor_ilk.Tasks.PersonetKayit;

public class Person {
    String adSoyad;
    int dogumYili;
    Adres adres;

    public Person() {
    }

    public Person(String adSoyad, int dogumYili, Adres adres) {
        this.adSoyad = adSoyad;
        this.dogumYili = dogumYili;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Person{" +
                "adSoyad='" + adSoyad + '\'' +
                ", dogumYili=" + dogumYili +
                ", adres=" + adres +
                '}';
    }
}
