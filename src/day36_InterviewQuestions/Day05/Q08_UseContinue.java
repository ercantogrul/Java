package day36_InterviewQuestions.Day05;

import java.util.Scanner;

public class Q08_UseContinue {

        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak sekilde yazdiriniz,
        //  bosluk veya a harfi geldiginde bunlari yazmasin

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("String bir ifade giriniz");
        String str = scanner.nextLine(); //Girilen bir stringin harflerini teker

        //str= str.trim().replace(" ","").replace("a","");

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i,i+1).equalsIgnoreCase("a") || str.substring(i,i+1).equalsIgnoreCase(" ") ){

            }else {
                System.out.println(str.charAt(i));
            }
        }


    }

}
