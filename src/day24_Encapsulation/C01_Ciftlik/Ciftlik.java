package day24_Encapsulation.C01_Ciftlik;

public class Ciftlik {
    private String hayvaninCinsi;
    private int yasi;
    private int ayakSayisi;

    public Ciftlik() {
    }
    public Ciftlik(String hayvaninCinsi, int yasi, int ayakSayisi) {
        this.hayvaninCinsi = hayvaninCinsi;
        this.yasi = yasi;
        setAyakSayisi(ayakSayisi);
    }
    @Override
    public String toString() {
        return "Ciftlik{" +
                "hayvaninCinsi='" + hayvaninCinsi + '\'' +
                ", yasi=" + yasi +
                ", ayakSayisi=" + ayakSayisi +
                '}';
    }
    public String getHayvaninCinsi() {
        return hayvaninCinsi;
    }
    public void setHayvaninCinsi(String hayvaninCinsi) {
        this.hayvaninCinsi = hayvaninCinsi;
    }
    public int getYasi() {
        return yasi;
    }
    public void setYasi(int yasi) {
        this.yasi = yasi;
    }
    public int getAyakSayisi() {
        return ayakSayisi;
    }
    public void setAyakSayisi(int ayakSayisi) {
        if (!(ayakSayisi==2 || ayakSayisi==4)){
            System.out.println("hatali giris yaptiniz");
        }
        this.ayakSayisi = ayakSayisi;

    }


}

