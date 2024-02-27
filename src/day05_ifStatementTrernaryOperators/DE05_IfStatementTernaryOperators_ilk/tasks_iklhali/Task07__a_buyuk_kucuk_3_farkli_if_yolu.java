package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk.tasks_iklhali;

import java.util.Scanner;

public class Task07__a_buyuk_kucuk_3_farkli_if_yolu {

    public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan bir harf girmesini isteyin.
Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
“a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
“Z” değil ise ekrana “Son büyük harf değil” yazdırın.
		 */

        System.out.println("characteri giriniz");
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);

        //== ilk yöntem ic-ice if ; kesisim kümesi varsa önemli milenyum sorusunda oldugu gibi==

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a') System.out.println("ilk kücük harf");
            else System.out.println("ilk kücük harf  degildir");
        } else {
            if (ch >= 'A' && ch <= 'Z') {
                if (ch == 'Z') System.out.println("ilk kücük harf  degildir");
                else System.out.println("son büyük harf  degildir");
            } else System.out.println("harf degildir");
        }
        //==parantezsis
        if (ch >= 'a' && ch <= 'z')
            if (ch == 'a') System.out.println("ilk kücük harf");
            else System.out.println("ilk kücük harf  degildir");
        else
            if (ch >= 'A' && ch <= 'Z')
            if (ch == 'Z') System.out.println("son büyük harf");
            else System.out.println("son büyük harf  degildir");


            //ücüncu cözöm yöntemi==farkli iki if ; = kesisim kümesi olmadigi icin

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a') {
                    System.out.println("ilk kücük harf");
                } else
                    System.out.println("ilk kücük harf  degildir");
            }

            if (ch >= 'A' && ch <= 'Z') {
                if (ch == 'Z') {
                    System.out.println("son büyük harf");
                } else
                    System.out.println("son büyük harf  degildir");
            }

            //ikinci cözöm yöntemi==farkli iki if (parantezsiz) ; = kesimsim kümesi olmadigi icin

            if (ch >= 'a' && ch <= 'z')
                if (ch == 'a') System.out.println("ilk kücük harf");
                else System.out.println("ilk kücük harf  degildir");

            if (ch >= 'A' && ch <= 'Z')
                if (ch == 'Z') System.out.println("son büyük harf");
                else System.out.println("son büyük harf  degildir");


    }
}
