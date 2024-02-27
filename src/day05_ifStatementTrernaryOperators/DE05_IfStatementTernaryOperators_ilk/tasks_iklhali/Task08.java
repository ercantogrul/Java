package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk.tasks_iklhali;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan password girmesini isteyin.
Girdiği password 5’e bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("sifre giriniz: ");
		int sifre = scan.nextInt();
		int sonRakam = sifre % 10;

		if (sifre / 5 >= 1 && sonRakam == 0) {
			System.out.println("5 e bolunen cift sayi");
		} else if (sifre / 5 >= 1 && sonRakam != 0) {
			System.out.println("5 e bolonen tek sayi");
		}
		String durum;
		durum = sifre / 5 >= 1 && sonRakam == 0 ? "5 e bolunen cift sayi" : sifre / 5 >= 1 && sonRakam != 0 ? "5 e bolonen tek sayi" : "tekrar dene";


	}
}