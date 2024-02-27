package Faruk_hoca_yeni_ilk5gun.DE05_IfStatementTernaryOperators.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
		/*
		Task->
		 Kullanıcıdan bir yıl alın eğer yıl 1000’e tam bölünüyorsa ekrana “Milenyum"
		Eğer yıl 100’e bölünüyorsa ekrana “Yüzyıl"
		Eğer yıl 10’a bulunuyorsa ekrana “Onyıl" print eden code create ediniz.
		 */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yılı giriniz : ");
        int yil = scanner.nextInt();
        boolean milenyum = yil%1000== 0;
        boolean yuzyil   = yil%100 == 0;
        boolean onyil    = yil%10  == 0;
        if (milenyum) {
            System.out.println("Milenyum");
        } else {
            if (yuzyil) {
                System.out.println("Yuzyıl");
            } else {
                if (onyil) {
                    System.out.println("decade");
                } else {
                    System.out.println("Hiçbiri");
                }
            }
        }
//        if (milenyum) System.out.println("milenyum");
//        else if (yuzyil) System.out.println("yuzyıl");
//        else if (onyil) System.out.println("decade");
//        else System.out.println("Hiçbiri");




    }
}

	

