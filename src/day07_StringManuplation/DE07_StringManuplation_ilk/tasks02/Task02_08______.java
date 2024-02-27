package day07_StringManuplation.DE07_StringManuplation_ilk.tasks02;

import java.util.Scanner;

public class Task02_08______ {
    public static void main(String[] args) {
        /*  TASK :
				StringMethods:
				girilen  bir strngin ikinci yarisini print eden code create ediniz
				uzunluk tek ise 2 ye bölünemez yazdırın
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
		 */

        // ek olarak tasks 10 - 15 arası 6 soruyu yapalım

        Scanner scan = new Scanner(System.in);
        System.out.println("bir veri giriniz: ");
        String str1 = scan.nextLine();
        int yarisi = str1.length()/2;
        System.out.println(yarisi);

        System.out.println(str1.substring(yarisi));






    }
}
