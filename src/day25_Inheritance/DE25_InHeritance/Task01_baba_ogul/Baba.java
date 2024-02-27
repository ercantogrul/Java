package day25_Inheritance.DE25_InHeritance.Task01_baba_ogul;
import java.util.ArrayList;

public class Baba {
    static ArrayList<String> cocuklar = new ArrayList<>();
    static String Vatandas = "tc";
    String isim;
    String soyisim = "Cool";
    int yas;
    private String tc = "123456";// miras bırakamaz
    public void yuzme() {
        System.out.println("Cool ailesi on numara yüzer");
    }
    public String babaminTc() {//Babanın tc bilgileri okumak ,görmek için yapılan metot
        return tc;
    }

    public String getTc() {  //  Babanın tc bilgileri okumak ,görmek icin get kullaniliyor
        tc =tc.substring(0,4)+"*****";
        return tc;
    }

    public void babaminTcGuncelle(String tc) {
        this.tc = tc;
    }
    public Baba() {
        System.out.println("Baba constructor çalıştı");
    }
    public Baba(String isim) {
        System.out.println("Baba p'li constructor çalıştı");
    }
    @Override
    public String toString() {
        return "Baba{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                ", tc='" + tc + '\'' +
                '}';
    }
}