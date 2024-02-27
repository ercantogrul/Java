package day25_Inheritance._21Inheritance.inh02;

public class Muhasebe extends Personel{

    public String statu;
    public int saatUcreti;
    public int maas;

    public int maasHesapla() {
        return maas=saatUcreti*8*30;
    }


}
