package day07_StringManuplation.DE07_StringManuplation;

import java.util.Scanner;

public class C12_ValueOf_parse {
    public static void main(String[] args) {
        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
        // Stringlerle matematiksel islemler yapabilmemizi saglar.

        //valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
        //olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.


        // task -> string type verilen iki adet bagıs miktarını toplayan code create ediniz..

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        // Stringi integere donderiyoruz
        int ss = Integer.parseInt(str); // str yi integer e çevir demek
        ss = Integer.valueOf("33"); // 2. yöntem ama bu eski yöntem
        ss++;
        System.out.println(ss);

        // integer i stringe cevirelim
        str = ""+ss;  // integeri string e çevirdik
        System.out.println(str);

        str = String.valueOf(ss); // integeri string e çevirir;



    }
}
