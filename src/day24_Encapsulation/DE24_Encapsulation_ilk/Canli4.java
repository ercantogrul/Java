package day24_Encapsulation.DE24_Encapsulation_ilk;

public class Canli4 {
    private String tur;
    private int dYili;
    // aynını canli4 de yapalım tekrar
    public Canli4() {
    }

    public Canli4(String tur, int dYili) {
        tur = turuDuzenle(tur);
        this.tur = tur;
        // usttek, 2 satır yerine setTur(tur)
        this.dYili = dYili;
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
        tur = turuDuzenle(tur);
        this.tur = tur;
    }

    public int getdYili() {
        return dYili;
    }

    public void setdYili(int dYili) {
        this.dYili = dYili;
    }

    private String turuDuzenle(String tur){
        tur = tur.substring(0,1).toUpperCase();
        switch (tur) {
            case "I","H","B" : break;
            default:
                System.out.println("hatalı Tür girişi");
        }
        return tur;
    }
}
