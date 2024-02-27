package day33_ProjeTanimi.Yeni_Proje;

public class Hizmetler {
    private int satisID;
    private int musteriID;
    private String tarih;
    private String islem;
    private int tutar;
    private int tahsilat;
    private boolean durum;

    public Hizmetler(int satisID, int musteriID, String tarih, String islem, int tutar, int tahsilat, boolean durum) {
        this.satisID = satisID;
        this.musteriID = musteriID;
        this.tarih = tarih;
        this.islem = islem;
        this.tutar = tutar;
        this.tahsilat = tahsilat;
        this.durum = durum;
    }

    public int getSatisID() {
        return satisID;
    }

    public void setSatisID(int satisID) {
        this.satisID = satisID;
    }

    public int getMusteriID() {
        return musteriID;
    }

    public void setMusteriID(int musteriID) {
        this.musteriID = musteriID;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getIslem() {
        return islem;
    }

    public void setIslem(String islem) {
        this.islem = islem;
    }

    public int getTutar() {
        return tutar;
    }

    public void setTutar(int tutar) {
        this.tutar = tutar;
    }

    public int getTahsilat() {
        return tahsilat;
    }

    public void setTahsilat(int tahsilat) {
        this.tahsilat = tahsilat;
    }

    public boolean isDurum() {
        return durum;
    }

    public void setDurum(boolean durum) {
        this.durum = durum;
    }

    @Override
    public String toString() {
        String line = String.format("%5s", satisID);
        line  = line + String.format("%15s", musteriID);
        line  = line + String.format("%23s",tarih);
        line  = line + String.format("%20s",islem);
        line  = line + String.format("%20s",tutar);
        line  = line + String.format("%20s",tahsilat);
        line  = line + String.format("%20s",durum);

        return line;


    }
}
