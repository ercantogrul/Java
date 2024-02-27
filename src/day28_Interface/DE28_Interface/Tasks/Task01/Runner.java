package day28_Interface.DE28_Interface.Tasks.Task01;

public class Runner {
    public static void main(String[] args) {


        Daire alanD = new  Daire();
        alanD.alan(3,4,4);
        Daire cevreD = new Daire();
        cevreD.cevre(1,1,4);

        Kare alanK = new Kare();
        alanK.alan(5,1,1);
        Kare cevreK = new Kare();
        cevreK.cevre(6,6,1);


        Dikdortgen alanDD = new Dikdortgen();
        alanDD.alan(12,10,5);
        Dikdortgen cevreDD = new Dikdortgen();
        cevreDD.cevre(12,10,1);
    }

}
