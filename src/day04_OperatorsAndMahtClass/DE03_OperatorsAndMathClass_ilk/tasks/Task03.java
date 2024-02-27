package day04_OperatorsAndMahtClass.DE03_OperatorsAndMathClass_ilk.tasks;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Task->
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayi giriniz : ");
		int sayi =scan.nextInt();
		int birlerB = sayi%10;
		int yuzlerB = sayi/100;


		System.out.println("sayinin birler ve yuzlerB rakkamlari toplami = "+ (birlerB+yuzlerB));



		
	}

}
