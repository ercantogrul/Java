package day07_StringManuplation.DE07_StringManuplation_ilk._Replace;

public class C02_ {
    public static void main(String[] args) {

        String str = "MerhaBA45 65 selam HH =?+ - ";
        System.out.println(str);
        String s1 = str.replaceAll("\\d", "*");   // tüm sadece rakammlari * yap
        System.out.println(s1);
        s1 = str.replaceAll("\\D", "*");   // tüm rakamm olmayan herseyi * yap
        System.out.println(s1);

        s1 = str.replaceAll("\\s", "*");   // tüm bosluklari * yap
        System.out.println(s1);
        s1 = str.replaceAll("\\S", "*");   // tüm bosluk olmayan herseyi * yap
        System.out.println(s1);

        s1 = str.replaceAll("\\w", "*");   // tüm harf ve rakammlari  * yap
        System.out.println(s1);
        s1 = str.replaceAll("\\W", "*");   // tüm harf ve rakkam disindaki herseyi * yap
        System.out.println(s1);

        s1 = str.replaceAll("[a-z]", "*");   // tüm kücük harfleri * yap
        System.out.println(s1);
        s1 = str.replaceAll("[A-Z]", "*");   // tüm büyük harfleri * yap
        System.out.println(s1);
        s1 = str.replaceAll("[a-zA-Z]", "*");   // tüm  harfleri * yap
        System.out.println(s1);

        s1 = str.replaceAll("[0-9]", "*");   // tüm rakkamlari * yap
        System.out.println(s1);
        s1 = str.replaceAll("[abc]", "*");   // tüm a-b ve c harflerini * yap
        System.out.println(s1);

        /*
          Bir grup data'yi ifade eden kod'lara "Regex" denir.
            "Regex" Regular Expressions in kisaltilmis halidir.

            1)Tum rakamlar ==> [0-9]
            2)Tum kucuk harfler ==> [a-z]
            3)Tum buyuk harfler ==> [A-Z]
            4)Tum harfler ==> [a-zA-Z]
            5)Sesli harfler ==> [aeiouAEIOU]
            6)Space ==> [ ]
            7)Tum rakamlar ve tum harfler ==> [0-9a-zA-Z]
            8)Tum noktalama isaretleri ==> \\p{Punct}

            1)Rakamlar haric tum karakterler ==> [^0-9]
            2)Kucuk harfler haric tim karakterler ==> [^a-z]
            3)Buyuk harfler haric tum karakterler ==> [^A-Z]
            4)Tum harfler haric tum karakterler ==> [^a-zA-Z]
            5)Space haric ==> [^ ]
         */
















    }
}
