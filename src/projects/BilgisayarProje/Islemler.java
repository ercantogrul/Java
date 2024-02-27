package projects.BilgisayarProje;

public class Islemler {
    String model;
    int fiyat;
    String Renk;
    String Boyut;
    String Ram;
    int ID;

    public Islemler() {
    }

    @Override
    public String toString() {
        return
                "Model=" + model +
                ", Fiyat=" + fiyat +
                ", Renk=" + Renk +
                ", Boyut=" + Boyut +
                ", Ram=" + Ram +
                ", ID=" + ID +" \n "
                ;
    }

    public Islemler(String model, int fiyat, String renk, String boyut, String ram, int ID) {
        this.model = model;
        this.fiyat = fiyat;
        Renk = renk;
        Boyut = boyut;
        Ram = ram;
        this.ID = ID;
    }



}
