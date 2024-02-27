package day36_InterviewQuestions.Day04;

import java.util.Scanner;

public class Q05_UsingDoWhileWithCondition {
    /*
        Ask user to enter an integer.
        If the integer is less than 100, tell user "Won!"
        Otherwise tell user "Lost!"
        Lost onunca yaz ve çık
    */

    public static void main(String[] args) {
        metot();
    }

    private static void metot() {

        int i=0;
        while (i>=0){
            Scanner scan1 = new Scanner(System.in);
            System.out.print("Bir sayi giriniz :");
            int sayi = scan1.nextInt();
            if (sayi>100){
                System.out.println("Won");
            }else {
                System.out.println("Lost");break;
            }
        }




    }


}
