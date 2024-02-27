package day07_StringManuplation.DE07_StringManuplation;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {
         /*
        charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
        Çoooğğğ önemli ->  index değeri her zaman 0'dan başlar
         */

        //bir String ifadenin son karakteri ->charAt(length -1).indexdir
        //bir String ifadenin ilk karakteri ->charAt(0).indexdir


        //task-> Girilen bir String ifadenin ortadaki karakterini print eden code create ediniz


        //System.out.println("name.charAt(99) = " + name.charAt(99));//rte
        // Trick->charAt()index boyutunu geçerse RTE verir.


        Scanner input = new Scanner(System.in);
        System.out.println("agam bişeyler giresen :");
        String str = input.nextLine();

        char ch = str.charAt(0);
        System.out.println(str);
        System.out.println(ch);
        // str nin son karekterini prit edin
        System.out.println(str.charAt(str.length()-1));



    }

}
