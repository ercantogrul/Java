package day20_Constructor.DE20_Constructor_ilk.Tasks.PersonetKayit;

public class Adres {
    String cadde;
    int postaKodu;
    String sehir;
    String kapiNo;

    public Adres() {
    }

    public Adres(String cadde, int postaKodu, String sehir, String kapiNo) {
        this.cadde = cadde;
        this.postaKodu = postaKodu;
        this.sehir = sehir;
        this.kapiNo = kapiNo;
    }



    @Override
    public String toString() {
        return "Adres{" +
                "cadde='" + cadde + '\'' +
                ", postaKodu=" + postaKodu +
                ", sehir='" + sehir + '\'' +
                ", kapiNo=" + kapiNo +
                '}';
    }
}
