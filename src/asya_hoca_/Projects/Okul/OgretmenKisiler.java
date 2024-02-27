package asya_hoca_.Projects.Okul;

public class OgretmenKisiler {
    private int kimlikNo;
    private String adSoyad;
    private String yas;
    private String bolum;
    private String sicilNo;

    public OgretmenKisiler() {
    }

    public OgretmenKisiler(int kimlikNo, String adSoyad, String yas, String bolum, String sicilNo) {
        this.kimlikNo = kimlikNo;
        this.adSoyad = adSoyad;
        this.yas = yas;
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public int getKimlikNo() {
        return kimlikNo;
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

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "Kisiler{" +
                "kimlikNo=" + kimlikNo +
                ", adSoyad='" + adSoyad + '\'' +
                ", yas='" + yas + '\'' +
                ", bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                '}';
    }
}
