package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk.tasks_iklhali;

import java.util.Scanner;

public class Task04__Character_Class_char_ileAlakali {

	public static void main(String[] args) {
		/*Task->
		 Kullanicidan bir character alin.
		 Bu character buyuk harf ise "Buyuk Harf"
		 Bu character kucuk harf ise "Kucuk Harf"
		 Bu character harf degil ise "Harf Degil"  print eden code create ediniz.
		*/


		System.out.println("characteri giriniz");
		Scanner scan = new Scanner(System.in);
		char ch =scan.next().charAt(0);


		if( ch>='A' && ch<= 'Z') {
			System.out.println("buyuk harftir");
		} else if  ( ch>='a' && ch<= 'z') {
			System.out.println("kucuk harftir");
		}
		// ikinci yöntem===Character== Class indaki method larla daha kolay cözülür. bu Class char ile alakali cozüm üreten method lari veriri===

		if (Character.isUpperCase(ch)) {
			System.out.println("buyuk harftir");
		} else if (Character.isLowerCase(ch)) {
			System.out.println("kucuk harftir");
		}else System.out.println("harf degildir");


	}

}
