package day03_ScannerClassAndType_Casting.DE03_ScannerClassAndTypeCasting_ilk.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)
		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("vize notunuzu giriniz");
        double vize = scan.nextInt();

        System.out.println("proje notunuzu giriniz");
        double proje = scan.nextInt();

        System.out.println("sonSinav notunuzu giriniz");
        double sonSinav = scan.nextInt();

        System.out.println("not ortalamasi = "+((vize*0.3)+(proje*0.2)+(sonSinav*0.5)));

        /*

        Scanner scan = new Scanner(System.in);
        System.out.println("vize notunuzu giriniz");
        int vize = scan.nextInt();

        System.out.println("proje notunuzu giriniz");
        int proje = scan.nextInt();

        System.out.println("sonSinav notunuzu giriniz");
        int sonSinav = scan.nextInt();

        double greade = ((vize*0.3)+(proje*0.2)+(sonSinav*0.5));
        System.out.println("not ortalamasi = "+ greade);

        yada bu sekilde yapilir
         */


    }
}

