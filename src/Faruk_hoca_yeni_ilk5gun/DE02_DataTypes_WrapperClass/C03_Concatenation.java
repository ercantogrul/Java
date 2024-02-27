package Faruk_hoca_yeni_ilk5gun.DE02_DataTypes_WrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {
        String st1 = "A";
        String st2 = "B";
        String isim = st1+st2; // "AB"
        System.out.println(isim);
        // String , double, long , int
        int sayi = 10;
        int sayi2 = 22;
        String sonuc = isim+sayi;
        System.out.println(sonuc); // AB10
        sonuc = sayi + isim;
        System.out.println(sonuc);// 10AB
        sonuc = sayi+sayi+isim;
        System.out.println(sonuc); // 20AB
        sonuc = isim+sayi+sayi;
        System.out.println(sonuc); // AB1010
        sonuc = isim + (sayi+sayi);
        System.out.println(sonuc); // Ab20
        sonuc = isim+sayi*sayi;
        System.out.println(sonuc); //AB100
        System.out.println("Sonuclar : "+sayi+sayi2);   // sonuclar : 1022
        System.out.println("Sonuclar : "+(sayi+sayi2)); // sonuclar : 32
        // yukarıdakilerin hepsdini deniyoruz
    }
}
