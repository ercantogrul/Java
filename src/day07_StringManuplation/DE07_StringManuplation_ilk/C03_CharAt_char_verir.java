package day07_StringManuplation.DE07_StringManuplation_ilk;

import java.util.Scanner;

public class C03_CharAt_char_verir {
    public static void main(String[] args) {
         /*
        charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
        Çoooğğğ önemli ->  index değeri her zaman 0'dan başlar
         */
        //bir String ifadenin son karakteri ->charAt(length -1).indexdir==============
        //bir String ifadenin ilk karakteri ->charAt(0).indexdir======================

        //task-> Girilen bir String ifadenin ortadaki karakterini print eden code create ediniz

        // Trick->charAt()index boyutunu geçerse RTE verir.


        Scanner input = new Scanner(System.in);
        System.out.println("agam bişeyler giresen :");     // bir metin girilmesini istiyoruz.
        String str = input.nextLine();


        System.out.println(str);                           // girlen metni okuttuk
        char ch = str.charAt(0);                           // str de  tanimlanan metnin o ile ilk karekteri
        System.out.println(ch);                            // ilk karekteri okuttuk

        // str nin son karekterini prit edin
        System.out.println(str.charAt(str.length()-1));    // son karekteri okuttuk.
        char sonCarecter = str.charAt(str.length()-1);   //son karekteri tanimlayip char a tanimladik.
        System.out.println(sonCarecter );                    //  son karekteri okuttuk.


        System.out.println("===================="); //=======================================
        String str1 ="Merhaba Dunya";
        char ch1 =65;   System.out.println(ch1);  // A
        char ch2 ='0';  System.out.println(ch2);  // 0
        char ch3 = 'M';  System.out.println(ch3);  // M
        char ch4 =str1.charAt(5); System.out.println(ch4); // b





    }

}
