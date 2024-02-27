package day02_DataTyps_WrapperClass.DE03_DataTypes_WrapperClass_Concatenation_ilk;

public class C04_WrapperClass__ {
    public static void main(String[] args) {
    /*
           Note: Java primitive data turleri icin hazir method olusturamaz ANCAK
           primitive data turleri icin de hazir method'lar kullanabilecek Wrapper class'lar olusturmustur

                 Primitive         Wrapper
                    byte     ==>    Byte
                    short    ==>    Short
                    ** int   ==>    Integer
                    long     ==>    Long
                    float    ==>    Float
                    double   ==>    Double
                    boolean  ==>    Boolean
                    ** char  ==>    Character
     // Wrapper Classlar arasinda casting OLMAZ:

     // wrapper Class'lar primitive data türleri ile poblemsiz olarak atama yapilabili
     ör: int
        */
    int sayi_a =5;
    Integer sayi_b = sayi_a;
    int say4 = sayi_b;
    //burada önemli bir konu
    //say4. yazinca methodlar gelmez iken
   // sayib. yazinca methodlar geliyor.

        System.out.println("=======Wrapper Class in en önemli METHOD lari===========");
        System.out.println("=========1-Integer.parseInt()============");

        // **icinde sayisal ifadeler bulunan bir String verildiginde Matematiksel islem gerekirse
        //Integer.parseInt( ) ile int' cevirebiliriz
        String a = "22"; // ama sayidan baska birsef olamaz ör "22c" olamaz
        String b = "33";
        // int i = a+b;  sekilde yazinca sonra kirmizi cizgi üzerinden basinca yapilir
        System.out.println(Integer.parseInt(a) + Integer.parseInt(b)); // 55 //  saklinde yazdirilir

//====önemli bir konu===================
        System.out.println("=======2-Character.isDigit()==============");
        System.out.println("=======3-Character.isLetter()==============");
        System.out.println("=======4-Character.isWhitespace()==============");
        char ch = '7';
        System.out.println(Character.isDigit(ch)); // karekter sayi mi  --cikti true
        System.out.println(Character.isLetter(ch)); // karekter harf mi-- cikti false
        System.out.println(Character.isWhitespace(ch)); // karekter bosluk mu ' ' gibi..-- cevap false


        System.out.println("=======5-Integer.MAX_VALUE;==============");
        System.out.println("=======6-Integer.MIN_VALUE;==============");
        int sayi1 = 25;
        int sayi2 = Integer.MAX_VALUE;
        // Integer.MAX_VALUE-- integer dataType maxsimum degerini verir
        // Integer.MIN_VALUE-- integer dataType minimum degerini verir
        // Integer.max(sayi1, sayi2)---sayi1 ve sayi2 arasinda enBuyuk olani veriri.
        // Integer.min(sayi1, sayi2)---sayi1 ve sayi2 arasinda enKucuk olani veriri.

        System.out.println(sayi2);                       //    2147483647
        System.out.println(Integer.MIN_VALUE);           //   -2147483648
        int sonuc = Integer.max(sayi1, sayi2);

        System.out.println("Buyuk olan : " + sonuc);
        System.out.println("Buyuk olan : " + Integer.max(sayi1, sayi2));
        System.out.println("Küçük olan : " + Integer.min(sayi1, sayi2));
        //===============================================================
        int s1 = 11, s2 = 21, s3 = 51, s4 = 6;
        int b1 = Integer.max(s1,s2);
        int b2 = Integer.max(s3,s4);
        int enB = Integer.max(b1,b2);


        //int enB = Integer.max(Integer.max(s1,s2),Integer.max(s3,s4));// bu sekildede yapilabilir

        System.out.println("en Büyük sayi= "+Integer.max(b1,b2));
        System.out.println();
        //============================================================
        int num1=256, num2=125, num3=5;
        // Print one line max numer
        // Use wrapper class
        System.out.println("en Büyük sayi="+" "+Integer.max(Integer.max(num1,num2),num3));
        //==================================================================
        int num4=256;
        int num5=125;
        double num6=5;

        System.out.println("en Büyük sayi="+" "+Double.max(Integer.max(num4,num5),num6));

        //int enBuyuk= Integer.max(num1,Integer.max(num5,num6)); //bu sekildede olabilir
        //System.out.println(enBuyuk);
        //==================================================================

        // 4 adet int sayı veriliyor, en küçük olanı yazdırınız (* tek bir satırda)



    }
}
