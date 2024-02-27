package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk.tasks_iklhali;

import java.util.Scanner;

public class Task06__t18yas_Kucuk_Buyuk {

	public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan cinsiyetini girmesini isteyin.
		Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.

		Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("cinsiyeti giriniz: ");
		String cinsiyet = scan.next();


		if ( cinsiyet.equalsIgnoreCase("Erkek")) {
			System.out.println("yasini giriniz");
			int yas = scan.nextInt();
			if (yas<18) {
				System.out.println("Erkek Cocuk");
			} else if (yas>=18) {
				System.out.println("Adam");
			}
		}
		if (cinsiyet.equalsIgnoreCase("Kadin")) {
			System.out.println("yasini giriniz");
			int yas = scan.nextInt();
			if (yas<18) {
				System.out.println("Kiz Cocugu");
			} else if (yas>=18) {
				System.out.println("Kadin");{

				}
			}
		}










	}
}































