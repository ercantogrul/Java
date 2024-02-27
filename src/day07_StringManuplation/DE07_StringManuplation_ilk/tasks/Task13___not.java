package day07_StringManuplation.DE07_StringManuplation_ilk.tasks;

import java.util.Scanner;

public class Task13___not {
    public static void main(String[] args) {

        //Task->  Girilen  String'deki space haric kac tane character kullanildigini print eden code create ediniz.


        Scanner scan =new Scanner(System.in);
        /*
        System.out.println("sitring bir ifade giriniz:");
        String str = scan.nextLine();
        System.out.println(str.length());

        String spaceHaric = str.replaceAll("\\s", "");   // tüm bosluklari sildikten sonraki durum
        System.out.println(spaceHaric.length());

        if (str.contains(" ")){
            System.out.println("space haric karakter sayisi :" + (spaceHaric.length()));
            System.out.println("space sayisi :"+ (str.length()-spaceHaric.length()));
        }else System.out.println("space icermiyor");
         */


        //Example 2: Bir String'deki tum 'a' harflerini 'A' ya ceviriniz.

          System.out.println("sitring bir ifade giriniz:");
        String str2 = scan.nextLine();
        //System.out.println(str2.replaceAll("a", "A"));



        //Example 3: Bir String'deki tum "kara" kelimelerinin yerine "*" koyunuz

        //System.out.println(str2.replaceAll("kara","*"));


        //Example 4: Bir String'deki tum sayilari "*" a ceviriniz
        //           "AC202117004" ==> AC*********

       // System.out.println(str2.replaceAll("\\d","*"));


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

        //Example 5: Verilen bir String de kullanilan noktalama isareti ve rakamlar ve space karakteri haric
        //           tum karakterlerin sayisini bulan kodu yaziniz

        System.out.println("tüm karakter sayisi: "+ (str2.length()));
        String str3= str2.replaceAll("[0-9]","");
        System.out.println("tüm rakkamlar haric : "+ (str3.replaceAll("[0-9]","")));
        str3 =str3.replaceAll(" ","");
        System.out.println("tüm space haric: " + str3);
        str3=str3.replaceAll("\\p{Punct}","");
        System.out.println("tüm noktalama isratleri haric :"+str3);

        System.out.println("noktalama, rakkam ve space nin karakter sayisi: "+ (str2.length()-str3.length()));


        //Example 6: Bir password'un gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
        //           i)Space haric en az sekiz karakter olmali
        //           ii)En az 1 sembol icermeli
        //           iii)En az 1 rakam icermeli
        //           iv)En az 1 buyuk harf icermeli
        //           v)En az 1 kucuk harf icermeli

        String pwd = "B78c? K!m";

        //i)Space haric en az sekiz karakter olmali
        boolean first = pwd.replace(" ", "").length()>7;

        //ii)En az 1 sembol icermeli
        boolean second = pwd.replaceAll("[0-9a-zA-Z ]", "").length()>0;

        //iii)En az 1 rakam icermeli
        boolean third = pwd.replaceAll("[^0-9]", "").length()>0;

        //iv)En az 1 buyuk harf icermeli
        boolean fourth = pwd.replaceAll("[^A-Z]", "").length()>0;

        //v)En az 1 kucuk harf icermeli
        boolean fifth = pwd.replaceAll("[^a-z]", "").length()>0;

        boolean pwdGecerli = first && second && third && fourth && fifth;

        if(pwdGecerli){
            System.out.println("Password'unuz gecerlidir...");
        }else{
            System.out.println("Password'unuz gecerli degildir...");
        }

        //Example 7: Bir String'deki noktalama isaretlerinin sayisini gosteren kodu yaziniz
        String cumle = "Sen yapmazsan, ben ?...";
        int number = cumle.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println("xxx "+number);

        //Example 8: Verilen bir String "Al" ile basliyor ve "x" ile bitiyorsa ekrana "Harika" yazdirin
        //           aksi halde "Normal" yazdirin.


        if ( str2.startsWith("Al") && str2.endsWith("x")){
            System.out.println("harika");
        }else System.out.println("normal");

    }
}
