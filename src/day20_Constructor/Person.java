package day20_Constructor;

//Pojo class
public class Person {

    String isim;
    int yas;
    String sehir;

    public Person() {

    }

    public Person(String isim, int yas, String sehir) {
        isim= isim.substring(0,1).toUpperCase()+ isim.substring(1).toLowerCase();
        sehir= sehir.substring(0,1).toUpperCase()+ sehir.substring(1).toLowerCase();

        this.isim=isim;
        this.yas=yas;
        this.sehir=sehir;

    }

   // public Person(String isim1, String sehir1) {
    //    isim=isim1;
     //   sehir=sehir1;
    // }
}
