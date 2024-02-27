package day25_Inheritance.DE25_InHeritance.Task01_baba_ogul;

public class Cocuk extends Baba{
    private String tc="3456789";
    public void minecraft(){
        System.out.println("Çok iyi minecraft oynar");
    }

    public Cocuk(String isim ){
        cocuklar.add(isim);

    }
    @Override
    public String toString() {
        return "Cocuk{" +
                "tc='" + tc + '\'' +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +", Vatandaş:"+ Vatandas+
                '}';
    }
}












