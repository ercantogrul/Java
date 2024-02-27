package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk.tasks_iklhali;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
		/*
		Task->
		Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
		“Eşkenar üçgen" yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen"
		yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen" print eden code create ediniz.
		 
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("ucgenin kenar uzunluklarini giriniz");
        int k1 = scan.nextInt();
        int k2 = scan.nextInt();
        int k3 = scan.nextInt();

        //1.yontem
        String durum;
        durum = k1==k2 && k1==k3 ? "Eskener ucgen" : k1 == k2 ||  k3 ==k2 ||k1==k3? "ikizkenar ucgen" : "cesitkenar ucgen" ;
        System.out.println(durum);

        //ikinci yontem

        if (k1 == k2 && k1 == k3) {
            System.out.println("ucuzkenar ucgen");
        } else if (k1 == k2 || k1 == k3 || k2 == k3) {
            System.out.println("ikizkenar ucgen");

        } else
            System.out.println("cesitkenar ucgen");

        }


    }



