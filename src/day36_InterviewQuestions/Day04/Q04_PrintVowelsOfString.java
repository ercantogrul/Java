package day36_InterviewQuestions.Day04;

import java.util.Scanner;

public class Q04_PrintVowelsOfString {
    //Get String from user and print just vowels(aeiou) inside String on the console

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir string giriniz: ");
        String str = scanner.nextLine();
        String vowels ="aeiou";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (str.substring(i,i+1).equalsIgnoreCase(vowels.substring(j,j+1))){
                    System.out.print(str.substring(i,i+1)+" ");
                }
            }
        }



    }
}
