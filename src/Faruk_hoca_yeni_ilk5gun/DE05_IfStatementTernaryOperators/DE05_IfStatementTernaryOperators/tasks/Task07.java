package Faruk_hoca_yeni_ilk5gun.DE05_IfStatementTernaryOperators.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan bir harf girmesini isteyin.
Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
“a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
“Z” değil ise ekrana “Son büyük harf değil” yazdırın.
		 */
        System.out.print("Karekteri giriniz : ");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            if (ch=='a') System.out.println("ilk kucuk harftir");
            else System.out.println("ilk kucuk harf değildir");
        } else {
            if (ch >= 'A' && ch <= 'Z') {
                if (ch=='Z') System.out.println("Son Büyük harftir");
                else System.out.println("Son büyük harf değildir");
            } // else System.out.println("Harf değildir");
        }

        // 2. yöntem
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a') System.out.println("ilk kucuk harftir");
            else System.out.println("ilk kucuk harf değildir");
        }
        if (ch >= 'A' && ch <= 'Z') {
            if (ch == 'Z') System.out.println("Son Büyük harftir");
            else System.out.println("Son büyük harf değildir");
        }


    }

}
