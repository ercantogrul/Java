package day24_Encapsulation.DE24_Encapsulation_ilk;

public class Canli2 {
    private String tur;
    private int dYili;
        // aynını canli4 de yapalım tekrar
    public Canli2() {
    }
    public Canli2(String tur, int dYili) {
        setTur(tur);
        setdYili(dYili);

    }
    //    public void setTur(String tur){
//        this.tur = tur;
//    }
//    public String getTur(){
//        return this.tur; // veya bu da aynısıdır -> return tur;
//    }
    public String getTur() {
        switch (tur) {
            case "I" : tur="Insan";break;
            case "H" : tur="Hayvan";break;
            case "B" : tur="Bitki";break;
        }
        return tur;
    }
    public void setTur(String tur) {
        tur = tur.substring(0,1).toUpperCase();
        switch (tur) {
            case "I","H","B" : break;
            default:
                System.out.println("hatalı Tür girişi");
        }
        this.tur = tur;
    }

    public int getdYili() {
        return dYili;
    }

    public void setdYili(int dYili) {
        this.dYili = dYili;
    }
}
