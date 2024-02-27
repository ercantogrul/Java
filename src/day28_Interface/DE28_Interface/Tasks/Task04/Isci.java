package day28_Interface.DE28_Interface.Tasks.Task04;

public class Isci implements Personel {

    @Override
    public double maasHesaplama(double saatUcreti, double calismaSuresi) {
        double isciMaasHesabi = saatUcreti * calismaSuresi;
        return isciMaasHesabi;
    }
}
