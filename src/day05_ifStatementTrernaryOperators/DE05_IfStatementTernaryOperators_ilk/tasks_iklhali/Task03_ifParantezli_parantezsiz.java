package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk.tasks_iklhali;

import java.util.Scanner;

public class Task03_ifParantezli_parantezsiz {

    public static void main(String[] args) {
		/*
		Task->
		 Kullanıcıdan bir yıl alın eğer yıl 1000’e tam bulunuyorsa ekrana “Milenyum"
		Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl"
		Eğer yıl 10’a bulunuyorsa ekrana “Onyıl" print eden code create ediniz.

		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir yil giriniz");
        int yil = scan.nextInt();
        boolean milenyum = yil%1000==0;
        boolean yuzyil = yil%100==0;
        boolean onyil = yil%10==0;

        //===birinci cozum===

        String durum;
        durum= milenyum? "milenyum" : yuzyil? "yuzyil" : onyil? "onyil": "hicbiri";
        System.out.println(durum);

        //ikinci cozum if li parantezsiz

        if (milenyum) System.out.println("milenyum");
        else if (yuzyil) System.out.println("yuzyil");
        else if (onyil) System.out.println("0nyil");
        else System.out.println("hicbiri");

        //ucuncu cozum ==if parantezli===

        if (milenyum) {
            System.out.println(" ");
        }else {
            if (yuzyil  ){
                System.out.println("yuzyil ");
            }else {
                if (onyil ) {
                    System.out.println("onyil" );
                }else {
                    System.out.println("hicbiri");
                }
            }
        }




    }
}

	

