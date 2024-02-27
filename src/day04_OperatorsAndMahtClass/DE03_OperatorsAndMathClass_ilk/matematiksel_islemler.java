package day04_OperatorsAndMahtClass.DE03_OperatorsAndMathClass_ilk;

public class matematiksel_islemler {
    public static void main(String[] args) {

        int a = 27;
        int b = 4;

        // Java iki tamsayiyi bolerseniz sonucu tamsayi olarak size verir
        System.out.println(a / b); //     27 / 4 = 6.75 ==> 6
        System.out.println(32 / 5); //   32 / 5 = 6.4 ==> 6

        double c = 27;

        // Eger bolunen sayi veya bolen sayidan double olan varsa sonucu double olarak verir
        System.out.println(c / b); // 27 / 4 = 6.75

        // a'yi b' ye bolup sonucu ondalikli olarak yazdirin

        double sonuc1  = a / b ; // 27 / 4 = 6.75 ==> 6  sonuc1 = 6  //a ve b iki sayi da int dir, bölümleri int olur
                                 //islem 6 olur ve sonuc1 e atanir. yazdirinca double sayi oldugu icin 6.0 yazdirir.
        System.out.println("Sonuc1 : " + sonuc1 ); // 6.0

        //==ONEMLI ==int iki sayinin islemi double a castin yapinca================
        double sonuc2 = (double)(a/b) ;  // int olan iki sayi parantez icinde islemi 6 olur, double sayiya castin yapinca yine 6 olur.
        System.out.println("Sonuc2 : " + sonuc2 ); // 6.0  // yazdirinca 6.0 cikar

        double sonuc3 = (double)a / b ; // ama parantez olmazsa casting a ya yapilir ve sayi a 27.0 olur.
        System.out.println("Sonuc3 : " + sonuc3 ); // 6.75   // 27.0 iri 4 e bölününce 6.75 olur

//=========================================================================================
        System.out.println(2567 / 10 ); // 256.7 ==> 256
        System.out.println(2567 % 10 ); // 7

        System.out.println(256 / 10 ); // 25.6 ==> 25
        System.out.println(256 % 10 ); // 6

        System.out.println(25 / 10 ); // 2.5 ==> 2
        System.out.println(25 % 10 ); // 5

        System.out.println(2 / 10 ); // 0.2 ==> 0
        System.out.println(2 % 10 ); // 2





    }
}
