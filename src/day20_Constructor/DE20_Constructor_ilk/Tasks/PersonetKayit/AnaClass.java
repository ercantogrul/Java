package day20_Constructor.DE20_Constructor_ilk.Tasks.PersonetKayit;

import java.util.ArrayList;

public class AnaClass {
    // bir Adres clası oluşturun, cadde,postaKodu,şehir,kapıNo alanları olsun
    // Ayrıca bir personel clası olusturun , bu class adSoyad,dogumYılı ve adres alanlarından oluşsun
    // AnaClass da constractor yardımı , PersonelClass tan oluş bir ArrayListe veriler atın
    public static void main(String[] args) {

        ArrayList<Person> liste = new ArrayList<>();
        Adres adres = new Adres("Bay cd",2045,"Berlin","12A");
        Person kisi =new Person("Hasan Kas", 2000,adres);  //birinci yöntem adresi yukarda tanimladik ve icine atadik
        liste.add(kisi);

        kisi =new Person("Mehmet Kara", 1970,new Adres("abc caddesi",9786,"Köln","10C"));
        //ikinci yontem adresi direk new Person a ekledik
        liste.add(kisi);
        kisi =new Person("Mehmet Bakan", 1950,new Adres("klm caddesi",1234,"Duseldorf","11A"));
        liste.add(kisi);

        for (int i = 0; i < liste.size(); i++) {
            kisi= liste.get(i);
            System.out.println(kisi);

        }

        // yukardaki listeyi sadece adSoyad ve sehir olacak sekilde yazdirin

        for (int i = 0; i < liste.size(); i++) {
            kisi= liste.get(i);
            System.out.println(kisi.adSoyad+" "+kisi.adres.sehir);

        }
        //farkli sekillerde veriyi alabiliriz
        for (int i = 0; i < liste.size(); i++) {
            adres = liste.get(i).adres;
            String sehir = adres.sehir;
            //veya
            sehir= liste.get(i).adres.sehir;
            //veya
            kisi = liste.get(i);
            sehir = kisi.adres.sehir;
            String isim = kisi.adSoyad;
            System.out.println(isim+" "+sehir);
            //veya
            System.out.println(liste.get(i).adSoyad+" "+liste.get(i).adres.sehir);


        }



    }
}
