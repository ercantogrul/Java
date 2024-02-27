package day20_Constructor.Okul_ic_ice;

public class Main {
    public static void main(String[] args) {

        Kisi sahis=new Kisi("ayse","adres 1");
        Ogretmen oMen= new Ogretmen(sahis,"matematik");
        //oMen=new Ogretmen(new Kisi("Ogretmen ad","ogretmen adres"),"67825");

        Ogrenci ogr= new Ogrenci(new Kisi("ogrenci ad","ogr adres"),"67825");

        System.out.println(oMen);
        System.out.println(ogr);


    }
}
