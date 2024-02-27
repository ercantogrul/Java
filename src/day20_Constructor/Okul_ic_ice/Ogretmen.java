package day20_Constructor.Okul_ic_ice;

public class Ogretmen {
    Kisi kimlik;
    String brans;

    public Ogretmen() {
    }

    public Ogretmen(Kisi kimlik, String brans) {
        this.kimlik = kimlik;
        this.brans = brans;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "kimlik=" + kimlik +
                ", brans='" + brans + '\'' +
                '}';
    }
}
