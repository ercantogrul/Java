package day28_Interface.DE28_Interface.Tasks.Task04;

public class Memur implements Personel{
    @Override
    public double maasHesaplama(double saatUcreti, double calismaSuresi) {
        double memurMaasHespla = saatUcreti*calismaSuresi;
        return memurMaasHespla;
    }
}
