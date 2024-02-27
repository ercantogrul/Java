package day07_StringManuplation.DE07_StringManuplation_ilk;

import java.util.Scanner;

public class C09_replaceAll_____ {
    public static void main(String[] args) {
        String str = "1Ja4va 8C9a2n5d1i1r.";

        str= str.replace("1","");
        System.out.println(str); // Ja4va 8C9a2n5dir.
        //önemli===========================
        System.out.println(str.replaceAll("v","V").replaceAll("n","N")); //olur
       // System.out.println(str.replaceAll('v','V').replaceAll('n','N')); //olmaz

        // Sayilarin tamamindan kurtulmak istersek
        // replace() yeterli olmaz

        // java da sayilar, ozel karakterler, alfabetik karalkterlerin
        // tumuyle islem yapmak isterseniz
        // replaceAll(istenenGrup, yeniDeger)

        // ornegin butun sayilarin yerine "" atamak icin
        str= str.replaceAll("\\d" ,"");
        System.out.println(str); // Java Candir.

        /*
        Regex (Regular Expressions)
            \\s : space	 	\\S : space olmayan hersey
            \\s+ : yanyana birden fazla space
            \\d : digits		\\D : digit olmayan hersey
            \\w : harf veya rakam	\\W : harf veya rakam olmayan hersey

         */

        String str1 = "MerhaBA45 65 selam HH =?+ - ";
        System.out.println(str1);
        String s1 = str1.replaceAll("\\d", "*");   // tüm sadece rakammlari * yap
        System.out.println(s1);
        s1 = str1.replaceAll("\\D", "*");   // tüm rakamm olmayan herseyi * yap
        System.out.println(s1);

        s1 = str1.replaceAll("\\s", "*");   // tüm bosluklari * yap
        System.out.println(s1);
        s1 = str1.replaceAll("\\S", "*");   // tüm bosluk olmayan herseyi * yap
        System.out.println(s1);

        s1 = str1.replaceAll("\\w", "*");   // tüm harf ve rakammlari  * yap
        System.out.println(s1);
        s1 = str1.replaceAll("\\W", "*");   // tüm harf ve rakkam disindaki herseyi * yap
        System.out.println(s1);

        s1 = str1.replaceAll("[a-z]", "*");   // tüm kücük harfleri * yap
        System.out.println(s1);
        s1 = str1.replaceAll("[A-Z]", "*");   // tüm büyük harfleri * yap
        System.out.println(s1);
        s1 = str1.replaceAll("[a-zA-Z]", "*");   // tüm  harfleri * yap
        System.out.println(s1);

        s1 = str1.replaceAll("[0-9]", "*");   // tüm rakkamlari * yap
        System.out.println(s1);
        s1 = str1.replaceAll("[abc]", "*");   // tüm a-b ve c harflerini * yap
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

        //örnek ============
        // Kullanicidan bir metin isteyin
        // metin'deki tum sayilari ve space disindaki ozel karakterleri temizleyin
        // metnin sonuna da . koyun.
        // ornek    input : J1*2av4.a C67//an=+dir--_
        //          output "Java Candir."

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen istediginiz mesaji girin");
        String metin = scanner.nextLine();

        // once sayilardan kurtulalim
        metin = metin.replaceAll("\\d",""); // J*av.a C/an=+dir--

        // ozel karakterlerden kurtulmak istedigimizde, space de kaybolur
        // bunun icin once space'i korumaya almaliyiz
        // artik metnimizde sayi yok, onun icin space yerine herhangi bir sayiyi atayalim
        metin = metin.replaceAll("\\s","1");

        // ozel karakterlerden kurtulalim
        metin = metin.replaceAll("\\W",""); // Java1Candir

        // space yerine atadigimiz 1'i yeniden space yapalim

        metin = metin.replaceAll("1"," "); // Java Candir
        metin= metin.replace("_","");
        metin = metin + ".";

        System.out.println(metin); // Java Candir.






    }
}
