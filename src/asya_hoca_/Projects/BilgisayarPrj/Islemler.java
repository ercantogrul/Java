package asya_hoca_.Projects.BilgisayarPrj;

public class Islemler {
    String model;
    int fiyat;
    String Renk;
    String Boyut;
    String Ram;
    int ID;

    public Islemler() {
    }

    public Islemler(String model, int fiyat, String renk, String boyut, String ram, int ID) {
        this.model = model;
        this.fiyat = fiyat;
        this.Renk = renk;
        this.Boyut = boyut;
        this.Ram = ram;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Bilgisayarin Özellikleri : {" +
                "model='" + model + '\'' +
                ", fiyat=" + fiyat +
                ", Renk='" + Renk + '\'' +
                ", Boyut='" + Boyut + '\'' +
                ", Ram='" + Ram + '\'' +
                ", ID=" + ID +
                '}'+"\n";
    }
}
