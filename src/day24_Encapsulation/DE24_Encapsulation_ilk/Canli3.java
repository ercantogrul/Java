package day24_Encapsulation.DE24_Encapsulation_ilk;

public class Canli3 {
    private String tur;
    private int dYili;

    public Canli3(String tur, int dYili) {
        this.tur = tur; // setTur(tur);
        this.dYili = dYili; // setdYili(dYili)
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {

        this.tur = tur;
    }

    public int getdYili() {
        return dYili;
    }

    public void setdYili(int dYili) {
        this.dYili = dYili;
    }

}
