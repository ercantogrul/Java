package day20_Constructor.DE20_Constructor_ilk.Tasks.Arac;

public class Arac {
    /*
    field ları , marka,model,yas,km,fiyatı den olucan bir arac clası olustur
    sonra
    bir array liste bu arac class verilerinden cok sayıda ekleyin(en az 10 veri olsun)
    bu veriler , ikinic el arac satan bir galeriye aittir,
    gelen müşteriye istediği özllikleri sorsun ve bu özelliklere göre eldeki araçları listelesin
     */
    String marka;
    String model;
    int yas;
    int km;
    int fiyat;

    public Arac(){

    }

    public Arac(String marka, String model, int yas, int km, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yas = yas;
        this.km= km;
        this.fiyat = fiyat;
    }


    @Override
    public String toString() {
        return "Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yas=" + yas +
                ", km=" + km +
                ", fiyat=" + fiyat +
                '}' + "\n";
    }
}
