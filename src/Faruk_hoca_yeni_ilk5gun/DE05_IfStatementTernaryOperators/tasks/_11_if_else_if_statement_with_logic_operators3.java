package Faruk_hoca_yeni_ilk5gun.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class _11_if_else_if_statement_with_logic_operators3 {

    public static void main(String[] args) {

    /*  Eğer String null (0) değilse ve String uzunluğu 14 ise ve String "i love java" yı kapsıyorsa
        "String is i love java and 14 character." yazdırınız.

        Eğer String null(0) değilse ve karakter biçimini (büyük, kücük harf) görmezden gelirse,
        "String is I love java" yazdırın. */

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
        if (!str.equals(null) && str.length()==14 && str.contains("i love jave")) {
            System.out.println( "String is i love java and 14 character.");
        } else if (!str.equals(null) && str.equalsIgnoreCase("i love you")) {
            System.out.println("String is I love java");
        }

    }
}
