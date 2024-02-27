package day20_Constructor.Okul_ic_ice;

public class Ogrenci {
    Kisi kimlik;
    String oNo;

    public Ogrenci() {
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "kimlik=" + kimlik +
                ", oNo='" + oNo + '\'' +
                '}';
    }

    public Ogrenci(Kisi kimlik, String oNo) {
        this.kimlik = kimlik;
        this.oNo = oNo;
    }
}
