package day33_ProjeTanimi.Proje_1;

public class Adres {
    private int ID;
    private String adSoyad;
    private long tel;
    private String adres;
    private String eMail;
    private boolean statu;// true ise kayıt aktiftir, false ise silinmiş demektir

    public Adres(int ID,String adSoyad, long tel, String adres, String eMail, boolean statu) {
        this.ID =ID;
        this.adSoyad = adSoyad;
        this.tel   = tel;
        this.adres = adres;
        this.eMail = eMail;
        this.statu = statu;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }
    public void setTel(long tel) {
        this.tel = tel;
    }
    public void setAdres(String adres) {
        this.adres = adres;
    }
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    public void setStatu(boolean statu) {
        this.statu = statu;
    }

    public Adres(int ID) {
        this.ID = ID;
    }
    public  int getID() {
        return ID;
    }
    public String getAdSoyad() {
        return adSoyad;
    }
    public long getTel() {
        return tel;
    }
    public String getAdres() {
        return adres;
    }
    public String geteMail() {
        return eMail;
    }
    public boolean isStatu() {
        return statu;
    }

    @Override
    public String toString() {
        String line = String.format("%5s"," ");
        line  = line + String.format("%7s",ID);
        line  = line + String.format("%25s",adSoyad);
        line  = line + String.format("%25s",tel);
        line  = line + String.format("%25s",eMail);
        line  = line + String.format("%35s",adres);

        return line;
    }
}
