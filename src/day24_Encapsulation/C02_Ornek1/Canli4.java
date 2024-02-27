package day24_Encapsulation.C02_Ornek1;

public class Canli4 {
    private  String tur;
    private int dYili;
    public Canli4() {
    }

    public Canli4(String tur, int dYili) {
        tur =turuDuzenle(tur);
        this.tur = tur;
        this.dYili = dYili;
    }
    public String getTur() {
        switch (tur){
            case "I" : tur="INSAN";break;
            case "H" : tur="HAYVAN";break;
            case "B" : tur="BITKI";break;
        }
        return tur;
    }
    public void setTur(String tur) {
        tur =turuDuzenle(tur);
        this.tur = tur;

    }

    public int getdYili() {
        return dYili;
    }

    public void setdYili(int dYili) {
        this.dYili = dYili;
    }
    
    public String turuDuzenle (String tur){
        tur =tur.substring(0,1).toUpperCase();
        switch (tur){
            case "I","H" ,"B" : break;
            default:
                System.out.println("hatali Tür girisi");

        }
        this.tur = tur;
        return tur;
    }
}


