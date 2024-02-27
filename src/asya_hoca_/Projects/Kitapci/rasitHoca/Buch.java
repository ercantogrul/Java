package asya_hoca_.Projects.Kitapci.rasitHoca;

public class Buch {
    String buchName;
    String autorName;
    double preis;
    int buchNummer;
    static boolean STATUS;
    BuchArt buchArt;

    public Buch() {
    }

    public String getBuchName() {
        return buchName;
    }

    public void setBuchName(String buchName) {
        this.buchName = buchName;
    }

    public String getAutorName() {
        return autorName;
    }

    public void setAutorName(String autorName) {
        this.autorName = autorName;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getBuchNummer() {
        return buchNummer;
    }

    public void setBuchNummer(int buchNummer) {
        this.buchNummer = buchNummer;
    }

    public static boolean isSTATUS() {
        return STATUS;
    }

    public static void setSTATUS(boolean STATUS) {
        Buch.STATUS = STATUS;
    }

    public BuchArt getBuchArt() {
        return buchArt;
    }

    public void setBuchArt(BuchArt buchArt) {
        this.buchArt = buchArt;
    }

    public Buch(String buchName, String autorName, double preis, int buchNummer, BuchArt buchArt) {
        this.buchName = buchName;
        this.autorName = autorName;
        this.preis = preis;
        this.buchNummer = buchNummer;
        this.buchArt = buchArt;
    }

    @Override
    public String toString() {
        return "Buch{" +
                "buchName='" + buchName + '\'' +
                ", autorName='" + autorName + '\'' +
                ", preis=" + preis +
                ", buchNummer=" + buchNummer +
                ", buchArt=" + buchArt +
                '}';
    }
}
