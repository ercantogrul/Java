package asya_hoca_.Projects.Kitapci;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BilgiPojo {
    int kitapNo;
    String kitapAdi;
    String yazarAdi;
    double KitapFiyati;
    KitapTurleri tur;

    public BilgiPojo(int kitapNo, String kitapAdi, String yazarAdi, double kitapFiyati, KitapTurleri tur) {
        this.kitapNo = kitapNo;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        KitapFiyati = kitapFiyati;
        this.tur = tur;
    }

    public BilgiPojo() {
    }

    @Override
    public String toString() {
        return "Kitap Adi=" + kitapAdi +
                ", Yazar Adi=" + yazarAdi +
                ", Kitap No=" + kitapNo +
                ", Kitap Fiyati=" + KitapFiyati +
                ", Kitap Turu =" + tur +
                '\n';
    }
}
