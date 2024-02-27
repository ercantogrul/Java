package day25_Inheritance._21Inheritance.inh05;

public class SirketMain extends Personel {
    public static void main(String[] args) {

        Yonetici mudur = new Yonetici();

        // Personelin her fieldını kullanabiliyor
        // erisim izni olunca
        mudur.maas = 3000;
        mudur.departman = "Destek Birimi";

        // hem kendi hem de personelin metodlarini
        // kullanabiliyor.
        // Erisim izni olunca
        mudur.getMaas();
        mudur.zamYap(10);

    }
}


