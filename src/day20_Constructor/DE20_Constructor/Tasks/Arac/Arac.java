package day20_Constructor.DE20_Constructor.Tasks.Arac;

public class Arac {
    String marka;
    String model;
    int yas;
    int km;
    int fiyat;

    public Arac() {
    }

    public Arac(String marka, String model, int yas, int km, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yas = yas;
        this.km = km;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yas=" + yas +
                ", km=" + km +
                ", fiyat=" + fiyat;
    }
}
