package day36_InterviewQuestions.Day04;

import java.util.Scanner;

public class Q10_OddIndexNumber {
    // indexi tek sayi olan karakterleri yazdiran bir code create ediniz

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("bir metin giriniz :");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i))%2==0){
            } else {
                System.out.print(str.charAt(i)+" ");
            }
        }


    }

}
