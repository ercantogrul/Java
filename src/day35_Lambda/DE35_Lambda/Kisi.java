package day35_Lambda.DE35_Lambda;

enum Cins {
    KADIN,
    ERKEK;
}
public class Kisi {
    private String isim;
    private int yas;
    private Cins cinsiyet;

    public Kisi(String isim, int yas, Cins cinsiyet) {
        this.isim = isim;
        this.yas = yas;
        this.cinsiyet = cinsiyet;
    }

    public String getIsim() {
        return isim;
    }

    public int getYas() {
        return yas;
    }



    @Override
    public String toString() {
        return "Kisi{" +
                "isim='" + isim + '\'' +
                ", yas=" + yas +
                ", cinsiyet=" + cinsiyet +
                '}';
    }
}

