package day02_DataTyps_WrapperClass.DE03_DataTypes_WrapperClass_Concatenation_ilk;

public class C03_Concatenation__ {
    public static void main(String[] args) {
       // Concatenation degerleri birlestirir.
        // en az bir String deger olamali,
        // + isaretiyle birlestirme yapilir,
        //matematiklte oldugu gibi islem oncelikli islemleri yapar.
        // once parantez ici, sonra carpma veya bölme- daha sonra toplama cikarma.
        // hepsi toplama ise once soldan baslar saga dogru gelir. strin li ifade onde ise birlesme yapar


        String st1 = "A";
        String st2 = "B";
        String isim = st1+st2; // "AB"
        System.out.println(isim);
        // String , double, long , int
        int sayi = 10;
        int sayi2 = 22;
        String sonuc = isim+sayi; // String de sonuc diye bir variable declaration yapilmis.
        System.out.println(sonuc); // AB10

        sonuc = sayi + isim;
        System.out.println(sonuc);// 10AB

        sonuc = sayi+sayi+isim;
        System.out.println(sonuc); // 20AB //toplama isleminde once soldan baslanir saga dogru gidilir.
                                    // once iki sayi oldugu icin onlar toplanmis sonra birlesme yapilmis,

        sonuc = isim+sayi+sayi;
        System.out.println(sonuc); // AB1010

        sonuc = isim + (sayi+sayi);
        System.out.println(sonuc); // Ab20

        sonuc = isim+sayi*sayi;
        System.out.println(sonuc); //AB100 // once carpma islemi sonra birlesme islemi yapilmis
                                    // carpma islemi toplamadan oncelikli oldugu icin once carpma islemi yapmistir.

        System.out.println("Sonuclar : "+sayi+sayi2);   // sonuclar : 1022
        System.out.println("Sonuclar : "+(sayi+sayi2)); // sonuclar : 32    // parantez oncelikli dir.
        // yukarıdakilerin hepsdini deniyoruz
    }
}
