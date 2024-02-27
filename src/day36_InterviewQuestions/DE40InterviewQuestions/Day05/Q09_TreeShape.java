package day36_InterviewQuestions.DE40InterviewQuestions.Day05;

import java.util.Scanner;

public class Q09_TreeShape {
    // Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu
    // kullanicidan aliniz..
    // Not :govde sabit sayi olsun
    /* tac uzunlugu -> 6 iken

    ^
    ^^
    ^^^
    ^^^^
    ^^^^^
    ^^^^^^
    |||
    |||
    |||
    |||
    |||
     */
    public static void main(String[] args) {
        int tacUzunlugu=10;
        for (int i = 0; i <tacUzunlugu ; i++) {
            for (int j = 0; j <tacUzunlugu-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i+1 ; j++) {
                System.out.print("^ ");
            }
            System.out.println();
        }
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <tacUzunlugu-1 ; j++) {
                System.out.print(" ");
            }
            System.out.println("|||");
        }


    }



}
