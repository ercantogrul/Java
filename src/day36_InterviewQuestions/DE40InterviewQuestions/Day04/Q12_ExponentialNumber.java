package day36_InterviewQuestions.DE40InterviewQuestions.Day04;

import java.util.Scanner;

public class Q12_ExponentialNumber {
    //Get 2 numbers from the user.
    //first number base
    //second number Top
    //Write a code that calculates the prime of a number.
    // 2, 3 --> 2^3 = 2*2*2= 8

    // 4, 3 --> 4^3= 4*4*4 = 64


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen taban ve us giriniz :");
        int taban = scan.nextInt();
        int us = scan.nextInt();

        double sonuc=1;
        for (int i = 0; i <us ; i++) {
            sonuc *= taban;
        }
        System.out.println(sonuc);
        // veya
        sonuc = Math.pow(taban,us);
        System.out.println(sonuc);

    }


}
