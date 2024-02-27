package day20_Constructor.DE20_Constructor.Okul;

public class Ogrenci {
    Kisi kimlik;
    String oNo;

    public Ogrenci() {
    }

    public Ogrenci(Kisi kimlik, String oNo) {
        this.kimlik = kimlik;
        this.oNo = oNo;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "kimlik=" + kimlik +
                ", oNo='" + oNo + '\'' +
                '}';
    }
}
