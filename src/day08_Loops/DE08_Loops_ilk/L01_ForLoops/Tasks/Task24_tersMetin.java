package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task24_tersMetin {

    public static void main(String[] args) {
		/*
		 Task -> girilen  String'in tersini(reverse String) print eden code create ediniz
		 */


        Scanner scan = new Scanner(System.in);
        System.out.println("bir metin giriniz:");
        String str = scan.nextLine();
        int n = str.length();
        String tersMetin ="";

        for (int i = n-1; i >=0; i--) {
            tersMetin =tersMetin+ str.charAt(i);

        } System.out.println(tersMetin);





    }

}
