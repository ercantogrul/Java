package Faruk_hoca_yeni_ilk5gun.DE05_IfStatementTernaryOperators.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
		/*Task->
		 Kullanicidan bir character alin.
		 Bu character buyuk harf ise "Buyuk Harf"
		 Bu character kucuk harf ise "Kucuk Harf"
		 Bu character harf degil ise "Harf Degil"  print eden code create ediniz.
		*/

        System.out.print("Karekteri giriniz : ");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk harftir");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Kucuk harftir");
        } else System.out.println("Harf değildir");

		// 2. yöntem
        if (Character.isUpperCase(ch)) {
            System.out.println("Buyuk harftir");
        } else if (Character.isLowerCase(ch)) {
            System.out.println("Kucuk harftir");
        } else System.out.println("Harf değildir");


    }

}
