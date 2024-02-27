package day21_StaticKeyword.DE21_StaticKeyWord.Tasks.Task02;

public class ElektrikHesabi {
    int toplamTuketim;
    double oran;
    double fatura;

    public ElektrikHesabi() {
    }
    public ElektrikHesabi(int toplamTuketim, double oran, double fatura) {
        this.toplamTuketim = toplamTuketim;
        this.oran = oran;
        this.fatura = fatura;
    }
    @Override
    public String toString() {
        return "ElektrikHesabi{" +
                "toplamTuketim=" + toplamTuketim +
                ", oran=" + oran +
                ", fatura=" + fatura +
                '}';
    }
    public void tuketimEkle (){

        toplamTuketim += toplamTuketim;
        this.toplamTuketim =toplamTuketim;

    }
    public void odenecekTutar(){
        double fatura =  (toplamTuketim*0.7);
    }
}
