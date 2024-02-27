package day28_Interface.DE28_Interface.Tasks.Task04;

public class Runner {
    public static void main(String[] args) {
        Isci isci = new Isci();
        double iscininMaasi=isci.maasHesaplama(20,200);
        System.out.println("iscininMaasi = " + iscininMaasi);

        Memur memur = new Memur();
        double memurunMaasi=memur.maasHesaplama(25,150);
        System.out.println("memurunMaasi = " + memurunMaasi);

    }
}
