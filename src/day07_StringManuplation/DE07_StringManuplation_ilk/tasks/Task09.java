package day07_StringManuplation.DE07_StringManuplation_ilk.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista

		 */
        Scanner scan =new Scanner(System.in);
        System.out.println("bir ifade giriniz: ");
        String str = scan.nextLine();
        int yari = str.length()/2;
        String ilkYarisi = str.substring(0,yari);
        System.out.println(ilkYarisi);



    }
}
