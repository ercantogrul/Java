package asya_hoca_.Projects.Okul;

public class OgrenciKisiler {

    private int kimlikNo;
    private String adSoyad;
    private String yas;
    private String numara;
    private String sinif;

    public OgrenciKisiler() {
    }

    public OgrenciKisiler(int kimlikNo, String adSoyad, String yas, String numara, String sinif) {
        this.kimlikNo = kimlikNo;
        this.adSoyad = adSoyad;
        this.yas = yas;
        this.numara = numara;
        this.sinif = sinif;
    }

    public int getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(int kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "OgrenciKisiler{" +
                "kimlikNo=" + kimlikNo +
                ", adSoyad='" + adSoyad + '\'' +
                ", yas='" + yas + '\'' +
                ", numara='" + numara + '\'' +
                ", sinif='" + sinif + '\'' +
                '}';
    }
}
