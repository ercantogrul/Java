package day20_Constructor.DE20_Constructor;
// Pojo class
public class Person {
    String isim;
    int yas;
    String sehir;

    public Person() {
    }

    public Person(String isim, int yas, String sehir) {
//        isim    =isim.substring(0,1).toUpperCase()  + isim.substring(1).toLowerCase();
//        sehir   =sehir.substring(0,1).toUpperCase() + sehir.substring(1).toLowerCase();
        this.isim = isim;
        this.yas = yas;
        this.sehir = sehir;
    }

    @Override
    public String toString() {
        return "Person={" +
                "isim='" + isim + '\'' +
                ", yas=" + yas +
                ", sehir='" + sehir + '\'' +
                '}';
    }
}





